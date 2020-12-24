class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> differentWords = new HashSet<>();
        for(int i = 0; i < words.length; i ++){
            StringBuilder word = new StringBuilder();
            for(char c : words[i].toCharArray()){
                word.append(morseCode[c - 'a']);
            }
            differentWords.add(word.toString());
        }
        return differentWords.size();
    }
}