class Solution {
    func differenceOfSums(_ n: Int, _ m: Int) -> Int {
        return (1...n).map { $0 % m == 0 ? -$0 : $0 }.reduce(0, +)
    }
}
