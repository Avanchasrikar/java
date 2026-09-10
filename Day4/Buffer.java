public class Buffer {
    public static void main(String[] args) {
        // string buffer is mutable and it will contain buffer size of 16 bytes
        StringBuffer obj = new  StringBuffer("sri");
        //it contains continuous memory sir + 16 =19 
        // stringbuffer is thread safe 
        obj.append(" avancha");
        obj.deleteCharAt(2);
        obj.indexOf(i, 2);// if we try to run again we will get error: compilation failed
        obj.insert(0, "java");
        obj.setLength(50);// it wil not store more than 50 
         System.out.println(obj);

        System.out.println(obj.capacity());
    }
    
}
