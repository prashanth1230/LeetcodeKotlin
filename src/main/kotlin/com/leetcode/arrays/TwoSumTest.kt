package com.leetcode.arrays

fun main() {
    println("Testing Two Sum solution")
    
    val solution = Solution()
    
    // Test case 1
    val nums1 = intArrayOf(2, 7, 11, 15)
    val target1 = 9
    val result1 = solution.twoSum(nums1, target1)
    assert(result1.contentEquals(intArrayOf(0, 1)))
    
    // Test case 2
    val nums2 = intArrayOf(3, 2, 4)
    val target2 = 6
    val result2 = solution.twoSum(nums2, target2)
    assert(result2.contentEquals(intArrayOf(1, 2)))
    
    // Test case 3
    val nums3 = intArrayOf(3, 3)
    val target3 = 6
    val result3 = solution.twoSum(nums3, target3)
    assert(result3.contentEquals(intArrayOf(0, 1)))
    
    println("All Two Sum tests passed!")
} 