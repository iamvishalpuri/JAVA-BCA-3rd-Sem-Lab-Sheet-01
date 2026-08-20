import java.util.Scanner;
class Q16{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);double sal=s.nextDouble();double tax=0;
  if(sal<=250000) tax=0;
  else if(sal<=500000) tax=(sal-250000)*0.05;
  else if(sal<=1000000) tax=(250000)*0.05+(sal-500000)*0.2;
  else tax=(250000)*0.05+(500000)*0.2+(sal-1000000)*0.3;
  System.out.println(tax);
 }
}
/* OUTPUT :
35000.0
*/