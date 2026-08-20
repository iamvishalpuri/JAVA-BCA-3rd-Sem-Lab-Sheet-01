import java.util.Scanner;
class Q12{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int y=s.nextInt();
  boolean leap=(y%400==0)||(y%4==0 && y%100!=0);
  System.out.println(leap?"Leap":"Not Leap");
 }
}
/* OUTPUT :
Leap
*/