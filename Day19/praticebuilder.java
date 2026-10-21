public class praticebuilder {

    // Given a string, reverse it using StringBuilder
    public static void main(String[] args) {
        StringBuilder be = new StringBuilder("Java");

        for(int  i = be.length()-1; i>=0;i--){
            System.out.print(be.charAt(i));
        }

    }
}



// Method 2 

// public class PraticeBuilder {
//     public static void main(String[] args) {
//         String input = "Java";

//         String reversed = new StringBuilder(input)
//                 .reverse()
//                 .toString();

//         System.out.println(reversed); // avaJ
//     }
// }