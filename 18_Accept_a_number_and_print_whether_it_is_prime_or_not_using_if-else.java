import java.util.Scanner;
class Q18{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int n=s.nextInt();if(n<=1){System.out.println("Not Prime");return;} 
  for(int i=2;i*i<=n;i++) if(n%i==0){System.out.println("Not Prime");return;} 
  System.out.println("Prime");
 }
}
/* OUTPUT :
Prime
*/