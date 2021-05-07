# Java Loops II

We use the integers *a, b*, and *n* to create the following series:

<img src="https://render.githubusercontent.com/render/math?math=(a%2B2^{0}\cdot%20b),(a%2B2^{0}\cdot%20b%2B2^{1}\cdot%20b),...,(a%2B2^{0}\cdot%20b%2B2^{1}\cdot%20b%2B...%2B2^{n-1}\cdot%20b)" alt="formula" style="zoom:120%;" />

You are given ***q*** queries in the form of ***a, b*** and ***n***. For each query, print the series corresponding to the given ***a, b*** and ***n*** values as a single line of space-separated integers.

**Input Format**

The first line contains an integer, ***q***, denoting the number of queries.
Each line ***i*** of the ***q*** subsequent lines contains three space-separated integers describing the respective ***ai, bi,*** and ***ni*** values for that query.

**Constraints**

- <img src="https://render.githubusercontent.com/render/math?math=0%20\leq%20q%20\leq%20500%20" alt="formula" style="zoom:120%;" />
- <img src="https://render.githubusercontent.com/render/math?math=0%20\leq%20a,b%20\leq%2050" alt="formula" style="zoom:120%;" />
- <img src="https://render.githubusercontent.com/render/math?math=1%20\leq%20n%20\leq%2015" alt="formula" style="zoom:120%;" />

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

   - <img src="https://render.githubusercontent.com/render/math?math=s_{0}=0%2B1\cdot%202=2" alt="formula" style="zoom:120%;" />
   - <img src="https://render.githubusercontent.com/render/math?math=s_{1}=0%2B1\cdot%202%2B2\cdot%202=6%20" alt="formula" style="zoom:120%;" />
   - <img src="https://render.githubusercontent.com/render/math?math=s_{2}=0%2B1\cdot%202%2B2\cdot%202%2B4\cdot%202=14" alt="formula" style="zoom:120%;" />

   ... and so on.

   Once we hit ***n=10***, we print the first ten terms as a single line of space-separated integers.

   

2. We use ***a=5, b=3,*** and ***n=5*** to produce some series ***S0, S1, ... , Sn-1***:

   - <img src="https://render.githubusercontent.com/render/math?math=s_{0}=5%2B1\cdot%203=8" alt="formula" style="zoom:120%;" />

   - <img src="https://render.githubusercontent.com/render/math?math=s_{1}=5%2B1\cdot%203%2B2\cdot%203=14" alt="formula" style="zoom:120%;" />

   - <img src="https://render.githubusercontent.com/render/math?math=s_{2}=5%2B1\cdot%203%2B2\cdot%203%2B4\cdot%203=26" alt="formula" style="zoom:120%;" />

   - <img src="https://render.githubusercontent.com/render/math?math=s_{3}=5%2B1\cdot%203%2B2\cdot%203%2B4\cdot%203%2B8\cdot%203=50" alt="formula" style="zoom:120%;" />

   - <img src="https://render.githubusercontent.com/render/math?math=s_{4}=5%2B1\cdot%203%2B2\cdot%203%2B4\cdot%203%2B8\cdot%203%2B16\cdot%203=98" alt="formula" style="zoom:120%;" />

   We then print each element of our series as a single line of space-separated values.