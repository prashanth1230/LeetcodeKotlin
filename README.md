# LeetCode Solutions in Kotlin

![Build Status](https://github.com/prashanth1230/LeetcodeKotlin/actions/workflows/build.yml/badge.svg)
[![codecov](https://codecov.io/gh/prashanth1230/LeetcodeKotlin/branch/main/graph/badge.svg)](https://codecov.io/gh/prashanth1230/LeetcodeKotlin)

This repository contains solutions to various LeetCode problems implemented in Kotlin. Each solution is organized by problem category and includes test cases.

## Project Structure

```
src/main/kotlin/com/leetcode/
├── arrays/
│   ├── TwoSum.kt
│   └── TwoSumTest.kt
└── strings/
    ├── LongestSubstringWithoutRepeating.kt
    └── Main.kt
```

## Problems Solved

### Arrays
1. [Two Sum](https://leetcode.com/problems/two-sum/)
   - Solution: `src/main/kotlin/com/leetcode/arrays/TwoSum.kt`
   - Test: `src/main/kotlin/com/leetcode/arrays/TwoSumTest.kt`

### Strings
1. [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
   - Solution: `src/main/kotlin/com/leetcode/strings/LongestSubstringWithoutRepeating.kt`
   - Test: `src/main/kotlin/com/leetcode/strings/Main.kt`

## Building and Running

This project uses Gradle for building and testing. To build and run the tests:

```bash
./gradlew build
```

To run a specific test file:

```bash
./gradlew test --tests "com.leetcode.arrays.TwoSumTest"
```

## Requirements

- Java 17 or higher
- Gradle 8.5 or higher
- Kotlin 1.9.22

## Contributing

Feel free to contribute by:
1. Adding new problem solutions
2. Improving existing solutions
3. Adding more test cases
4. Improving documentation

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Code Coverage

This project uses JaCoCo for code coverage reporting. Coverage reports are automatically generated and uploaded to Codecov after each successful build.

You can view:
- Detailed coverage reports on [Codecov](https://codecov.io/gh/prashanth1230/LeetcodeKotlin)
- Local coverage reports in `build/reports/jacoco/test/html/index.html` after running tests

To generate coverage reports locally:
```bash
./gradlew test jacocoTestReport
```
