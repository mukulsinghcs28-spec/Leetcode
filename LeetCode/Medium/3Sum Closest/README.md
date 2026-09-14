# 3Sum Closest

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | September 14, 2026 |
| **Tags** | Array, Two Pointers, Sorting |
| **Link** | [View Problem](https://leetcode.com/problems/3sum-closest/) |
| **Runtime** | 17 ms |
| **Memory** | 45.4 MB |

## Problem Description

<p>You are given an integer array <code>nums</code> of length <code>n</code> and an integer <code>target</code>.</p>

<p>Find three integers at <strong>distinct indices</strong> in <code>nums</code> such that the sum is <strong>closest</strong> to <code>target</code>.</p>

<p>Return the sum of the three integers.</p>

<p>You may assume that each input would have <strong>exactly</strong> one solution.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [-1,2,1,-4], target = 1
<strong>Output:</strong> 2
<strong>Explanation:</strong> The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [0,0,0], target = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong> The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= nums.length &lt;= 500</code></li>
	<li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
	<li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: JAVA FASTEST AND EASIEST SOLUTION 😲😲😲🤯🤯
**Author**: [@abhiyadav05](https://leetcode.com/abhiyadav05/)
**Upvotes**: 132 👍
**Link**: [View Original Post](https://leetcode.com/problems/3sum-closest/solutions/3736495/)

---

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->O(N^2)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->O(1)
![Screenshot_20230205_171246.png](https://assets.leetcode.com/users/images/5c5c0ba7-1c0d-4826-9c1e-c86de4dcb9db_1688821081.4729018.png)


# Code
```
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum with the sum of the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum; // Update closest sum if the current sum is closer to the target
                }

                if (sum < target) {
                    j++; // Increment j to increase the sum
                } else {
                    k--; // Decrement k to decrease the sum
                }
            }
        }

        return closestSum;
    }
}

```

</details>
