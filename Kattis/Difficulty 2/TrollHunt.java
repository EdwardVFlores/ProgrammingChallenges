import java.util.Scanner;

public class TrollHunt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Bridges = scan.nextInt();
        int Knights = scan.nextInt();
        int Groups = scan.nextInt();
        
        int groups = Bridges-1;
        int days = Knights/Groups;
        System.out.println(groups % days == 0 ? groups/days : groups/days+1);
    }
}
