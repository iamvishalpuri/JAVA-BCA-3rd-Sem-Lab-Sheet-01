import java.util.Scanner;
class Q20{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int age=s.nextInt();char g=s.next().toLowerCase().charAt(0);
  if((g=='m' && age>=21)||(g=='f' && age>=18)) System.out.println("Eligible"); else System.out.println("Not Eligible");
 }
}
/* OUTPUT :
Eligible
*/