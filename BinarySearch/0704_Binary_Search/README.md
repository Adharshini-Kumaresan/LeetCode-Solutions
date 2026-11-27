# 704. Binary Search

Difficulty: Easy. Topics: Array, Binary Search.
Problem: https://leetcode.com/problems/binary-search/

Find the index of a target in a strictly increasing integer array, or return -1 if absent.

Maintain the inclusive candidate interval [left, right]. Compare its midpoint to the target; discard the half that cannot contain the target. Each iteration shrinks the interval, and if the target exists it remains in that interval until found. The midpoint calculation avoids overflow from adding both endpoints.

Time: O(log n). Auxiliary space: O(1).

## Verification
Compiled and executed with javac 21.0.12.1 on November 27, 2026. All 10,008 checks passed: eight explicit sample and boundary cases and 10,000 seeded randomized comparisons against linear search. Run `javac Solution.java TestSolution.java && java TestSolution` in this directory. LeetCode hidden tests and account submission are unverified.
