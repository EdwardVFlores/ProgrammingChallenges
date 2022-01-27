class Trie {
    
    class Node{
        char c;
        Node[] children;
        boolean isWord = false;
        Node(char c){
            this.c = c;
            children = new Node[26];
        }
    }
    
    Node root;
    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
        Node curr = root;
        for(char c : word.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null) curr.children[idx] = new Node(c);
            curr = curr.children[idx];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(char c : word.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if(curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return true;
    }
    
    
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */