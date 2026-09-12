# Pascal's Triangle II

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 12, 2026 |
| **Tags** | Array, Dynamic Programming |
| **Link** | [View Problem](https://leetcode.com/problems/pascals-triangle-ii/) |
| **Runtime** | 2 ms |
| **Memory** | 42.4 MB |

## Problem Description

<p>Given an integer <code>rowIndex</code>, return the <code>rowIndex<sup>th</sup></code> (<strong>0-indexed</strong>) row of the <strong>Pascal's triangle</strong>.</p>

<p>In <strong>Pascal's triangle</strong>, each number is the sum of the two numbers directly above it as shown:</p>
<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" style="height: 240px; width: 260px;">
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> rowIndex = 3
<strong>Output:</strong> [1,3,3,1]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> rowIndex = 0
<strong>Output:</strong> [1]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> rowIndex = 1
<strong>Output:</strong> [1,1]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= rowIndex &lt;= 33</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you optimize your algorithm to use only <code>O(rowIndex)</code> extra space?</p>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Another accepted Java solution
**Author**: [@jeantimex](https://leetcode.com/jeantimex/)
**Upvotes**: 223 👍
**Link**: [View Original Post](https://leetcode.com/problems/pascals-triangle-ii/solutions/38584/)

---

    public class Solution {
        public List<Integer> getRow(int k) {
            Integer[] arr = new Integer[k + 1];
            Arrays.fill(arr, 0);
            arr[0] = 1;
            
            for (int i = 1; i <= k; i++) 
                for (int j = i; j > 0; j--) 
                    arr[j] = arr[j] + arr[j - 1];
            
            return Arrays.asList(arr);
        }
    }

</details>
