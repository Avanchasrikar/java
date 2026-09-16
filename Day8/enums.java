//In Java, an enum (short for enumeration) is a special data type used to define a fixed set of constants. 
// Think of it as a special kind of class that holds a list of unchangeable values
enum status{ // status is a class
    Running,Failed,Pending,Success; // these are objects
}

public class enums {
    public static void main(String[] args) {
        status[] s = status.values();

        for(int i =0;i<=s.length;i++)
        System.out.println(s[i] + ":" + s[i].ordinal());
    }
}


//example uses
//Days of the week (MONDAY, TUESDAY, etc.)
// Cardinal directions (NORTH, SOUTH, EAST, WEST)
// Traffic light colors (RED, YELLOW, GREEN)
// Game difficulty levels (EASY, MEDIUM, HARD
