import java.util.ArrayList;
import java.util.List;

public class selfDividingNumbers {
    public static void main(String[] args){
        System.out.println(selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = left; i <= right; i++){
                char[] nums = Integer.toString(i).toCharArray();
                boolean isLegal = true;
                for(char num: nums) {
                    if(num == '0' || i % (num-'0') > 0){
                        isLegal = false;
                    }
                }
                if(isLegal){
                    al.add(i);
                }
            }
            return al;
    }
    
}
