package com.timer.student.myapplication.models;

/**
 * Created by Student on 2017-03-15.
 */

public class SingerModel {

    private String singer;

    public SingerModel(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SingerModel{");
        sb.append("singer='").append(singer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
