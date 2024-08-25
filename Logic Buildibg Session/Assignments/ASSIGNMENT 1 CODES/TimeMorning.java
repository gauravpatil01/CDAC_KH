import java.time.LocalTime;
public class TimeMorning {
    public static void main(String[] args) {

        LocalTime currentTime= LocalTime.now();

        int hour = currentTime.getHour();

        switch (hour) {
            case 5: case 6: case 7: case 8: case 9:case 10: case 11:
                System.out.println("Good Morning");
                break;
        
            default:
            System.out.println("It's not morning right now.");
                break;
        }

        
    }
}
