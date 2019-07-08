package programmingchallenges;

// https://open.kattis.com/problems/alphabetspam

import java.util.Scanner;

public class AlphabetSpam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(alphabetSpam(input.nextLine()));
    }
    
    public static String alphabetSpam(String s){
        char[] sArr = s.toCharArray();
        int upper=0;
        int lower=0;
        int space=0;
        int etc  =0;
        for(char c : sArr){
            if(Character.isUpperCase(c)) upper++;
            else if(Character.isLowerCase(c)) lower++;
            else if(c == '_') space++;
            else etc++;
        }
        return (double)space/s.length() + "\n" 
                + (double)lower/s.length() + "\n" 
                + (double)upper/s.length() + "\n" 
                + (double)etc/s.length() + "\n";
        
    }
}