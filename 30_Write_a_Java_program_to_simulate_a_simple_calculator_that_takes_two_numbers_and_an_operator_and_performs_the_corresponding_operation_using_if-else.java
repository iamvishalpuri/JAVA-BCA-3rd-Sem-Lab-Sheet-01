import java.util.Scanner;
class Q30{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);double x=s.nextDouble(),y=s.nextDouble();char op=s.next().charAt(0);
  if(op=='+') System.out.println(x+y);
  else if(op=='-') System.out.println(x-y);
  else if(op=='*') System.out.println(x*y);
  else if(op=='/') System.out.println(y!=0?x/y:"Division by zero");
  else System.out.println("Invalid");
 }
}
/* OUTPUT :
5.0
*/