public class RecursionFactorial {
    public static void main (String[] args){
        int num=5;
        System.out.println(factorial(num));
    }

    public static int  factorial(int num){
//base case
if (num==0||  num==1){
    return 1;
} else {
    //recursive case
    return num * factorial(num - 1);
}
    }
    
}
