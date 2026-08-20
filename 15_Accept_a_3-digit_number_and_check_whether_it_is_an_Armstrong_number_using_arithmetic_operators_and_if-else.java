import java.util.Scanner;
class Q15{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int n=s.nextInt(),t=n,sum=0;
  while(t>0){int d=t%10;sum+=d*d*d;t/=10;}
  System.out.println(sum==n?"Armstrong":"Not Armstrong");
 }
}
/* OUTPUT :
Armstrong
*/