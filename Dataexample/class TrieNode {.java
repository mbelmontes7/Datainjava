// class TrieNode {
//     TrieNode[] children = new TrieNode[26]; // For 26 letters
//     boolean isEndOfWord; // true if the node represents end of a word
// }

// class Trie {
//     TrieNode root = new TrieNode();

//     void insert(String word) {
//         TrieNode node = root;
//         for (char c : word.toCharArray()) {
//             if (node.children[c - 'a'] == null) {
//                 node.children[c - 'a'] = new TrieNode();
//             }
//             node = node.children[c - 'a'];
//         }
//         node.isEndOfWord = true;
//     }

//     boolean search(String word) {
//         TrieNode node = root;
//         for (char c : word.toCharArray()) {
//             node = node.children[c - 'a'];
//             if (node == null) return false;
//         }
//         return node.isEndOfWord;
//     }
// }