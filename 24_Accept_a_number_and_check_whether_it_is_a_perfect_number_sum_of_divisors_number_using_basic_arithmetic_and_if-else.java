import java.util.Scanner;
class Q24{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;
  for(int i=1;i<=n/2;i++) if(n%i==0) sum+=i;
  System.out.println(sum==n?"Perfect":"Not Perfect");
 }
}
/* OUTPUT :
Perfect
*/