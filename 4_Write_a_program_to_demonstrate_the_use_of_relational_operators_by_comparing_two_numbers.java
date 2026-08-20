import java.util.Scanner;
class Q4{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int a=s.nextInt(),b=s.nextInt();
  System.out.println(a+">"+b+" = "+(a>b));
  System.out.println(a+"<"+b+" = "+(a<b));
  System.out.println(a+">="+b+" = "+(a>=b));
  System.out.println(a+"<="+b+" = "+(a<=b));
  System.out.println(a+"=="+b+" = "+(a==b));
  System.out.println(a+"!="+b+" = "+(a!=b));
 }
}
/* OUTPUT :
5>3 = true
5<3 = false
5>=3 = true
5<=3 = false
5==3 = false
5!=3 = true
*/