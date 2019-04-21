I paired with Jessica Zuchowski on this challenge in class.

# Reverse an Array

The following information was found at http://www.java67.com/2016/10/3-ways-to-reverse-array-in-java-coding-interview-question.html

Three ways to reverse an array in Java

Solution 1 - Revere array in Place
Solution 2 - Using ArrayList
Solution 3 - By using ArrayUtils.reverse()

Solution 1 is what I attempted to do in the challenge that I submitted.

## Challenge
The function should take an array and return the values within the array in reverse order. There are multiple arrays given in the test to plug and play and make sure that the function returns the values in reverse. Below are those sample arrays.

Input

[1, 2, 3, 4, 5, 6]	

[89, 2354, 3546, 23, 10, -923, 823, -12]

[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]	

Output

[6, 5, 4, 3, 2, 1]

[-12, 823, -923, 10, 23, 3546, 2354, 89]

[199, 197, 193, 191, 181, 179, 173, 167, 163, 157, 151, 149, 139, 137, 131, 127, 113, 109, 107, 103, 101, 97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2]



## Approach & Efficiency
My approach was to reverse the array in place. I did this by introducing the variable temp, which I then was able to make equal to each indice within the array and change the location of each value within the array. I left the value of the indice alone and just used an equation to change the indice numbering alone. Therefore I only had to iterate over half of the array so I divided the array length by 2 in the loop equation.

As stated in class we are not referencing the Big 0 yet, so I will leave this for the next challenge.

## Solution
[White Board Image](../assets/array_reverse.jpg)

