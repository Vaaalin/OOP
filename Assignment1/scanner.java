import java.util.Scanner;
 class UserProfile{
    Scanner input = new Scanner(System.in);
    public void collectUserInfo(){
        String username;
        int userAge;
        System.out.println("Enter your username: ");
        username = input.next();
        System.out.println("Enter your age: ");
        userAge = input.nextInt();
        System.out.println("Welcome " + username + "! You are " + userAge + " years young");
    }
    public static void main(String[] args) {
        (new UserProfile()).collectUserInfo();
    }
 }
 //use of scanner class