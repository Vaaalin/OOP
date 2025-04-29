public class BankAccount {
    void calculateInterest(){
        double principal;
        double interestRate;

        principal = 1500.00;
        System.out.println("Initial amount: " + principal);
        interestRate = 2.5;
        principal = principal * (100 + interestRate) / 100;
        System.out.println("After a year: " + principal);
        principal = principal * (100 + interestRate) / 100;
        System.out.println("After 2 years: " + principal);
    }
    public static void main(String[] args) {
        (new BankAccount()).calculateInterest();
    }
}
