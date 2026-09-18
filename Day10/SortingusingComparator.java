import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * SortingusingCompataior
 */
public class SortingusingComparator {

    public static void main(String[] args) {
// Comparator is  a concept of interface
        Comparator<Integer> com = new Comparator<>(){
            public int compare(Integer i ,Integer j){
                if(i%10>j%10){
                    return 1; // 1 means swap
                }else
                    return -1; // -1 means dont swap
            }
        };


        List<Integer> num = new ArrayList<>();
        num.add(72);
        num.add(43);
        num.add(6);
        num.add(90);
        num.add(28);

        Collections.sort(num,com);

        System.out.println(num);
    }
}