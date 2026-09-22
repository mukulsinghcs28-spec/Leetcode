# First Unique Character in a String

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 22, 2026 |
| **Tags** | Hash Table, String, Queue, Counting |
| **Link** | [View Problem](https://leetcode.com/problems/first-unique-character-in-a-string/) |
| **Runtime** | 6 ms |
| **Memory** | 47.2 MB |

## Problem Description

<p>Given a string <code>s</code>, find the <strong>first</strong> non-repeating character in it and return its index. If it <strong>does not</strong> exist, return <code>-1</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "leetcode"</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>The character <code>'l'</code> at index 0 is the first character that does not occur at any other index.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "loveleetcode"</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = "aabb"</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of only lowercase English letters.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: JAVA || 100% faster code || Easy Solution with Explanation
**Author**: [@shivrastogi](https://leetcode.com/shivrastogi/)
**Upvotes**: 176 👍
**Link**: [View Original Post](https://leetcode.com/problems/first-unique-character-in-a-string/solutions/2431836/)

---

	PLEASE UPVOTE IF YOU LIKE.
```
class Solution {
     public int firstUniqChar(String s) {
        // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c=\'a\'; c<=\'z\';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index\'s which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain\'s Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }   
}
```

</details>
