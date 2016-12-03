package com.throughtworks.williamyang.homework.solutions;

import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Scheduler;
import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Session;
import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Talk;
import com.throughtworks.williamyang.homework.problems.conferenceTrackManagement.Track;
import com.throughtworks.williamyang.homework.problems.trains.DirectedEdge;
import com.throughtworks.williamyang.homework.problems.trains.EdgeWeightedDigraph;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ProblemTwoSolution {

    final static Logger log = Logger.getLogger(ProblemTwoSolution.class.getName());
    static Set<Talk> pool ;

    static String input = "Writing Fast Tests Against Enterprise Rails 60min\n" +
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

    @BeforeClass
    public static void input(){
        pool = new HashSet();

        String[] commands = input.split("\n");
        for(String command: commands){
            try {
                pool.add(Talk.buildTalk(command));
            }catch (Throwable ex){
                log.severe("ERROR at init: "+command);
                throw new RuntimeException(ex);
            }
        }

    }


    @Test
    public void solve(){
        Set<Track> plan = new Scheduler().plan(pool);
        for (Track track: plan){
            System.out.print(track.toString());
        }
    }




}
