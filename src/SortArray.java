import java.util.Arrays;

public class SortArray {
    public static int [] sortArray (int [] arr ){

        Arrays.sort(arr);
        return arr ;
    }
       public static void main(String[] args) {
        int[] input = {5, 3, 8, 1, 2};
        System.out.println(Arrays.toString(sortArray(input))); // Çıktı: [1, 2, 3, 5, 8]
    }
}
