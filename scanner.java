import java.util.Scanner;
 class scanner{
    Scanner sc=new Scanner(System.in);
    public void readNameandAge(){
        String name;
        int age ;
        System.out.println("Name? ");
        name =sc.next();
        System.out.println("Age? ");
        age=sc.nextInt();
        System.out.println("Hello " +name+ " you are "+age+" springs young");
    }
    public static void main(String[] args) {
        (new scanner()).readNameandAge();
    }
 }