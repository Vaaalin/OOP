import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArraySort {
    public static void main(String args[]){
        String[] pallets={"B123", "A123", "A222", "C123", "D123", "E123"};

        //sorting the array
System.out.println("Sorted Pallets:");
        Arrays.sort(pallets);
        for(String pallet:pallets){
            System.out.println("--"+pallet);
        }

        //reversing the array
        System.out.println("Reversed Pallets:");
        //change the array to a list
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for(String pallet:palletList){
            System.out.println("--"+pallet);
        }
    }
}
