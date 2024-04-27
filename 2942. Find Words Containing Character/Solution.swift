class Solution {
    func findWordsContaining(_ words: [String], _ x: Character) -> [Int] {
        return (0..<words.count).filter { words[$0].contains(x) }
    }
}
// https://leetcode.com/problems/find-words-containing-character/submissions/1243014526
