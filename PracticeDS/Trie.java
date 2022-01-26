class Trie {

    class Node {
        char letter;
        Node[] children;
        boolean isWord;
        Node(char letter){
            this.letter = letter;
            children = new Node[26];
            isWord = false;
        }
    }
    
    Node root;
    
    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
        Node curr = root;
        for(char c: word.toCharArray()){
            int idx = c - 'a';
            if (curr.children[idx] == null) curr.children[idx] = new Node(c);
            curr = curr.children[idx];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node foundNode = getNode(word);
        return foundNode != null && foundNode.isWord;
    }
    
    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }
    
    private Node getNode(String word){
        Node curr = root;
        for(char c : word.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null) return null;
            curr = curr.children[idx];
        }
        return curr;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */