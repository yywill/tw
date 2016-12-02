package com.throughtworks.williamyang.homework.problems.conferenceTrackManagement;

/**
 * Created by willyyang on 2016/12/2.
 */
public class Track {


    private int num;
    // 9 am - 12 am
     Session morning;
    // 1 pm - 4-5 pm
    // the goal is to fit it, must use it bigger than 4 pm no later than 5 pm
     Session afternoon;


    public Track(int num) {
        this.num = num;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("TRACK "+num+":\n");
        sb.append(morning.toString());
        sb.append(Session.LUNCH);
        sb.append(afternoon.toString());
        sb.append(Session.NETWORK_EVENT);
        return sb.toString();
    }

}
