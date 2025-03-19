import java.util.Arrays;

public class ReverseArray {
    

    public static int [] reverse (int arr[]){
int start = 0 ;
int end  = arr.length -1 ;


while (start<end ) {
int temp = arr[start];
arr[start]= arr[end];
arr[end]= temp ;
start++;
end--;

}
return arr ;


    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(input))); 
    }
}
