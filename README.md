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
