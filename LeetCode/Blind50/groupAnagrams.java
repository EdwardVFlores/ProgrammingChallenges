public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> answers = new ArrayList<>();
    HashMap<String,ArrayList<String>> words = new HashMap<>();
    for(String s : strs) {
        int[] map = new int[26];
        for(char c : s.toCharArray()){
            map[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int num: map){
            sb.append(num+",");
        }
        String key = sb.toString();
        if(words.containsKey(key)){
            ArrayList<String> stringg = words.get(key);
            stringg.add(s);
        } else {
            ArrayList<String> word = new ArrayList<>();
            word.add(s);
            words.put(key,word);
        }
    }
    for(ArrayList list : words.values()){
        answers.add(list);
    }
    return answers;
}