<h2><a href="https://codeforces.com/contest/1557/problem/B" target="_blank" rel="noopener noreferrer">1557B — Moamen and k-subarrays</a></h2>

| | |
|---|---|
| **Difficulty** | 1100 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1557B](https://codeforces.com/contest/1557/problem/B) |

## Topics
`greedy` `sortings`

---

## Problem Statement

<div class="header"><div class="title">B. Moamen and k-subarrays</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Moamen has an array of $$$n$$$ <span class="tex-font-style-bf">distinct</span> integers. He wants to sort that array in non-decreasing order by doing the following operations in order <span class="tex-font-style-bf">exactly once</span>:</p><ol> <li> Split the array into exactly $$$k$$$ non-empty subarrays such that each element belongs to exactly one subarray. </li><li> Reorder these subarrays arbitrary. </li><li> Merge the subarrays in their new order. </li></ol><p>A sequence $$$a$$$ is a subarray of a sequence $$$b$$$ if $$$a$$$ can be obtained from $$$b$$$ by deletion of several (possibly, zero or all) elements from the beginning and several (possibly, zero or all) elements from the end.</p><p>Can you tell Moamen if there is a way to sort the array in non-decreasing order using the operations written above?</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le 10^3$$$) — the number of test cases. The description of the test cases follows.</p><p>The first line of each test case contains two integers $$$n$$$ and $$$k$$$ ($$$1 \le k \le n \le 10^5$$$).</p><p>The second line contains $$$n$$$ integers $$$a_1, a_2, \ldots, a_n$$$ ($$$0 \le |a_i| \le 10^9$$$). It is guaranteed that all numbers are <span class="tex-font-style-bf">distinct</span>.</p><p>It is guaranteed that the sum of $$$n$$$ over all test cases does not exceed $$$3\cdot10^5$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, you should output a single string.</p><p>If Moamen can sort the array in non-decreasing order, output "<span class="tex-font-style-tt">YES</span>" (without quotes). Otherwise, output "<span class="tex-font-style-tt">NO</span>" (without quotes).</p><p>You can print each letter of "<span class="tex-font-style-tt">YES</span>" and "<span class="tex-font-style-tt">NO</span>" in any case (upper or lower).</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0047610351291030917" id="id000021870261900253096" class="input-output-copier">Copy</div></div><pre id="id0047610351291030917">3
5 4
6 3 4 2 1
4 2
1 -4 0 -2
5 1
1 2 3 4 5
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id007893077380454487" id="id001197206389691281" class="input-output-copier">Copy</div></div><pre id="id007893077380454487">Yes
No
Yes
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, $$$a = [6, 3, 4, 2, 1]$$$, and $$$k = 4$$$, so we can do the operations as follows: </p><ol> <li> Split $$$a$$$ into $$$\{ [6], [3, 4], [2], [1] \}$$$. </li><li> Reorder them: $$$\{ [1], [2], [3,4], [6] \}$$$. </li><li> Merge them: $$$[1, 2, 3, 4, 6]$$$, so now the array is sorted. </li></ol><p>In the second test case, there is no way to sort the array by splitting it into only $$$2$$$ subarrays.</p><p>As an example, if we split it into $$$\{ [1, -4], [0, -2] \}$$$, we can reorder them into $$$\{ [1, -4], [0, -2] \}$$$ or $$$\{ [0, -2], [1, -4] \}$$$. However, after merging the subarrays, it is impossible to get a sorted array.</p></div>