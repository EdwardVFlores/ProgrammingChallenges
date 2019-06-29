package programmingchallenges;

/*
Link to problem:
https://leetcode.com/problems/goat-latin/
*/
public class GoatLatin {

        public static void main(String[] args) {
            System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
        }
    
    public static String toGoatLatin(String S) {
        String[] wordArray = S.split(" ");
        String newString="";
        String numOfAs = "";
        for(String word : wordArray){
            numOfAs += "a";
            switch(word.toLowerCase().charAt(0)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    newString += word + "ma" + numOfAs + " ";
                    break;
                default:
                    newString += word.substring(1, word.length()) + word.charAt(0) + "ma" + numOfAs + " ";
                    break;
            }
        }
        return newString.substring(0,newString.length()-1);
    }
    
}
