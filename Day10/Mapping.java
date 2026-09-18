import java.util.Map;
import java.util.HashMap;


public class Mapping {
    public static void main(String[] args) {
        Map<String,Integer> Student = new HashMap<>();
        //Map<String,Integer> Student = new Hashtable<>(); Hashtable is a  Synchronization we can use it when we are useing threads 

        Student.put("srikar", 100);
        Student.put("Ram", 98);
        Student.put("ajay", 90);
        System.out.println(Student);
        
        System.out.println(Student.keySet());
       //get() needs a key, not the whole map.
        System.out.println(Student.get("srikar"));

        for(String students:Student.keySet()){
            System.out.println(students +":"+ Student.get(students));
        }
    }
    
}