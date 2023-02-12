import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episodeLength= Integer.parseInt(scanner.nextLine());
        int breakLength= Integer.parseInt(scanner.nextLine());

        double lunchTime=breakLength / 8.0;
        double relaxTime= breakLength / 4.0;
        double remainingTime= breakLength- lunchTime- relaxTime;
        double diff= Math.abs(remainingTime-episodeLength);

        if (remainingTime>= episodeLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(diff));
        }
        else System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(diff));

    }
}
