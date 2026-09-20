# Arranging Coins

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 20, 2026 |
| **Tags** | Math, Binary Search |
| **Link** | [View Problem](https://leetcode.com/problems/arranging-coins/) |
| **Runtime** | 1 ms |
| **Memory** | 43.1 MB |

## Problem Description

<p>You have <code>n</code> coins and you want to build a staircase with these coins. The staircase consists of <code>k</code> rows where the <code>i<sup>th</sup></code> row has exactly <code>i</code> coins. The last row of the staircase <strong>may be</strong> incomplete.</p>

<p>Given the integer <code>n</code>, return <em>the number of <strong>complete rows</strong> of the staircase you will build</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/arrangecoins1-grid.jpg" style="width: 253px; height: 253px;">
<pre><strong>Input:</strong> n = 5
<strong>Output:</strong> 2
<strong>Explanation:</strong> Because the 3<sup>rd</sup> row is incomplete, we return 2.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/arrangecoins2-grid.jpg" style="width: 333px; height: 333px;">
<pre><strong>Input:</strong> n = 8
<strong>Output:</strong> 3
<strong>Explanation:</strong> Because the 4<sup>th</sup> row is incomplete, we return 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: 4 Java Solution with Explanations: Iterative, Binary Search, Algebra Math, and Quadratic Math
**Author**: [@AlexanderTarn](https://leetcode.com/AlexanderTarn/)
**Upvotes**: 170 👍
**Link**: [View Original Post](https://leetcode.com/problems/arranging-coins/solutions/1559930/)

---

To summarize:
* Iterative: O(sqrt(N)) time || O(1) space
* Binary Search: O(log(N)) time|| O(1) space
* Math: O(log(N)) time || O(1) space (best)

Where "N" is equal to the amount of coins we are given

---

# **Iterative Approach:**

An iterative approach is adding coins to are staircase until we can\'t add anymore, and then returning the last row we were able to complete

```
class Solution {
    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
		while(n > 0){ // checking to see if we have used all our coins
			i++; // increasing our row
			n = n-i; // adding coins to our row
		}
		return i-1; // we return our current row minus one because the last row is our completed row
    }
}
```

**Time Complexity:** O(sqrt(N)) || We take larger and larger chunks with each iteration

**Space Complexity:** O(1) || Constant Space is used

---

# **Binary Search Approach:**

While an Iterative approach works, what if we were to use a little math to help us solve our problem?
Our staircase can be represented as a triangle of size "k", and can contain "N" coins.
Using the area of a triangle formula, we get:

(K^2)/2 = N

This doesn\'t work though, because of the fact that there is a daigonal line that isn\'t counted when using this formula

We can count in this diagonal line by increasing the base of our staircase by 1, leaving us with:

K * (K+1)/2 = N

We can implement Binary Search now, by setting
* Our "left" marker to 0
* Our "right" marker to N, since we cannot use more coins than we our given
* Our "pivot" to ```left + (right-left)/2```, we use this equation instead of ```(left + right)/2``` to avoid getting an integer overflow
* The "area" of our proposed staircase to ```(pivot * (pivot+1))/2```

To implement Binary Search with these variables, we:
* Check if our area is equal to the amount of coins that we are given
	* at which point we return "pivot"
* If we used more coins than our limit of coins, then we set "right" to "pivot-1", to use less coins during the next iteration
* If we used less coins than our limit of coins, then we set "left" to "pivot+1", to use more coins during the next iteration
* When our "left" is greater than our "right", our "left" will be set to a incomplete row and our "right" will be set to a complete row, so we return "right"

```
class Solution {
    public int arrangeCoins(int n) {
        long left = 0; // we use "long" because we may get an integer overflow
		long right = n;
		while(left <= right){
			long pivot = left + (right - left) / 2;
			long coinsUsed = pivot * (pivot + 1)/2;
			if(coinsUsed == n){
				return (int)pivot;
			}
			if(n < coinsUsed){
				right = pivot-1;
			}
			else{
				left = pivot + 1;
			}
		}
		return (int)right; // cast as an "int" because it was initiliazed as a "long"
    }
}
```

**Time Complexity:** O(log(N)) || We narrow our searching area by half in each iteration

**Space Complexity:** O(1) || Constant space is used

---

# **Math Approach (using algebra):**

Let\'s revist our equation to calculate the area:

(K * (K+1))/2 = N

We know that our answer not only has to be "N", but it can also be less than "N", so we can change our equation to:

(K * (K+1))/2 <= N

If we want to return "K", then what is stopping us from changing to equation so that one side contains "K"?

(K * (K+1))/2 <= N

(K * (K+1)) <= 2N

K^2 + K <= 2N

Complete the square:

K^2 + K + 1/4 - 1/4 <= 2N

(K + 1/2)^2 - 1/4 <= 2N

(K + 1/2)^2 <= 2N + 1/4

K + 1/2 <= sqrt(2N + 1/4)

Our final equation:

K <= sqrt(2N + 1/4) - 1/2

We have to solve this as a double, and then return it as an integer

```
class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5); // cast "n" to "long" to avoid integer overflow
    }
}
```

**Time Complexity:** O(log(N)) || Square root takes log(N)

**Space Complexity:** O(1) || We only use constant space

---
# **Math Approach (using Quadratic Formula):**

Another way to use math is to use the quadratic formula:

(K * (K+1))/2 <= N

K * (K+1) <= 2N

K^2 + K <= 2N

K^2 + K - 2N <= 0

The quadratic formula is:

x = (-b +- sqrt(b^2 - 4ac))/2a

We use this equation to solve for K, where:

(1) * K^2 + (1) * K - 2N <= 0

x = K

a = 1

b = 1

c = -2N

so:

K <= (-1 + sqrt(1 + 8N))/2

and:

K <= (-1 - sqrt(1 + 8N))/2

Second solution is impossible, because it will return a negative number, and we can\'t use a negative number to create an area.

Final Solution: K <= (-1 + sqrt(1 + 8N))/2

```
class Solution {
    public int arrangeCoins(int n) {
        return (int)(-1 + (Math.sqrt(1 + 8 * (long)n )))/2; // cast "n" to "long" to avoid integer overflow
    }
}
```

**Time Complexity:** O(log(N)) || Square root takes log(N)

**Space Complexity:** O(1) || We only use constant space

---
# **Please Upvote and Comment What you think**



</details>
