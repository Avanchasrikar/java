// converting the int into byte is know as casting we can call it as explicitly coversion

// converting byte into int is know as implicit coversion

// when ever we want to convert int into byte but more than 127 then
//  it will conver tha into modulo  which is it wil divide  and the reminder is 1

 class casting{
    public static void main(String arg[]){
        // byte b= 127;
        int a= 22;
        byte c = (byte)a ;// casting

        float d = 5.5f;
        int g = (int)d;

        byte q =10;
        byte w =23;
         int result= q + w ;// this is called type promotions

        System.out.println(result); // this is called type promotions


        System.out.println(c);
        System.out.println(g);
    }
 }