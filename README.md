# Task 3

Shuffle the digits of an integer.
There is a company that has a very creative way of managing its accounts. Every time they want to write down a number, they shuffle its digits in the
following way: they alternatively write one digit from the front of the number and one digit from the back, then the second digit from the front and the
second from the back, and so on until the length of the shuffled number is the same as that of the original.

Write a function

class Solution { public int solution(int A); }

that, given a positive integer A, returns its shuffled representation.

For example, given A = 123456 the function should return 162534.
Given A = 130 the function should return 103.

Assume that:
A is an integer within the range [0..100,000,000].
