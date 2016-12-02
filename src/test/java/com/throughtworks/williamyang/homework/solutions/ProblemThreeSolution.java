package com.throughtworks.williamyang.homework.solutions;

import com.throughtworks.williamyang.homework.problems.galaxyOnFire.EnglishLexer;
import com.throughtworks.williamyang.homework.problems.galaxyOnFire.EnglishParser;
import com.throughtworks.williamyang.homework.problems.galaxyOnFire.RomanNumberLexer;
import com.throughtworks.williamyang.homework.problems.galaxyOnFire.RomanNumberParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

public class ProblemThreeSolution {

    final static Logger log = Logger.getLogger(ProblemThreeSolution.class.getName());

    String input_test2 =
                    "glob glob Silver is 34 Credits\n" +
                    "glob prok Gold is 57800 Credits\n" +
                    "pish pish Iron is 3910 Credits\n"   ;

    String input_test1 =  "glob is I\n" +
            "prok is V\n" +
            "pish is X\n" +
            "tegj is L\n" ;

    String input_test03=
            "how much is pish tegj glob glob ?\n" +
            "how many Credits is glob prok Silver ?\n" +
            "how many Credits is glob prok Gold ?\n" +
            "how many Credits is glob prok Iron ?\n" ;
    String input =
            "glob is I\n" +
            "prok is V\n" +
            "pish is X\n" +
            "tegj is L\n" +
            "glob glob Silver is 34 Credits\n" +
            "glob prok Gold is 57800 Credits\n" +
            "pish pish Iron is 3910 Credits\n" +
            "how much is pish tegj glob glob ?\n" +
            "how many Credits is glob prok Silver ?\n" +
            "how many Credits is glob prok Gold ?\n" +
            "how many Credits is glob prok Iron ?\n" +
            "how much wood could a woodchuck chuck if a woodchuck could chuck wood ?";



    @Test
    public void test01(){
        ANTLRInputStream in = new ANTLRInputStream(input_test1);
        EnglishLexer lexer = new EnglishLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(tokens);
        EnglishParser.ParseContext parse = parser.parse();
        List<EnglishParser.AssignmentContext> assignments = parse.assignment();
        System.out.println("\n----------assignments--------"+assignments.size());
        for (EnglishParser.AssignmentContext ass : assignments){
            String text1 = ass.getText();
            System.out.print(text1);
        }
    }

    @Test
    public void test02(){
        ANTLRInputStream in = new ANTLRInputStream(input_test2);
        EnglishLexer lexer = new EnglishLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(tokens);
        EnglishParser.ParseContext parse = parser.parse();
        List<EnglishParser.PricingContext> pricing = parse.pricing();
        System.out.println("\n----------pricing--------"+pricing.size());
        for (EnglishParser.PricingContext ass : pricing){
            String text1 = ass.getText();
            System.out.print(text1);
        }
    }

    @Test
    public void test03(){
        ANTLRInputStream in = new ANTLRInputStream(input_test03);
        EnglishLexer lexer = new EnglishLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(tokens);
        EnglishParser.ParseContext parse = parser.parse();
        List<EnglishParser.QuestionContext> questions = parse.question();
        System.out.println("\n----------questions--------"+questions.size());
        for (EnglishParser.QuestionContext ass : questions){
            String text1 = ass.getText();
            System.out.print(text1);
        }
    }

    @Test
    public void testRomanNumber(){

        ANTLRInputStream in = new ANTLRInputStream("II I\n");
        RomanNumberLexer lexer = new RomanNumberLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RomanNumberParser parser = new RomanNumberParser(tokens);
        parser.parseRN();

    }






}
