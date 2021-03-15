package HomeWork1;


public class main {
    public static void main(String[] args) {
        getTimeOfWork(DayOfWeek.MONDAY);
    }
    public static void getTimeOfWork(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("До конца недели осталось работать 40 часов");
                break;
            case TUESDAY:
                System.out.println("До конца недели осталось работать 32 часов");
                break;
            case WEDNESDAY:
                System.out.println("До конца недели осталось работать 24 часов");
                break;
            case THURSDAY:
                System.out.println("До конца недели осталось работать 16 часов");
                break;
            case FRIDAY:
                System.out.println("До конца недели осталось работать 8 часов");
                break;
            case SATURDAY:
                System.out.println("Сегодня можно поспать, выходной!");
                break;
            case SUNDAY:
                System.out.println("Сегодня можно поспать, выходной! Но завтра снова на работу...");
                break;
            default:
                System.out.println("Такого дня недели не знаем!");

        }
    }
}










