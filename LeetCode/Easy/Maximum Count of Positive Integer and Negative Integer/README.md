# Maximum Count of Positive Integer and Negative Integer

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 18, 2026 |
| **Tags** | Array, Binary Search, Counting |
| **Link** | [View Problem](https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/) |
| **Runtime** | 0 ms |
| **Memory** | 47 MB |

## Problem Description

<p>Given an array <code>nums</code> sorted in <strong>non-decreasing</strong> order, return <em>the maximum between the number of positive integers and the number of negative integers.</em></p>

<ul>
	<li>In other words, if the number of positive integers in <code>nums</code> is <code>pos</code> and the number of negative integers is <code>neg</code>, then return the maximum of <code>pos</code> and <code>neg</code>.</li>
</ul>

<p><strong>Note</strong> that <code>0</code> is neither positive nor negative.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [-2,-1,-1,1,2,3]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [-3,-2,-1,0,0,1,2]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [5,20,66,1314]
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2000</code></li>
	<li><code>-2000 &lt;= nums[i] &lt;= 2000</code></li>
	<li><code>nums</code> is sorted in a <strong>non-decreasing order</strong>.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Can you solve the problem in <code>O(log(n))</code> time complexity?</p>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: [C++|Java|Python3] binary search
**Author**: [@ye15](https://leetcode.com/ye15/)
**Upvotes**: 45 👍
**Link**: [View Original Post](https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/solutions/3017003/)

---

Please pull this [commit](https://github.com/gaosanyong/leetcode/commit/cd738c7122f758231c4f575936d09271343de490) for solutions of weekly 327. 

**Intuition**
We binary search for the number of negative numbers and positive numbers in the array. 

**Implementation**
**C++**
```
class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int neg = lower_bound(nums.begin(), nums.end(), 0) - nums.begin(), pos = nums.end() - upper_bound(nums.begin(), nums.end(), 0); 
        return max(neg, pos); 
    }
};
```
**Java**
```
class Solution {
    private static int bisect_left(int[] nums, int target) {
        int lo = 0, hi = nums.length; 
        while (lo < hi) {
            int mid = lo + (hi - lo)/2; 
            if (nums[mid] < target) lo = mid+1; 
            else hi = mid; 
        }
        return lo; 
    }
    
    public int maximumCount(int[] nums) {
        int neg = bisect_left(nums, 0), pos = nums.length - bisect_left(nums, 1); 
        return Math.max(neg, pos); 
    }
}
```
**Python3**
```
class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        neg = bisect_left(nums, 0)
        pos = len(nums) - bisect_right(nums, 0)
        return max(neg, pos)
```
**Complexity**
Time `O(logN)`
Space `O(1)`

</details>
