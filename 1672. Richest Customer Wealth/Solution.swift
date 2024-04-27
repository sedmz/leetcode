class Solution {
    func maximumWealth(_ accounts: [[Int]]) -> Int {
        var maximumWealth = 0 
        accounts.map { $0.reduce(0, +) }
                .forEach { maximumWealth = max(maximumWealth, $0) }
        return maximumWealth        
    }
}

// https://leetcode.com/problems/richest-customer-wealth/submissions/1243058461