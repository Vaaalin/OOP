import java.util.Random;
public class ArrayGenerator {
    public static void main (String[] args){
        Random random= new Random();
        String[]stringArray=new String[10];
        for(int i=0;i<stringArray.length;i++){
            char prefix=(char)(random.nextInt(5)+'A');
            int number=random.nextInt(999)+1;
            String suffix=String.format("%03d", number);

            stringArray[i]=prefix+suffix;

        }
        for(String identity:stringArray){
            System.out.println(identity);
        }
    }
}
