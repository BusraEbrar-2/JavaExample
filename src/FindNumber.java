


public class FindNumber {
    
    public static void main ( String[] args ) {
      int [] numbers =  new int[]{1,2,5,7,9,0} ;
      int aranacak = 5 ;
    boolean varMı = false ;
 for ( int i =0; i<numbers.length;i++) {
if (numbers[i]== aranacak){
varMı = true ;
break ;
}
 }
if ( varMı  ){
    System.out.println("Sayı bulundu ");

} else {
    System.out.println("sayı bulunamadı ");
}

 }
}
