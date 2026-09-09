public class Array {
    public static void main(String[] args) {
        int num[] ={2,4,6,8};
        int n[] = new int[4];
        n[0]=2;
        n[1]=21;


        // who to change the value
        num[1]=100;
     
        System.out.println(num[1]);

        for(int i=0;i<=3;i++){
             System.out.println(n[i]);

        }
    }
}
