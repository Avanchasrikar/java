public class praticeNonRepeating {
    public static void main(String[] args) {
        //First Non-Repeating Character  Given a string, find the first character that appears only once.

        String Input = "aabbc";
            
        for(int i =0; i<Input.length();i++){

           char ch = Input.charAt(i);
           boolean isRepeating = false;
            for(int j =0;j<Input.length();j++ ){
                if (i != j && ch == Input.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
             if (!isRepeating) {
                System.out.println(ch);
                break;
            }
        }

    }
}
