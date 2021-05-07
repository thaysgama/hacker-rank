# Java Substrings Comparisons

We define the following terms:

- [Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographical_order), also known as *alphabetic* or *dictionary* order, orders characters as follows:

  ![formula](https://render.githubusercontent.com/render/math?math=\large%20A%20<%20B%20<%20...%20<%20Y%20<%20Z%20<%20a%20<%20b%20<%20...%20<%20y%20<%20z)

  For example, `ball < cat`, `dog < dorm`, `Happy < happy`, `Zoo < ball`.

- A [substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of `abc` are `a`, `b`, `c`, `ab`, `bc`, and `abc`.

Given a string, ***s*** , and an integer, ***k*** , complete the function so that it finds the lexicographically *smallest* and *largest* substrings of length ***k***.

**Function Description**

Complete the *getSmallestAndLargest* function in the editor below.

*getSmallestAndLargest* has the following parameters:

- *string s:* a string
- *int k:* the length of the substrings to find

**Returns**

- *string:* the string ' + "\n" + ' where and are the two substrings

**Input Format**

The first line contains a string denoting ***s***.
The second line contains an integer denoting ***k***.

**Constraints**

- ![formula](https://render.githubusercontent.com/render/math?math=\large1\leq|s|\leq1000)
- ***s*** consists of English alphabetic letters only (i.e., `[a-z A-Z]`).

**Sample Input 0**

```
welcometojava
3
```

**Sample Output 0**

```
ava
wel
```

**Explanation 0**

String ***s="welcometojava"*** has the following lexicographically-ordered substrings of length ***k=3***:

***["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]***

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., `ava\nwel`).

The stub code in the editor then prints `ava` as our first line of output and `wel` as our second line of output.

