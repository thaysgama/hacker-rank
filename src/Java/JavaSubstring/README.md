# Java Substring

Given a string, ***s***, and two indices, ***start*** and ***end***, print a [substring](https://en.wikipedia.org/wiki/Substring) consisting of all characters in the inclusive range from ***start*** to ***end-1***. You'll find the *String* class' [substring method](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) helpful in completing this challenge.

**Input Format**

The first line contains a single string denoting ***s***.
The second line contains two space-separated integers denoting the respective values of ***start*** and ***end***.

**Constraints**

- ![formula](https://render.githubusercontent.com/render/math?math=\large1\leq|s|\leq100)
- ![formula](https://render.githubusercontent.com/render/math?math=\large0\leq%20start%20<%20end%20\leq%20n)
- String ***s*** consists of English alphabetic letters (i.e., **[a - z A-Z]** ) only.

**Output Format**

Print the substring in the inclusive range from ***start*** to ***end-1***.

**Sample Input**

```
Helloworld
3 7
```

**Sample Output**

```
lowo
```

**Explanation**

In the diagram below, the substring is highlighted in *green*:

![substring.png](https://s3.amazonaws.com/hr-challenge-images/22039/1470896981-637b6a022f-substring.png)