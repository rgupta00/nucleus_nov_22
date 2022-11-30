package com.practice;


public class Demo {
    public static void main(String[] args) {
        enum WeekDay {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        WeekDay day = WeekDay.TUESDAY;

        String info= switch (day) {
                    case MONDAY, WEDNESDAY, FRIDAY->{
                        yield "meeting";
                    }
                    case TUESDAY, THURSDAY, SATURDAY->{
                        yield " no meeting";
                    }
                    case SUNDAY->{
                        yield "lets enjoy sunday";
                    }
                };
    }
}
