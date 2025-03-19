import java.util.ArrayList;
import java.util.List;

public class fibonacci{

public static List<Integer> generateFibonacci( int n ){

    List<Integer> fList= new ArrayList<>();
int a = 0 , b = 1;
while  (fList.size()<n){
    fList.add(a);
    int temp = a+b ;
    a=b;
    b = temp ;
}
    return fList;
}
public static void main(String[] args) {
    int n = 6;
    System.out.println(generateFibonacci(n)); // Çıktı: [0, 1, 1, 2, 3, 5]
}


}