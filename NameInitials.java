
import java.util.Scanner;
public class NameInitials
{
   public static void initial(String Name) {
       char a = Name.charAt(0);
       char b = Name.charAt(Name.indexOf(" ")+1);
       char c = Name.charAt(Name.lastIndexOf(" ")+1);
    
       System.out.println(a+""+b+""+c);

    }

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please type in your full name, meaning your first, middle and last name.");
       String Name = input.nextLine();
       
       initial(Name);
    }
}
