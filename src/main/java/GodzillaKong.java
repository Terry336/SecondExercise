import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        int statists= Integer.parseInt(scanner.nextLine());
        double priceDress= Double.parseDouble(scanner.nextLine());
        double dressExpenses= statists*priceDress;
        double decor= budget*0.1;

        if (statists >150){
            dressExpenses=dressExpenses-(dressExpenses*0.1);
        }

        double diff= Math.abs(budget-(dressExpenses+decor));
        if (dressExpenses+decor>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
        else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
