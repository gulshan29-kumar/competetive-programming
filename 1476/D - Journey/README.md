<h2><a href="https://codeforces.com/contest/1476/problem/D" target="_blank" rel="noopener noreferrer">1476D — Journey</a></h2>

| | |
|---|---|
| **Difficulty** | 1700 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1476D](https://codeforces.com/contest/1476/problem/D) |

## Topics
`dfs and similar` `dp` `dsu` `implementation`

---

## Problem Statement

<div class="header"><div class="title">D. Journey</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>512 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>There are $$$n + 1$$$ cities, numbered from $$$0$$$ to $$$n$$$. $$$n$$$ roads connect these cities, the $$$i$$$-th road connects cities $$$i - 1$$$ and $$$i$$$ ($$$i \in [1, n]$$$).</p><p>Each road has a direction. The directions are given by a string of $$$n$$$ characters such that each character is either <span class="tex-font-style-tt">L</span> or <span class="tex-font-style-tt">R</span>. If the $$$i$$$-th character is <span class="tex-font-style-tt">L</span>, it means that the $$$i$$$-th road initially goes from the city $$$i$$$ to the city $$$i - 1$$$; otherwise it goes from the city $$$i - 1$$$ to the city $$$i$$$.</p><p>A traveler would like to visit as many cities of this country as possible. Initially, they will choose some city to start their journey from. Each day, the traveler <span class="tex-font-style-bf">must</span> go from the city where they currently are to a neighboring city using one of the roads, and they can go along a road only if it is directed in the same direction they are going; i. e., if a road is directed from city $$$i$$$ to the city $$$i + 1$$$, it is possible to travel from $$$i$$$ to $$$i + 1$$$, but not from $$$i + 1$$$ to $$$i$$$. After the traveler moves to a neighboring city, <span class="tex-font-style-bf">all</span> roads change their directions <span class="tex-font-style-bf">to the opposite ones</span>. If the traveler cannot go from their current city to a neighboring city, their journey ends; it is also possible to end the journey whenever the traveler wants to.</p><p>The goal of the traveler is to visit as many different cities as possible (they can visit a city multiple times, but only the first visit is counted). For each city $$$i$$$, calculate the maximum number of different cities the traveler can visit during <span class="tex-font-style-bf">exactly one journey</span> if they start in the city $$$i$$$. </p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains one integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases.</p><p>Each test case consists of two lines. The first line contains one integer $$$n$$$ ($$$1 \le n \le 3 \cdot 10^5$$$). The second line contains the string $$$s$$$ consisting of exactly $$$n$$$ characters, each character is either <span class="tex-font-style-tt">L</span> or <span class="tex-font-style-tt">R</span>.</p><p>It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$3 \cdot 10^5$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print $$$n + 1$$$ integers. The $$$i$$$-th integer should be equal to the maximum number of different cities the traveler can visit during one journey if this journey starts in the $$$i$$$-th city.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id004028802634113675" id="id0009264739247826681" class="input-output-copier">Copy</div></div><pre id="id004028802634113675">2
6
LRRRLL
3
LRL
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0008736771540515265" id="id0046498929825073476" class="input-output-copier">Copy</div></div><pre id="id0008736771540515265">1 3 2 3 1 3 2
1 4 1 4
</pre></div></div></div>