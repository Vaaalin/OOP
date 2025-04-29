
import java.util.Scanner;

public class choices {
    public static void main(String[] args) {
        Scanner pr=new Scanner(System.in);
        System.out.println("Enter the price: ");
        int price=pr.nextInt();
    
        if (price <25 ){
        System.out.println("i'll buy!");
        }else{
        System.out.println("TOO expensive");
        }
    }   
}
