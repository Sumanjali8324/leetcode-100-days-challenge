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

