# 20. Valid Parentheses

- Difficulty: Easy
- Topics: Stack, String
- Problem: https://leetcode.com/problems/valid-parentheses/

## Approach
Push the expected closing bracket for each opening bracket onto an ArrayDeque. A closing bracket must match the most recent expected bracket; reject if the stack is empty or the bracket differs. An odd-length input cannot be balanced. After scanning, accept only if the stack is empty. The stack invariant is that it contains the unmatched opening brackets' expected closers in reverse order of appearance.

Time: O(n). Auxiliary space: O(n), including the character array and stack.

## Local verification (2026-11-26)
Run `javac Solution.java TestSolution.java && java TestSolution` from this directory. Executed with OpenJDK 21.0.12.1: 55,997 checks passed (9 explicit sample/edge cases, 2 length-10,000 stress cases, and all 55,986 bracket strings of lengths 1 through 6 against an independent adjacent-pair-removal reference). See TestSolution.java for expected values. LeetCode hidden tests and account submission are unverified.
