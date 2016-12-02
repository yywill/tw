package com.throughtworks.williamyang.homework.problems.conferenceTrackManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by willyyang on 2016/12/2.
 */
public class Talk {
     public static final DateFormat FORMAT = new SimpleDateFormat("HH:mma", Locale.ENGLISH);
     private static final String SEPARATE = " ";
     private static final String MIN = "min";
     String title;
     int minutes;
     Date begin;

    private Talk(){

    }

    public static Talk buildTalk(String title, int minutes){
        Talk talk = new Talk();
        talk.minutes = minutes;
        talk.title = title;
        return talk;
    }

    public Date schedulerAndGetNextBegin(Date begin){
        this.begin = begin;
        long mill = begin.getTime();
        Date nextBegin = new Date(mill+minutes*60*1000);
        return nextBegin;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(FORMAT.format(begin));
        sb.append(SEPARATE);
        sb.append(title);
        sb.append(SEPARATE);
        sb.append(minutes);
        sb.append(MIN);

        return sb.toString();
    }

}
