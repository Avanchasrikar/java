
public class praticenum {

    // Given a string, replace consecutive repeated characters with the character followed by its count.
    public static void main(String[] args) {
        String input = "aaabbccccd";
        int count = 0;
       


        StringBuilder result = new StringBuilder();

        for(int i =0; i<input.length()-1;i++){
         
             char ch = input.charAt(i);

            if (ch == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(ch);  // Adds
                result.append(count); // Adds
                count = 1; // Resets count for the next group
            }
           
        }
         result.append(input.charAt(input.length() - 1));
        result.append(count);
         System.out.println(result);
    }
}
