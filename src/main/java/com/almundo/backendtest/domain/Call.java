package com.almundo.backendtest.domain;

import com.almundo.backendtest.util.RandomNumber;

/**
 * @author fabio_mora
 */
public class Call {
    private String from;
    private int duration;
    private boolean processed;

    public Call() {
    }

    public Call(String from, int duration) {
        this.from = from;
        this.duration = duration;
    }

    public Call(String from) {
        this.from = from;
        this.duration = RandomNumber.getRandomDuration(5, 10);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
