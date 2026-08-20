import java.util.Scanner;
class Q9{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int m1=s.nextInt(),m2=s.nextInt(),m3=s.nextInt();
  int t=m1+m2+m3;double p=t/3.0;
  System.out.println(t+" "+p);
  System.out.println((m1>=40 && m2>=40 && m3>=40)?"Pass":"Fail");
 }
}
/* OUTPUT :
180 60.0
Pass
*/