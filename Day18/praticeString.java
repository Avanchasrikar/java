// https://www.lets-code.co.in/previousyearcodingquestion/epam-previous-year-coding-questions/


public class praticeString {
    public static void main(String arg[]){
        String  name = "java 123";
        int vowels  = 0;
        int consonants=0;
         int digits = 0;
        int spaces = 0;

        String lowletter = name.toLowerCase();

      for(int i =0 ;i<name.length();i++){
        char ch = lowletter.charAt(i);
       Character.isLetter(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vowels++;
        }else if(Character.isLetter(ch)){
            consonants++;
        }else if ((Character.isDigit(ch))) {
            digits++;
        }else if(ch == ' '){
            spaces++;
        }
        

      }
      System.out.println("vowels : " + vowels + "Constants :  " + consonants + "digit :" + digits +" spaces :" + spaces);
    }
}

