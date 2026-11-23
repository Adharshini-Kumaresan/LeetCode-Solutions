# 217. Contains Duplicate

- **Problem:** https://leetcode.com/problems/contains-duplicate/
- **Difficulty:** Easy
- **Topic:** Arrays, Hash Set
- **Language:** Java
- **Date added:** 2026-11-23

## Approach

Scan the array from left to right while storing values in a `HashSet`. The `add` method returns `false` when a value is already present; return `true` immediately in that case. If the scan finishes without a repeated value, return `false`.

**Time:** O(n) expected, assuming average constant-time hash-set operations.  
**Space:** O(n) worst case for the set.

## Tests

Compiled with OpenJDK 21 and ran `TestSolution.java` locally. **All 8 tests passed**: three official examples, single element, negative duplicate, distinct integer extremes, repeated zero, and an empty-array robustness check. The empty array is outside LeetCode's stated nonempty input constraint.

**Not verified:** Submission to LeetCode and its hidden test suite. No LeetCode account action was performed.

## Run locally

```bash
javac Solution.java TestSolution.java
java TestSolution
```
