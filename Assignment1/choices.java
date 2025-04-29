import java.util.Scanner;

public class choices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item cost: ");
        int cost = scanner.nextInt();
    
        if (cost < 30){
            System.out.println("That's affordable!");
        } else {
            System.out.println("Too costly for my budget");
        }
    }   
}
//use of if else statement