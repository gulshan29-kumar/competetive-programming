<h2><a href="https://codeforces.com/contest/1999/problem/E" target="_blank" rel="noopener noreferrer">1999E — Triple Operations</a></h2>

| | |
|---|---|
| **Difficulty** | 1300 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1999E](https://codeforces.com/contest/1999/problem/E) |

## Topics
`dp` `implementation` `math`

---

## Problem Statement

<div class="header"><div class="title">E. Triple Operations</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>On the board Ivy wrote down all integers from $$$l$$$ to $$$r$$$, inclusive.</p><p>In an operation, she does the following: </p><ul> <li> pick two numbers $$$x$$$ and $$$y$$$ on the board, erase them, and in their place write the numbers $$$3x$$$ and $$$\lfloor \frac{y}{3} \rfloor$$$. (Here $$$\lfloor \bullet \rfloor$$$ denotes rounding down to the nearest integer).</li></ul> <p>What is the minimum number of operations Ivy needs to make all numbers on the board equal $$$0$$$? We have a proof that this is always possible.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains an integer $$$t$$$ ($$$1 \leq t \leq 10^4$$$) — the number of test cases.</p><p>The only line of each test case contains two integers $$$l$$$ and $$$r$$$ ($$$1 \leq l  \lt  r \leq 2 \cdot 10^5$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output a single integer — the minimum number of operations needed to make all numbers on the board equal $$$0$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0038560089715967194" id="id00412724253269122" class="input-output-copier">Copy</div></div><pre id="id0038560089715967194"><div class="test-example-line test-example-line-even test-example-line-0">4</div><div class="test-example-line test-example-line-odd test-example-line-1">1 3</div><div class="test-example-line test-example-line-even test-example-line-2">2 4</div><div class="test-example-line test-example-line-odd test-example-line-3">199999 200000</div><div class="test-example-line test-example-line-even test-example-line-4">19 84</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0017632902857907473" id="id007989074090580931" class="input-output-copier">Copy</div></div><pre id="id0017632902857907473">5
6
36
263
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, we can perform $$$5$$$ operations as follows: $$$$$$ 1,2,3 \xrightarrow[x=1,\,y=2]{} 3,0,3 \xrightarrow[x=0,\,y=3]{} 1,0,3 \xrightarrow[x=0,\,y=3]{} 1,0,1 \xrightarrow[x=0,\,y=1]{} 0,0,1 \xrightarrow[x=0,\,y=1]{} 0,0,0 .$$$$$$</p></div>