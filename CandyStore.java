import java.util.Scanner;

public class CandyStore {
    static double price;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = candyChoices();
        while(!str.equals("quit")) {
            System.out.println("please enter the quantity");
            int qty = scanner.nextInt();
            scanner.nextLine();
            price = price + calculateCost(str, qty);
            str = candyChoices();
        }
        scanner.close();
        System.out.println("The total price before adding Tax is " + price + "\n");
        System.out.println("The total price after adding Tax is " + price * 1.13);
    } 

    public static String candyChoices() {
        System.out.println("You have 5 choices\n" + "a) Reese's Pieces: $2.50/0.5 kg\n" + "b) Skittles: $1.75/1 kg\n" + "c) Jubjubes: $0.50/1 kg\n" + "d) Lollipops: 1 for $0.50 or 5 for $2.00\n" + "e) Smarties: $1.50/1 kg\n");
        String choice = scanner.nextLine();
        return choice;
    }

    public static double calculateCost(String choice, int qty) {
        double price = 0;
        if(choice.equals("Reese Pieces")) price = 5.0 * qty;
        else if(choice.equals("Skittles")) price = 1.75 * qty;
        else if(choice.equals("Jubjubes")) price = 0.5 * qty;
        else if(choice.equals("Lollipops")) {
            int t = qty / 5; int m = qty % 5;
            price = 2.0 * t + 0.5 * m;
        }
        else if(choice.equals("Smarties")) price = 1.5 * qty;
        else {
            System.out.println("Your entered a wrong name, please enter again");
        }
        return price;
    }
} 
