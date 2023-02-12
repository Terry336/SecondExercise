import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMin= hour*60+minutes+15;
        hour= totalMin/60;
        minutes= totalMin%60;

        if (hour>23){
            hour=0;
        }

        System.out.printf("%d:%02d", hour,  minutes);

    }
}
