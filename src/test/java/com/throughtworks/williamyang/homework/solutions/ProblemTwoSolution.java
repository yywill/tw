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

    /**
     pool
     Writing Fast Tests Against Enterprise Rails 60min
     Overdoing it in Python 45min
     Lua for the Masses 30min
     Ruby Errors from Mismatched Gem Versions 45min
     Common Ruby Errors 45min
     Rails for Python Developers lightning
     Communicating Over Distance 60min
     Accounting-Driven Development 45min
     Woah 30min
     Sit Down and Write 30min
     Pair Programming vs Noise 45min
     Rails Magic 60min
     Ruby on Rails: Why We Should Move On 60min
     Clojure Ate Scala (on my project) 45min
     Programming in the Boondocks of Seattle 30min
     Ruby vs. Clojure for Back-End Development 30min
     Ruby on Rails Legacy App Maintenance 60min
     A World Without HackerNews 30min
     User Interface CSS in Rails Apps 30min
     */
    @BeforeClass
    public static void input(){
        pool = new HashSet();
        pool.add(Talk.buildTalk("Writing Fast Tests Against Enterprise Rails", 60));
        pool.add(Talk.buildTalk("Overdoing it in Python", 45));
        pool.add(Talk.buildTalk("Lua for the Masses", 30));
        pool.add(Talk.buildTalk("Ruby Errors from Mismatched Gem Versions", 45));
        pool.add(Talk.buildTalk("Common Ruby Errors", 45));
        //lightning
        pool.add(Talk.buildTalk("Rails for Python Developers",5));
        pool.add(Talk.buildTalk("Communicating Over Distance", 60));
        pool.add(Talk.buildTalk("Accounting-Driven Development", 45));
        pool.add(Talk.buildTalk("Woah", 30));
        pool.add(Talk.buildTalk("Sit Down and Write", 30));
        pool.add(Talk.buildTalk("Pair Programming vs Noise", 45));
        pool.add(Talk.buildTalk("Rails Magic", 60));
        pool.add(Talk.buildTalk("Ruby on Rails: Why We Should Move On", 60));
        pool.add(Talk.buildTalk("Clojure Ate Scala (on my project)", 45));
        pool.add(Talk.buildTalk("Programming in the Boondocks of Seattle", 30));
        pool.add(Talk.buildTalk("Ruby vs. Clojure for Back-End Development", 30));
        pool.add(Talk.buildTalk("Ruby on Rails Legacy App Maintenance", 60));
        pool.add(Talk.buildTalk("A World Without HackerNews", 30));
        pool.add(Talk.buildTalk("User Interface CSS in Rails Apps", 30));



    }


    @Test
    public void solve(){
        Set<Track> plan = new Scheduler().plan(pool);
        for (Track track: plan){
            System.out.print(track.toString());
        }
    }




}
