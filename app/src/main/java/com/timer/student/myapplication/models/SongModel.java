package com.timer.student.myapplication.models;

/**
 * Created by Student on 2017-03-15.
 */

public class SongModel {

    private String song;
    private String singer;

    public SongModel(String song, String singer) {
        this.song = song;
        this.singer = singer;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SongModel{");
        sb.append("song='").append(song).append('\'');
        sb.append(", singer='").append(singer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
