<h2><a href="https://codeforces.com/contest/1367/problem/C" target="_blank" rel="noopener noreferrer">1367C — Social Distance</a></h2>

| | |
|---|---|
| **Difficulty** | 1300 |
| **Language** | C++17 (GCC 7-32) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1367C](https://codeforces.com/contest/1367/problem/C) |

## Topics
`constructive algorithms` `greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">C. Social Distance</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Polycarp and his friends want to visit a new restaurant. The restaurant has $$$n$$$ tables arranged along a straight line. People are already sitting at some tables. The tables are numbered from $$$1$$$ to $$$n$$$ in the order from left to right. The state of the restaurant is described by a string of length $$$n$$$ which contains characters "<span class="tex-font-style-tt">1</span>" (the table is occupied) and "<span class="tex-font-style-tt">0</span>" (the table is empty).</p><p>Restaurant rules prohibit people to sit at a distance of $$$k$$$ or less from each other. That is, if a person sits at the table number $$$i$$$, then all tables with numbers from $$$i-k$$$ to $$$i+k$$$ (except for the $$$i$$$-th) should be free. In other words, the absolute difference of the numbers of any two occupied tables must be strictly greater than $$$k$$$.</p><p>For example, if $$$n=8$$$ and $$$k=2$$$, then:</p><ul> <li> strings "<span class="tex-font-style-tt">10010001</span>", "<span class="tex-font-style-tt">10000010</span>", "<span class="tex-font-style-tt">00000000</span>", "<span class="tex-font-style-tt">00100000</span>" satisfy the rules of the restaurant; </li><li> strings "<span class="tex-font-style-tt">10100100</span>", "<span class="tex-font-style-tt">10011001</span>", "<span class="tex-font-style-tt">11111111</span>" do not satisfy to the rules of the restaurant, since each of them has a pair of "<span class="tex-font-style-tt">1</span>" with a distance less than or equal to $$$k=2$$$. </li></ul><p>In particular, if the state of the restaurant is described by a string without "<span class="tex-font-style-tt">1</span>" or a string with one "<span class="tex-font-style-tt">1</span>", then the requirement of the restaurant is satisfied.</p><p>You are given a binary string $$$s$$$ that describes the current state of the restaurant. It is guaranteed that the rules of the restaurant are satisfied for the string $$$s$$$.</p><p>Find the maximum number of free tables that you can occupy so as not to violate the rules of the restaurant. Formally, what is the maximum number of "<span class="tex-font-style-tt">0</span>" that can be replaced by "<span class="tex-font-style-tt">1</span>" such that the requirement will still be satisfied?</p><p>For example, if $$$n=6$$$, $$$k=1$$$, $$$s=$$$ "<span class="tex-font-style-tt">100010</span>", then the answer to the problem will be $$$1$$$, since only the table at position $$$3$$$ can be occupied such that the rules are still satisfied.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases in the test. Then $$$t$$$ test cases follow.</p><p>Each test case starts with a line containing two integers $$$n$$$ and $$$k$$$ ($$$1 \le k \le n \le 2\cdot 10^5$$$) — the number of tables in the restaurant and the minimum allowed distance between two people.</p><p>The second line of each test case contains a binary string $$$s$$$ of length $$$n$$$ consisting of "<span class="tex-font-style-tt">0</span>" and "<span class="tex-font-style-tt">1</span>" — a description of the free and occupied tables in the restaurant. The given string satisfy to the rules of the restaurant — the difference between indices of any two "<span class="tex-font-style-tt">1</span>" is more than $$$k$$$.</p><p>The sum of $$$n$$$ for all test cases in one test does not exceed $$$2\cdot 10^5$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case output one integer — the number of tables that you can occupy so as not to violate the rules of the restaurant. If additional tables cannot be taken, then, obviously, you need to output $$$0$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id005661618268359231" id="id002467756249792452" class="input-output-copier">Copy</div></div><pre id="id005661618268359231">6
6 1
100010
6 2
000000
5 1
10101
3 1
001
2 2
00
1 1
0
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00040957148645502706" id="id008395660770364508" class="input-output-copier">Copy</div></div><pre id="id00040957148645502706">1
2
0
1
1
1
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>The first test case is explained in the statement.</p><p>In the second test case, the answer is $$$2$$$, since you can choose the first and the sixth table.</p><p>In the third test case, you cannot take any free table without violating the rules of the restaurant.</p></div>