<h2><a href="https://codeforces.com/contest/2285/problem/C" target="_blank" rel="noopener noreferrer">2285C — Max Substitution</a></h2>

| | |
|---|---|
| **Difficulty** | Unrated |
| **Language** | C++17 (GCC 7-32) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2285C](https://codeforces.com/contest/2285/problem/C) |

## Topics
`combinatorics` `data structures` `math` `sortings` `two pointers`

---

## Problem Statement

<div class="header"><div class="title">C. Max Substitution</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p> </p><p>You are given an array $$$a$$$ of length $$$n$$$. In one operation, you may replace the <span class="tex-font-style-bf">unique</span> largest element in $$$a$$$ with any strictly smaller positive integer (i.e., any integer $$$x$$$ such that $$$1 \le x  \lt  \max(a)$$$). You can only perform this operation if $$$a$$$ has a unique largest element.</p><p>Determine the number of distinct$$$^{\text{∗}}$$$ arrays that can be obtained by performing the operation any number of times (possibly zero). Since the answer may be large, output it modulo $$$10^9+7$$$.</p><div class="statement-footnote"><p>$$$^{\text{∗}}$$$Two arrays $$$a$$$ and $$$b$$$ are considered distinct if they differ in at least one position, i.e., there exists an index $$$i$$$ such that $$$a_i \ne b_i$$$.</p></div></div><div class="input-specification"><div class="section-title">Input</div><p>Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \le t \le 1000$$$). The description of the test cases follows.</p><p>The first line of each test case contains a single integer $$$n$$$ ($$$1 \le n \le 2 \cdot 10^5$$$) — the length of the array.</p><p>The second line of each test case contains $$$n$$$ integers $$$a_1, a_2, \ldots, a_n$$$ ($$$1 \le a_i \le 10^9$$$) — the elements of the array.</p><p>It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$2\cdot 10^5$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output a line with a single integer — the number of distinct arrays that can be obtained by performing the operation any number of times, modulo $$$10^9+7$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0033519309491922245" id="id0023060747164358975" class="input-output-copier">Copy</div></div><pre data-content="5
3
2 2 1
2
1000000000 1
4
6 7 2 2
3
3 4 2
1
1
" id="id0033519309491922245"><div class="test-example-line test-example-line-even test-example-line-0">5</div><div class="test-example-line test-example-line-odd test-example-line-1">3</div><div class="test-example-line test-example-line-odd test-example-line-1">2 2 1</div><div class="test-example-line test-example-line-even test-example-line-2">2</div><div class="test-example-line test-example-line-even test-example-line-2">1000000000 1</div><div class="test-example-line test-example-line-odd test-example-line-3">4</div><div class="test-example-line test-example-line-odd test-example-line-3">6 7 2 2</div><div class="test-example-line test-example-line-even test-example-line-4">3</div><div class="test-example-line test-example-line-even test-example-line-4">3 4 2</div><div class="test-example-line test-example-line-odd test-example-line-5">1</div><div class="test-example-line test-example-line-odd test-example-line-5">1</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0035535973526778974" id="id004115244255184275" class="input-output-copier">Copy</div></div><pre data-content="1
1000000000
32
9
1
" id="id0035535973526778974"><div class="test-example-line test-example-line-odd test-example-line-1">1</div><div class="test-example-line test-example-line-even test-example-line-2">1000000000</div><div class="test-example-line test-example-line-odd test-example-line-3">32</div><div class="test-example-line test-example-line-even test-example-line-4">9</div><div class="test-example-line test-example-line-odd test-example-line-5">1</div></pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, since the maximum element $$$2$$$ is not unique, the only array that can be obtained is $$$[2,2,1]$$$ — the initial array.</p><p>In the second test case, the maximum element is $$$1\,000\,000\,000$$$. It can be shown that after any number of operations, the possible arrays are $$$[1,1], [2,1], [3,1], \ldots [1\,000\,000\,000,1]$$$. Hence the answer is $$$1\,000\,000\,000$$$.</p></div>