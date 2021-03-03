package school.model;

import java.time.LocalTime;

public class Period {

    private Day day;
    private Time time;


    public Period(Day day, Time time) {
        this.day = day;
        this.time = time;

    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public enum Day {
        sunday, Monday, tuesday, Wednesday, Thursday;
    }

    public enum Time {
        FIRST, SECOND, THIRD, FORTH, FIFTH, SIXTH, SEVENTH;

        private LocalTime startTime;
        private final static int tiMe = 45;
        private final static int breakBeforeTheClass = 5;
        private final static int breakLunch = 20;

        public LocalTime startTheClassFirstTime(Time time) {
            return LocalTime.of(8, 0).plusMinutes(45 * time.ordinal());

        }

        public LocalTime endTheClassFirstTime(Time time) {
            return LocalTime.of(8, 45).plusMinutes(45 * time.ordinal());


        }

        @Override
        public String toString() {
            return "Time{" +
                    "startTime=" + startTime +
                    '}';
        }
    }
}

