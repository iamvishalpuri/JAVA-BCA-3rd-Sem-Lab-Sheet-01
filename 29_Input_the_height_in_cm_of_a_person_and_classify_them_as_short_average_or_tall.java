import java.util.Scanner;
class Q29{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int h=s.nextInt();
  System.out.println(h<150?"Short":(h<=170?"Average":"Tall"));
 }
}
/* OUTPUT :
Average
*/