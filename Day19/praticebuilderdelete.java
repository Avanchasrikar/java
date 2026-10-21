
public class praticebuilderdelete {
    public static void main(String[] args) {

        // Given a string and a character, remove all occurrences of that character using StringBuilder.
        String input = "banana";

        StringBuilder Character = new StringBuilder(input);
        Character.toString();

        for(int i = 0; i <Character.length();i++){
         char  ch = Character.charAt(i);
            if(ch ==  'a'){
                Character.deleteCharAt(i);
                i--;
                
            }
            
        }
        System.out.println(Character);
        
    }
}
