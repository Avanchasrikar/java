/**
 * praticePalindrome
 */
public class praticePalindrome {

    // equals() compares the actual contents of two strings.



//matches() checks whether a string matches a regular expression.
//A Regular Expression (Regex) is a sequence of characters that defines a pattern.
//  In Java, you use it to check whether text follows a particular format, find specific text, or replace matching text.
//Think of regex as a rule for matching text.


    public static void main(String[] args) {
        String name = "Madam";
         String Palindrome = "";
         String Name = name.toLowerCase();
         
        for(int i =Name.length()-1; i>=0;i--){
            
             Palindrome += Name.charAt(i);   
        }
       if( Name.equals(Palindrome)){
        System.out.println("Palindrome");
       }else{
        System.out.println("not a Palindrome");
       }
       System.out.println(Name);    
    }
    
}