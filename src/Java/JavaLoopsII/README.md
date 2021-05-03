# Java Loops II

We use the integers *a, b*, and *n* to create the following series:

<img src="C:\workspace\HackerRank\src\JavaLoopsII\image-01.png" alt="image-20210428111848663" style="zoom:80%;" />

You are given ***q*** queries in the form of ***a, b*** and ***n***. For each query, print the series corresponding to the given ***a, b*** and ***n*** values as a single line of space-separated integers.

**Input Format**

The first line contains an integer, ***q***, denoting the number of queries.
Each line ***i*** of the ***q*** subsequent lines contains three space-separated integers describing the respective ***ai, bi,*** and ***ni*** values for that query.

**Constraints**

<img src="C:\workspace\HackerRank\src\JavaLoopsII\image-02.png" alt="image-20210428112457092" style="zoom:80%;" />

**Output Format**

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of space-separated integers.

**Sample Input**

```
2
0 2 10
5 3 5
```

**Sample Output**

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

**Explanation**

We have two queries:

1. We use ***a=0, b=2,*** and ***n=10*** to produce some series ***S0, S1, ... , Sn-1***:

   <img src="C:\workspace\HackerRank\src\JavaLoopsII\image-03.png" alt="image-20210428112742072" style="zoom:80%;" />

   ... and so on.

   Once we hit ***n=10***, we print the first ten terms as a single line of space-separated integers.

   

2. We use ***a=5, b=3,*** and ***n=5*** to produce some series ***S0, S1, ... , Sn-1***:

   <img src="C:\workspace\HackerRank\src\JavaLoopsII\image-04.png" alt="image-20210428112818711" style="zoom:80%;" />

   We then print each element of our series as a single line of space-separated values.

