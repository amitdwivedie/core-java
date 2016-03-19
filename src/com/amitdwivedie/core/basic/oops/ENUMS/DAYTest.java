package com.amitdwivedie.core.basic.oops.ENUMS;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class DAYTest {
    Day day;

    public DAYTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;

        case FRIDAY:
            System.out.println("Fridays are better.");
            break;

        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;

        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }

    public static void main(String[] args) {
        DAYTest firstDay = new DAYTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        DAYTest thirdDay = new DAYTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        DAYTest fifthDay = new DAYTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        DAYTest sixthDay = new DAYTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        DAYTest seventhDay = new DAYTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
