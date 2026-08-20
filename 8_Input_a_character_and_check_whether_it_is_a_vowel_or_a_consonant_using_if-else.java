import java.util.Scanner;
class Q8{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);char c=s.next().toLowerCase().charAt(0);
  System.out.println("aeiou".indexOf(c)!=-1?"Vowel":"Consonant");
 }
}
/* OUTPUT :
Vowel
*/