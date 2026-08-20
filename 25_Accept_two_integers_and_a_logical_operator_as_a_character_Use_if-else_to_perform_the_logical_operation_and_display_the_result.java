import java.util.Scanner;
class Q25{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt();char o=s.next().charAt(0);
  if(o=='&') System.out.println(x&y);
  else if(o=='|') System.out.println(x|y);
  else if(o=='^') System.out.println(x^y);
  else System.out.println("Invalid");
 }
}
/* OUTPUT :
1
*/