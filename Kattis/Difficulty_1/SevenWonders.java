package programmingchallenges;

import java.util.Scanner;
public class SevenWonders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cards = scanner.next();
        char cardDeck[] = cards.toCharArray();
        int T=0;
        int C=0;
        int G=0;
        for(int i=0; i<cardDeck.length; i++){
             switch(cardDeck[i]){
                case 'T':T++;
                    break;
                case 'C':C++;
                    break;
                case 'G':G++;
                    break;
             }
        }
        int addSeven=0;
        int beforeWeAdd = ((int)(Math.pow(T, 2)) + (int)(Math.pow(C, 2)) + (int)(Math.pow(G, 2)));
        while(T>0 && C>0 && G>0){
            T--;
            C--;
            G--;
            addSeven += 7;
        }
        System.out.println(beforeWeAdd + addSeven);
    }
}
