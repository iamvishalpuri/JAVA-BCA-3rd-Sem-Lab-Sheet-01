import java.util.Scanner;
class Q14{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);char c=s.next().charAt(0);
  if(Character.isDigit(c)) System.out.println("Digit");
  else if(Character.isUpperCase(c)) System.out.println("Uppercase");
  else if(Character.isLowerCase(c)) System.out.println("Lowercase");
  else System.out.println("Special");
 }
}
/* OUTPUT :
Digit
*/