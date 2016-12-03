package com.throughtworks.williamyang.homework.solutions;

import com.throughtworks.williamyang.homework.problems.galaxyOnFire.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

public class ProblemThreeSolution {

    final static Logger log = Logger.getLogger(ProblemThreeSolution.class.getName());

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
    public void solve(){
        String[] strings = input.split("\n");
        int count = 1;
        for (String st:strings ){
            UniverseAI.parse(st+" \n ");
        }

    }


}
