import java.util.Scanner;
class Q17{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int n=s.nextInt(),r=0,t=n;
  while(t!=0){r=r*10+t%10;t/=10;} 
  System.out.println(r==n?"Palindrome":"Not Palindrome");
 }
}
/* OUTPUT :
Palindrome
*/