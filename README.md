# leetcode-100-days-challenge
# Day 01 – Two Sum

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

## Approach

I used a **HashMap** to store the numbers I have already visited.

Steps:

1. Traverse the array.
2. For each element, calculate `target - current number`.
3. Check if this value already exists in the HashMap.
4. If it exists, return the indices.
5. Otherwise store the current number and its index in the HashMap.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Language

Java

# Day 02 – Valid Parentheses

## Problem

Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

A string is valid if:

1. Open brackets are closed by the same type of brackets.
2. Open brackets are closed in the correct order.

## Approach

I used a **Stack** to solve this problem.

Steps:

1. Traverse each character of the string.
2. If the character is an opening bracket `(` `{` `[`, push it into the stack.
3. If the character is a closing bracket:

   * Check if the stack is empty → return false.
   * Otherwise compare the top of the stack with the closing bracket.
4. If they match, pop the stack.
5. After processing the entire string, the stack should be empty for a valid string.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Language

Java


# Day 03 – Climbing Stairs

## Problem

You are climbing a staircase. It takes **n steps** to reach the top.

Each time you can climb either **1 step** or **2 steps**.

Find the number of **distinct ways** to reach the top.

## Approach

This problem follows a **Dynamic Programming / Fibonacci pattern**.

To reach step `n`, we have two possibilities:

1. Climb **1 step from (n-1)**
2. Climb **2 steps from (n-2)**

So the recurrence relation becomes:

ways(n) = ways(n-1) + ways(n-2)

We compute the number of ways iteratively using two variables.

## Example

Input: n = 3

Ways to reach the top:

1 → 1 → 1
1 → 2
2 → 1

Output: 3

## Time Complexity

O(n)

## Space Complexity

O(1)

## Language

Java

# Day 04 – Maximum Subarray

## Problem

Given an integer array `nums`, find the **contiguous subarray** with the largest sum and return that sum.

A **subarray** is a continuous part of an array.

## Approach (Kadane's Algorithm)

This problem can be solved efficiently using **Kadane’s Algorithm**.

Idea:
While traversing the array, keep track of the **current subarray sum**.
If the current sum becomes negative, it is better to start a new subarray.

Steps:

1. Initialize two variables:

   * `currentSum` → stores the current subarray sum
   * `maxSum` → stores the maximum sum found so far
2. Traverse the array.
3. Add the current element to `currentSum`.
4. Update `maxSum` with the maximum value.
5. If `currentSum` becomes negative, reset it to `0`.

## Example

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Maximum subarray:

```
[4, -1, 2, 1]
```

Output:

```
6
```

## Time Complexity

O(n)

## Space Complexity

O(1)

## Algorithm Used

Kadane's Algorithm

## Language

Java
