
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates { 

    public static void main ( String [] args ) {
int numbers []  = {1,2,3,4,3,1,5,3,4};
findDuplicates(numbers) ;
    }

public static void findDuplicates(int[] arr){
Map <Integer,Integer> countMap = new HashMap<>();

for (int num : arr) {
    countMap.put(num, countMap.getOrDefault(num,0)+1) ;
}
System.out.println("Repeated numbers and their counts:");

}


    }



/*
 * map bir koleksiyon yapısıdır  = > anahtar değer çiftleri saklar 
 * HashMap sınıfı, Map arayüzünü (interface) uygular ve anahtar-değer çiftlerini depolayan bir veri yapısıdır.
Anahtarlar benzersizdir → Aynı anahtardan sadece bir tane bulunur.
Değerler güncellenebilir → Aynı anahtara sahip yeni bir değer eklendiğinde, eski değer yerine geçer.
 * 
 * 
 */


 /*
  * countMap.put(num, countMap.getOrDefault(num, 0) + 1);
put(K key, V value): Map'te belirli bir anahtara (key) karşılık değer (value) eklemek için kullanılır. Eğer o anahtar zaten varsa, değeri günceller


  */
