package com.throughtworks.williamyang.homework.testcases;

import com.throughtworks.williamyang.homework.problems.galaxyOnFire.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

public class ProblemThreeTest {

    final static Logger log = Logger.getLogger(ProblemThreeTest.class.getName());

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
    public void test03() {
        ANTLRInputStream in = new ANTLRInputStream(input_test03);
        EnglishLexer lexer = new EnglishLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(tokens);
        EnglishParser.ParseContext parse = parser.parse();
        List<EnglishParser.QuestionContext> questions = parse.question();
        System.out.println("\n----------questions--------" + questions.size());
        int count = 1;
        for (EnglishParser.QuestionContext ass : questions) {
            String text1 = ass.getText();
            System.out.print(count+++": "+text1);
        }
    }


    @Test
    public void test04(){
        ANTLRInputStream in = new ANTLRInputStream(input);
        EnglishLexer lexer = new EnglishLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(tokens);
        EnglishParser.ParseContext parse = parser.parse();

        List<EnglishParser.ExceptionContext> rest = parse.exception();
        for (EnglishParser.ExceptionContext r: rest){
            String text1 = r.getText();
            System.out.print(text1);
        }
    }

    @Test
    public void solve(){
        String[] strings = input.split("\n");
        int count = 1;
        for (String st:strings ){
            UniverseAI.parse(st+" \n ");
        }

    }

    @Test
    public void testRomanNumber(){

        ANTLRInputStream in = new ANTLRInputStream("III\n");
        RomanNumberLexer lexer = new RomanNumberLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RomanNumberParser parser = new RomanNumberParser(tokens);
        parser.parseRN();

    }






}
