import java.util.HashSet; // küme set veri yapısı 
import java.util.Set;// interface hashset elemanları benzersiz olarak saklar 




public class RepeatedNumbers {
    public static void findRepeated (int []  arr ) {

        Set <Integer> seen = new HashSet<>();
Set <Integer> repeated = new HashSet<>();

for ( int num : arr){

if ( !seen.add(num)){
    repeated.add(num);
}

}
System.out.println(repeated);



    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4, 5, 1};
        findRepeated(input);
    }
    


}
