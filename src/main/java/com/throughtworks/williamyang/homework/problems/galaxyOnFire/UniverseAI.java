package com.throughtworks.williamyang.homework.problems.galaxyOnFire;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/2.
 */
public class UniverseAI {
    static Map<String,String> decryption = new HashMap<String, String>();
    static Map<String,Integer> pricingDB = new HashMap<String, Integer>();

    public void input(String query){

        parse(query);
    }

    public static void parse(String inputLine){
        ANTLRInputStream in = new ANTLRInputStream(inputLine);
        EnglishLexer lexer = new EnglishLexer(in);
        lexer.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(tokens);
        parser.removeErrorListeners();
        EnglishParser.ParseContext parse = parser.parse();
        boolean unknown = true;

        List<EnglishParser.AssignmentContext> assignments = parse.assignment();
        for(EnglishParser.AssignmentContext ass : assignments){
            unknown = false;
            TerminalNode identifier = ass.IDENTIFIER();
            TerminalNode roman = ass.ROMAN();
            decryption.put(identifier.getText(),roman.getText());
        }

        List<EnglishParser.PricingContext> pricing = parse.pricing();
        for(EnglishParser.PricingContext p : pricing){
            unknown = false;
            TerminalNode decimal = p.DECIMAL();
            List<TerminalNode> identifiers = p.IDENTIFIER();
            int q = roman(trans(identifiers));
            TerminalNode objects = p.OBJECTS();
            pricingDB.put(objects.getText(), (Integer.valueOf(decimal.getText())/q));
        }

        List<EnglishParser.QuestionContext> questions = parse.question();
        for (EnglishParser.QuestionContext question : questions){
            unknown = false;
            io(response(question));
        }

        if (unknown)
            io(response(null));

    }

    private static void io(String sentence){
        System.out.println(sentence);
    }

    private static String response(EnglishParser.QuestionContext question) {
        String answer = null;
        if (question != null) {
            try {
                answer = answer(question);
            } catch (RuntimeException e) {
                answer = "I have no idea what you are talking about(" +e.getMessage()+")";
            }
        }else{
            answer = "I have no idea what you are talking about";
        }
        return answer;
    }


    private static String answer(EnglishParser.QuestionContext question) {

        StringBuilder sb = new StringBuilder();

        if(question.HOWMUCH()!=null){
            List<TerminalNode> identifier = question.IDENTIFIER();
            String answer = trans(identifier);
            for(TerminalNode node : identifier){
                sb.append(node.getText());
                sb.append(" ");
            }
            sb.append(question.IS().getText());
            sb.append(" ");
            sb.append(roman(answer));
            return sb.toString();
        }

        if (question.HOWMANY()!=null){
            String quantity = trans(question.IDENTIFIER());
            String objects = question.OBJECTS().getText();
            int q = roman(quantity);
            if (q==0)
                throw new RuntimeException( "Cannot parsing secret number system!");
            Integer pricing = pricingDB.get(objects);
            if (pricing == null)
                throw new RuntimeException( "cannot find the pricing information in database!");
            for(TerminalNode node : question.IDENTIFIER()){
                sb.append(node.getText());
                sb.append(" ");
            }
            sb.append(question.OBJECTS().getText());
            sb.append(" ");
            sb.append(question.IS().getText());
            sb.append(" ");
            sb.append(pricing*q);
            sb.append(" ");
            sb.append(question.CEDITS());
            return sb.toString();

        }

        throw new RuntimeException("I have no idea what you are talking about");

    }

    private static String trans(List<TerminalNode> identifiers) {
        StringBuilder sb = new StringBuilder();
        for ( TerminalNode node : identifiers){
            String text = node.getText();
            String roman = decryption.get(text);
            if (roman == null)
                throw new RuntimeException( "missing interpretation of text: "+text);
            sb.append(roman);
        }
        return sb.toString();
    }

    public static int roman(String roman){
        ANTLRInputStream in = new ANTLRInputStream(roman);
        RomanNumberLexer lexer = new RomanNumberLexer(in);
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RomanNumberParser parser = new RomanNumberParser(tokens);
        parser.removeErrorListeners();
        RomanNumberParser.ParseRNContext rn = parser.parseRN();
        int rnValue = parser.rnValue;
        return rnValue;
    }

}
