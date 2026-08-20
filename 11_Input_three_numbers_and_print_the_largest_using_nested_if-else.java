import java.util.Scanner;
class Q11{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
  int m;if(x>=y){ if(x>=z) m=x; else m=z;} else{ if(y>=z) m=y; else m=z; }
  System.out.println(m);
 }
}
/* OUTPUT :
9
*/