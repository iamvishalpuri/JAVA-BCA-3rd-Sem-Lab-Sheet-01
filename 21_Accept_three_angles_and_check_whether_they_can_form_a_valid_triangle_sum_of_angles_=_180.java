import java.util.Scanner;
class Q21{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
  System.out.println((a+b+c==180 && a>0 && b>0 && c>0)?"Valid":"Not Valid");
 }
}
/* OUTPUT :
Valid
*/