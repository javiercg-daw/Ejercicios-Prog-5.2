package com.javisoft.ejercicios52.ej58;

public class Time {
    private final int hour;
    private final int minute;
    private final int second;

    public Time(int hour, int minute, int second) {
        if (hour > 23 || minute > 59 || second > 59 || hour < 0 || minute < 0 || second < 0) {
            throw new IllegalArgumentException("Invalid time.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    @Override
    public String toString() {
        return this.hour + "h " +
                this.minute + "m " +
                this.second + "s";
    }
}
