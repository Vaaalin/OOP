import java.util.*;
class GreetingLoop{
    Scanner input = new Scanner(System.in);

    //outputs greeting while user wants to continue
    void displayGreeting(){
        String response;

        System.out.println("Type 'g' for a greeting, anything else to exit");
        response = input.next();
        while("g".equals(response)){
            System.out.println("Greetings!");
            response = input.next();
        }
    }
    public static void main(String[] args) {
        GreetingLoop program = new GreetingLoop();
        program.displayGreeting();
    }
}//use of while loop