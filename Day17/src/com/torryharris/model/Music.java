package com.torryharris.model;

public class Music {
    private String name;
    private int noOFSpeaker;
    private int noOfSub;
    private float displaySize;

    public Music(String name, int noOFSpeaker, int noOfSub, float displaySize) {
        this.name = name;
        this.noOFSpeaker = noOFSpeaker;
        this.noOfSub = noOfSub;
        this.displaySize = displaySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOFSpeaker() {
        return noOFSpeaker;
    }

    public void setNoOFSpeaker(int noOFSpeaker) {
        this.noOFSpeaker = noOFSpeaker;
    }

    public int getNoOfSub() {
        return noOfSub;
    }

    public void setNoOfSub(int noOfSub) {
        this.noOfSub = noOfSub;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }
}
