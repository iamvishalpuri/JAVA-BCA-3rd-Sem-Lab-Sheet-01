import java.util.Scanner;
class Q27{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);double cp=s.nextDouble(),sp=s.nextDouble();
  if(sp>cp) System.out.println("Profit "+(sp-cp));
  else if(cp>sp) System.out.println("Loss "+(cp-sp));
  else System.out.println("No Profit No Loss");
 }
}
/* OUTPUT :
Profit 20.0
*/