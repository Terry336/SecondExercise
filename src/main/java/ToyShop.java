import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursion= Double.parseDouble(scanner.nextLine());
        int puzzles= Integer.parseInt(scanner.nextLine());
        int dolls= Integer.parseInt(scanner.nextLine());
        int teddybears= Integer.parseInt(scanner.nextLine());
        int minions= Integer.parseInt(scanner.nextLine());
        int camions= Integer.parseInt(scanner.nextLine());
        int totalOrderedToys= puzzles+dolls+teddybears+minions+camions;
        double puzzlePrice= 2.60*puzzles;
        double dollPrice= 3*dolls;
        double teddybearPrice= 4.10*teddybears;
        double minionPrice= 8.20*minions;
        double camionPrice= 2*camions;
        double profit= puzzlePrice+dollPrice+teddybearPrice+minionPrice+camionPrice;

        if (totalOrderedToys>=50) {
            profit= profit-(profit*0.25);
        }
        double totalProfit= profit- (profit*0.1);

        double diff= Math.abs(totalProfit-excursion);

        if (totalProfit>excursion){
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
