# Kth Missing Positive Number

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 20, 2026 |
| **Tags** | Array, Binary Search |
| **Link** | [View Problem](https://leetcode.com/problems/kth-missing-positive-number/) |
| **Runtime** | 0 ms |
| **Memory** | 44.4 MB |

## Problem Description

<p>Given an array <code>arr</code> of positive integers sorted in a <strong>strictly increasing order</strong>, and an integer <code>k</code>.</p>

<p>Return <em>the</em> <code>k<sup>th</sup></code> <em><strong>positive</strong> integer that is <strong>missing</strong> from this array.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> arr = [2,3,4,7,11], k = 5
<strong>Output:</strong> 9
<strong>Explanation: </strong>The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5<sup>th</sup>&nbsp;missing positive integer is 9.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> arr = [1,2,3,4], k = 2
<strong>Output:</strong> 6
<strong>Explanation: </strong>The missing positive integers are [5,6,7,...]. The 2<sup>nd</sup> missing positive integer is 6.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 1000</code></li>
	<li><code>1 &lt;= arr[i] &lt;= 1000</code></li>
	<li><code>1 &lt;= k &lt;= 1000</code></li>
	<li><code>arr[i] &lt; arr[j]</code> for <code>1 &lt;= i &lt; j &lt;= arr.length</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<p>Could you solve this problem in less than O(n) complexity?</p>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java 1 liner O(n) simplest, easy to understand beats 100%
**Author**: [@niranjvin](https://leetcode.com/niranjvin/)
**Upvotes**: 329 👍
**Link**: [View Original Post](https://leetcode.com/problems/kth-missing-positive-number/solutions/876751/)

---

Note that the array is in strictly increasing order and hence there is no repetition.

Think of this case, if every element in the array > k , the answer would be k. 

So, for every element <= k , you need to increment k. (i.e. when you iterate from left to right). And since the array is in increasing order, you can break out of the loop on the first instance this condition fails.

```
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr){
			if(i <= k) k++; else break;
		}
        return k;
    }
}
```

</details>
