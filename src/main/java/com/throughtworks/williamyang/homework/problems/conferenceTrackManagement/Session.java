package com.throughtworks.williamyang.homework.problems.conferenceTrackManagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by willyyang on 2016/12/2.
 */
public class Session {
    public static final String LINE_SEP = "\n";
    public static final int MORNING_MAX=3*60;
    public static final int AFTERNOON_MIN=3*60;
    public static final int AFTERNOON_GAP =60;
    public static final int AFTERNOON_MAX =AFTERNOON_MIN+ AFTERNOON_GAP;
    public static final String HALF_DAY_MORNING = "MORNING";
    public static final String HALF_DAY_AFTERNOON = "AFTERNOON";
    public static final DateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
    public static final String INIT_MORNING_DATE_FORMAT_STRING = "2016-12-02 9:00";
    public static final String INIT_AFTERNOON_DATE_FORMAT_STRING = "2016-12-02 13:00";

    public static final String LUNCH = "12:00PM Lunch\n";
    public static final String NETWORK_EVENT ="05:00PM Networking Event\n";



    Set<Talk> talks;

    // init setup
    int fullMinutes;

    // < full minutes
    int occupiedMinutes;


    int restMinutes;

    private String halfDay;
    private Date begin;

    private  Session(){}

    public static Session buildMorning() {
        Session session = new Session();
        session.halfDay = HALF_DAY_MORNING;
        session.restMinutes = MORNING_MAX;
        session.occupiedMinutes = 0;
        session.fullMinutes = MORNING_MAX;
        session.talks = new HashSet<Talk>();
        try{
            session.begin = FORMAT.parse(INIT_MORNING_DATE_FORMAT_STRING);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return session;
    }


    public static Session buildAfternoon()   {
        Session session = new Session();
        session.halfDay = HALF_DAY_AFTERNOON;
        session.restMinutes = AFTERNOON_MAX;
        session.occupiedMinutes = 0;
        session.fullMinutes = AFTERNOON_MAX;
        session.talks = new HashSet<Talk>();
        try{
        session.begin = FORMAT.parse(INIT_AFTERNOON_DATE_FORMAT_STRING);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return session;
    }

    public boolean canFill(Talk talk){
        if (HALF_DAY_MORNING.equals(halfDay)){
            if(talk.minutes<=this.restMinutes)
                return true;
            else
                return false;
        }else{
            if(talk.minutes<=this.restMinutes - AFTERNOON_GAP)
               return true;
            else
              return false;
        }
    }


    public boolean canReFill(Talk talk){
        if(talk.minutes<=this.restMinutes)
            return true;
        else
            return false;
    }





    public boolean fill(Talk talk) {
          if (canFill(talk)){
              talks.add(talk);
              this.occupiedMinutes += talk.minutes;
              this.restMinutes -= talk.minutes;
              this.begin = talk.schedulerAndGetNextBegin(this.begin);
              return true;
          }
        return false;
    }

    public boolean refill(Talk talk) {
        if (canReFill(talk)){
            talks.add(talk);
            this.occupiedMinutes += talk.minutes;
            this.restMinutes -= talk.minutes;
            this.begin = talk.schedulerAndGetNextBegin(this.begin);
            return true;
        }
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Talk talk: talks){
            sb.append(talk.toString());
            sb.append(LINE_SEP);
        }
        return sb.toString();
    }

}
