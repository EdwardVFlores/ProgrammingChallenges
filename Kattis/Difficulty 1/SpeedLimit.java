package programmingchallenges;

import java.util.Scanner;
public class SpeedLimit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int numOfSpeed = scanner.nextInt();
            int answer = 0;
            int time1  = 0;
            if(numOfSpeed != -1){
                for(int i=0; i < numOfSpeed; i++){
                    int speed = scanner.nextInt();
                    int time = scanner.nextInt();
                    if(time1 == 0){
                        time1 = time;
                        answer += time1*speed;
                    } else {
                        answer += (time - time1)*speed;
                        time1 = time;
                    }
                }
                System.out.println(answer + " miles");
            } else break;
        }
    }
}
