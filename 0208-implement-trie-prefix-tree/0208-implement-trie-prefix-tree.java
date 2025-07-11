class TrieNode{
    Map<Character,TrieNode>children=new HashMap<>();
    boolean isWord=false;
}
class Trie {
    private TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur=root;
        for(char ch:word.toCharArray()){
            cur.children.putIfAbsent(ch,new TrieNode());
            cur=cur.children.get(ch);
        }
        cur.isWord=true;
    }
    public boolean search(String word) {
        TrieNode cur=root;
        for(char ch:word.toCharArray()){
            if(!cur.children.containsKey(ch)){
                return false;
            }
            cur=cur.children.get(ch);
        }
        return cur.isWord;
    }

    
    public boolean startsWith(String prefix) {
        TrieNode cur=root;
        for(char ch:prefix.toCharArray()){
            if(!cur.children.containsKey(ch)){
                return false;
            }
            cur=cur.children.get(ch);
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