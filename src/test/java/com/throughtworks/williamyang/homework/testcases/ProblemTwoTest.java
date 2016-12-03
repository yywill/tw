package com.throughtworks.williamyang.homework.testcases;

import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Scheduler;
import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Talk;
import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Track;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public class ProblemTwoTest {

    final static Logger log = Logger.getLogger(ProblemTwoTest.class.getName());

    static final String input01 = "Writing Fast Tests Against Enterprise Rails 60min";
    static final String input02 = "Rails for Python Developers lightning";
    static final String input = "Writing Fast Tests Against Enterprise Rails 60min\n" +
            "Overdoing it in Python 45min\n" +
            "Lua for the Masses 30min\n" +
            "Ruby Errors from Mismatched Gem Versions 45min\n" +
            "Common Ruby Errors 45min\n" +
            "Rails for Python Developers lightning\n" +
            "Communicating Over Distance 60min\n" +
            "Accounting-Driven Development 45min\n" +
            "Woah 30min\n" +
            "Sit Down and Write 30min\n" +
            "Pair Programming vs Noise 45min\n" +
            "Rails Magic 60min\n" +
            "Ruby on Rails: Why We Should Move On 60min\n" +
            "Clojure Ate Scala (on my project) 45min\n" +
            "Programming in the Boondocks of Seattle 30min\n" +
            "Ruby vs. Clojure for Back-End Development 30min\n" +
            "Ruby on Rails Legacy App Maintenance 60min\n" +
            "A World Without HackerNews 30min\n" +
            "User Interface CSS in Rails Apps 30min" ;


    @Test
    public void test01(){
        Matcher matcher = Talk.PATTERN.matcher(input01);
        log.info("match: "+matcher.matches());
        int sum = matcher.groupCount();
        for(int i = 0; i<= sum; i++){
            String group = matcher.group(i);
            log.info("GROUP "+i+": "+group);
        }
    }

    @Test
    public void test02(){
        Matcher matcher = Talk.PATTERN.matcher(input02);
        log.info("match: "+matcher.matches());
        int sum = matcher.groupCount();
        for(int i = 0; i<= sum; i++){
            String group = matcher.group(i);
            log.info("GROUP "+i+": "+group);
        }
    }


    @Test
    public void test(){
        String[] commands = input.split("\n");
        for (String c : commands){
            Matcher matcher = Talk.PATTERN.matcher(c);
            log.info("match: "+matcher.matches());
            int sum = matcher.groupCount();
            matcher.group(1);
            for(int i = 0; i<= sum; i++){
                String group = matcher.group(i);
                log.info("GROUP "+i+": "+group);
            }

        }
    }




}
