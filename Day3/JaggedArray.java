public class JaggedArray {
    public static void main(String[] args) {
        // jagged array means having different size of coloum in internal arrays 
        int num[][]= new int[3][];

        num[0] = new int[3];
        num[1] = new int[6];
        num[2] = new int[4];

          for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]= (int)(Math.random() * 10) ;
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}
