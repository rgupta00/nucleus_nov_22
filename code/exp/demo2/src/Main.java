public class Main {
    public static void main(String[] args) {
        enum WeekDay {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        WeekDay day = WeekDay.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Let's meet!");
                break;
            case TUESDAY:
                System.out.println("no meeting!");
                break;
            case WEDNESDAY:
                System.out.println("Let's meet!");
                break;
            case THURSDAY:
                System.out.println("no meeting!");
                break;
            case FRIDAY:
                System.out.println("Let's meet!");
                break;
            case SATURDAY:
                System.out.println("no meeting!");
                break;
            case SUNDAY:
                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
                break;
            default:
                System.out.println("Do I really need this?!");
                break;
        }
    }
}