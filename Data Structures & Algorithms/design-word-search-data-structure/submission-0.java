class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int idx = c - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        return dfs(word,0,root);
    }
    private boolean dfs(String word, int idex ,TrieNode curr){

        if(idex == word.length()){
            return curr.isWord;
        }
        char c = word.charAt(idex);

        if(c == '.'){
            for(int i=0; i< 26;i++){
                if(curr.children[i] != null){
                    if(dfs(word,idex+1,curr.children[i])) return true;
                }
            }
            return false;
        }
        int idx = c - 'a';
        if(curr.children[idx] == null) return false;

        return dfs(word,idex+1,curr.children[idx]);
    }
}
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isWord = false;
}