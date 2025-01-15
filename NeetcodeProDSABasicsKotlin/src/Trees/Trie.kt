package Trees

class Trie {
    private class TrieNode{
        var isWord = false
        val children:MutableMap<Char, TrieNode> = mutableMapOf()
    }
    private val root = TrieNode()
    fun insert(word:String){
        var current = root
        for(c in word){
            current = current.children.computeIfAbsent(c){ TrieNode() }
        }
        current.isWord = true
    }

    fun search(word:String):Boolean{
        var current = root
        for(c in word){
            current = current.children[c]?:return false
        }
        return current.isWord
    }
}