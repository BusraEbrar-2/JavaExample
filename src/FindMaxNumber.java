
import java.util.Arrays;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5};  // Örnek array

        // En büyük değeri bul
        int max = Arrays.stream(arr).max().getAsInt();

        // Yeni array oluştur ve her eleman için max - eleman işlemi yap
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = max - arr[i];
        }

        // Sonucu yazdır
        System.out.println("Yeni Array: " + Arrays.toString(newArr));
    }
}
