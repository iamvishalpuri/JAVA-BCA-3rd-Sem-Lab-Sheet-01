import java.util.Scanner;
class Q19{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt();char op=s.next().charAt(0);
  if(op=='+') System.out.println(x+y);
  else if(op=='-') System.out.println(x-y);
  else if(op=='*') System.out.println(x*y);
  else if(op=='/') System.out.println(y!=0?x/(double)y:"Division by zero");
  else System.out.println("Invalid operator");
 }
}
/* OUTPUT :
15.0
*/