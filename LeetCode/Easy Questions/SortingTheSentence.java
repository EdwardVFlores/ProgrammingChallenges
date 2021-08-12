/*
Problem: https://leetcode.com/problems/sorting-the-sentence/
*/

public class SortingTheSentence {
    public static void main(String[] args){
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        for(String word : words){
            sortedWords[word.charAt(word.length()-1) - '0' - 1] = word.substring(0, word.length()-1);
        }
        for(String word : sortedWords){
            sb.append(word).append(" ");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}
