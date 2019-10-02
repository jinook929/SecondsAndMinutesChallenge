package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    
    public static void main(String[] args) {
        System.out.println(getDurationString(65L, 65L));
        System.out.println(getDurationString(7394L));
    }

    private static String getDurationString (long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes /60;
        long remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if(hours < 10) {
            hourString = "0" + hourString;
        }

        String minuteString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }

        String secondString = seconds + "s";
        if(seconds < 10) {
            secondString = "0" + secondString;
        }

//        String durationResult = hours + "h " + remainingMinutes + "m " + seconds + "s";
        return hourString + " " + minuteString + " " + secondString;
    }

    private static String getDurationString (long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds /60;
        long remainingSeconds = seconds % 60;
//        String durationResult = getDurationString(minutes, remainingSeconds);
        return getDurationString(minutes, remainingSeconds);
    }
}
