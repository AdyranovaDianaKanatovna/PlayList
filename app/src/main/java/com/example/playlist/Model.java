package com.example.playlist;

public class Model {
    private String nameSinger;
    private String music;
    private String number;
    private String time;

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Model(String nameSinger, String music, String number, String time) {
        this.nameSinger = nameSinger;
        this.music = music;
        this.number = number;
        this.time = time;
    }
}
