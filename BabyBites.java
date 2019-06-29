package programmingchallenges;

import java.util.Scanner;

public class BabyBites {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countTo = scanner.nextInt();
            int counter = 1;
            String good = "makes sense";
            for(int i=1; i<=countTo; i++){
                String word = scanner.next();
                if(word.equals("mumble")){
                    if(i != counter){
                        good = "something is fishy";
                        break;
                    } 
                } else if(Integer.parseInt(word) != counter){
                    good = "something is fishy";
                    break;
                }
                counter++;
            }
            System.out.println(good);
        }

}
