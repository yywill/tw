package com.throughtworks.williamyang.homework.problems.conferenceTrackManagement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by willyyang on 2016/12/2.
 * the goal of Scheduler is greedy to fit to 4pm then try to open another track...
 *
 */
public class Scheduler {


    Set<Track> tracks = new HashSet<Track>();
    int count = 1;

    public Set<Track> plan(Set<Talk> talks){
         return tryToOpenTrack( talks,  new HashSet<Session>());
    }

    public   Set<Track> tryToOpenTrack(Set<Talk> toSchedule, Set<Session> scheduled){
          int toScheduleMinutes =  sum(toSchedule);
          if (toScheduleMinutes <= Session.AFTERNOON_GAP * scheduled.size() ){
              refillAfternoonSession(toSchedule,scheduled);
          }else{
              Track track = new Track(count++);
              tracks.add(track);
              fillMorningSession(track,toSchedule,scheduled );
              fillAfternoonSession(track, toSchedule, scheduled);
              tryToOpenTrack(toSchedule,scheduled );
          }

        return tracks;
    }

    private void fillAfternoonSession(Track track, Set<Talk> toSchedule, Set<Session> scheduled) {
        Session afternoon = Session.buildAfternoon();

        for (Iterator<Talk> iterator = toSchedule.iterator(); iterator.hasNext(); ) {
            Talk talk = iterator.next();
            if (afternoon.fill(talk))
                iterator.remove();
        }

        track.afternoon = afternoon;
        scheduled.add(afternoon);

    }

    private void fillMorningSession(Track track, Set<Talk> toSchedule, Set<Session> scheduled) {
           Session morning = Session.buildMorning();

        for (Iterator<Talk> iterator = toSchedule.iterator(); iterator.hasNext(); ) {
            Talk talk = iterator.next();
            if (morning.fill(talk))
                iterator.remove();
        }

          track.morning = morning;
          scheduled.add(morning);

    }

    private void refillAfternoonSession(Set<Talk> toSchedule, Set<Session> scheduled) {
       for (Session session : scheduled){
           for (Iterator<Talk> iterator = toSchedule.iterator(); iterator.hasNext(); ) {
               Talk talk = iterator.next();
               if (session.refill(talk))
                   iterator.remove();
           }
       }
    }

    private int sum(Set<Talk> toSchedule) {
        int sum = 0;
        for (Talk talk: toSchedule){
            sum += talk.minutes;
        }
        return sum;
    }

}
