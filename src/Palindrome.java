public class Palindrome {
    public static boolean isPalindrome(String str) {
    int  l = 0 ;
    int r = str.length()-1;

    while(l<r){
        if (str.charAt(l)!= str.charAt(r)){
            return false ;
        }
l++;
r--;
    
    }
    return true ;
}


public static void main(String[] args) {
    String input = "madam";
    System.out.println(isPalindrome(input)); // Çıktı: true
}

}
