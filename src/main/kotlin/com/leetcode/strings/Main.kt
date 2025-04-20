package com.leetcode.strings

fun main() {
    println("Testing Longest Substring Without Repeating Characters solution")
    
    // First test case
    assert(Solution().lengthOfLongestSubstring("abcabcbb") == 3)

    // Second test case
    assert(Solution().lengthOfLongestSubstring("bbbbb") == 1)

    // Third test case
    assert(Solution().lengthOfLongestSubstring("pwwkew") == 3)
    
    println("All tests passed!")
} 