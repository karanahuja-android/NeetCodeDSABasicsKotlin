package test.Trees

import Trees.Trie
import org.junit.jupiter.api.Test

class TrieTest {
    @Test
    fun testTrie(){
        val myTrie = Trie()
        myTrie.insert("karan")
        myTrie.insert("karen")
        println(myTrie.search("karen"))
        println(myTrie.search("karan"))
        println(myTrie.search("kare"))
    }
}