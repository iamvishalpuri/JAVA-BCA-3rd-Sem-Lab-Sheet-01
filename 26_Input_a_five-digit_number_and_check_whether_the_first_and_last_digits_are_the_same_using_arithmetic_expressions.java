import java.util.Scanner;
class Q26{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int n=s.nextInt();int first=n/10000;int last=n%10;
  System.out.println(first==last?"Same":"Not Same");
 }
}
/* OUTPUT :
Same
*/