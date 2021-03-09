import java.util.*;

public class ToogleEachElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = scanner.nextLine();
        String s1 = "";
        String s2 = "";

        for (int i = s.length()-1; i >=0; i--) 
           s1 = s1 + s.charAt(i);
       System.out.println("Reversed String is : " + s1);

       if(s.equals(s1))
        System.out.println("String is pallindrome");
        else
        System.out.println("String is not a pallindrome");
       
       s2 = s.replaceAll("[^a-zA-Z]", "");
       System.out.println("Remove Characters In Atring Except Alphabets: "+ s2);

}
}