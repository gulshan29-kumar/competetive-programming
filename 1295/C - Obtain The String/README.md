<h2><a href="https://codeforces.com/contest/1295/problem/C" target="_blank" rel="noopener noreferrer">1295C — Obtain The String</a></h2>

| | |
|---|---|
| **Difficulty** | 1600 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1295C](https://codeforces.com/contest/1295/problem/C) |

## Topics
`dp` `greedy` `strings`

---

## Problem Statement

<div class="header"><div class="title">C. Obtain The String</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given two strings $$$s$$$ and $$$t$$$ consisting of lowercase Latin letters. Also you have a string $$$z$$$ which is initially empty. You want string $$$z$$$ to be equal to string $$$t$$$. You can perform the following operation to achieve this: append any subsequence of $$$s$$$ at the end of string $$$z$$$. A subsequence is a sequence that can be derived from the given sequence by deleting zero or more elements without changing the order of the remaining elements. For example, if $$$z = ac$$$, $$$s = abcde$$$, you may turn $$$z$$$ into following strings in one operation: </p><ol> <li> $$$z = acace$$$ (if we choose subsequence $$$ace$$$); </li><li> $$$z = acbcd$$$ (if we choose subsequence $$$bcd$$$); </li><li> $$$z = acbce$$$ (if we choose subsequence $$$bce$$$). </li></ol><p>Note that after this operation string $$$s$$$ doesn't change.</p><p>Calculate the minimum number of such operations to turn string $$$z$$$ into string $$$t$$$. </p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains the integer $$$T$$$ ($$$1 \le T \le 100$$$) — the number of test cases.</p><p>The first line of each testcase contains one string $$$s$$$ ($$$1 \le |s| \le 10^5$$$) consisting of lowercase Latin letters.</p><p>The second line of each testcase contains one string $$$t$$$ ($$$1 \le |t| \le 10^5$$$) consisting of lowercase Latin letters.</p><p>It is guaranteed that the total length of all strings $$$s$$$ and $$$t$$$ in the input does not exceed $$$2 \cdot 10^5$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each testcase, print one integer — the minimum number of operations to turn string $$$z$$$ into string $$$t$$$. If it's impossible print $$$-1$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007704004047176806" id="id002524775780817594" class="input-output-copier">Copy</div></div><pre id="id007704004047176806">3
aabce
ace
abacaba
aax
ty
yyt
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id004842142947540594" id="id008002703571397515" class="input-output-copier">Copy</div></div><pre id="id004842142947540594">1
-1
3
</pre></div></div></div>