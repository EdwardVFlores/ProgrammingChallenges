import java.util.*;
public class DiceGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int e = 0, g= 0;
        for(int i = 0; i < 8; i++){
            if(i < 4){
                g += scan.nextInt();
            } else {
                e += scan.nextInt();
            }
        }
        if(g > e) {
            System.out.println("Gunnar");
        }
        else if(g < e) {
            System.out.println("Emma");
        } else{
            System.out.println("Tie");
        }
    }
    
}
