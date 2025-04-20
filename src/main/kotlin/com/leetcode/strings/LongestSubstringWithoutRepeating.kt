package com.leetcode.strings

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        
        val lastSeen = mutableMapOf<Char, Int>()
        var maxLength = 0
        var left = 0

        for (right in s.indices) {
            val currentChar = s[right]
            // If we've seen this character before and it's within our current window
            if (lastSeen.containsKey(currentChar) && lastSeen[currentChar]!! >= left) {
                // Jump left pointer directly to the position after the last occurrence
                left = lastSeen[currentChar]!! + 1
            }
            // Update the last seen position of the current character
            lastSeen[currentChar] = right
            // Update max length
            maxLength = maxOf(maxLength, right - left + 1)
        }
        
        return maxLength
    }
} 