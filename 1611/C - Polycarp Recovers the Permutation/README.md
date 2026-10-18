<h2><a href="https://codeforces.com/contest/1611/problem/C" target="_blank" rel="noopener noreferrer">1611C — Polycarp Recovers the Permutation</a></h2>

| | |
|---|---|
| **Difficulty** | 1000 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1611C](https://codeforces.com/contest/1611/problem/C) |

## Topics
`constructive algorithms`

---

## Problem Statement

<div class="header"><div class="title">C. Polycarp Recovers the Permutation</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Polycarp wrote on a whiteboard an array $$$p$$$ of length $$$n$$$, which is a permutation of numbers from $$$1$$$ to $$$n$$$. In other words, in $$$p$$$ each number from $$$1$$$ to $$$n$$$ occurs exactly once.</p><p>He also prepared a resulting array $$$a$$$, which is initially empty (that is, it has a length of $$$0$$$).</p><p>After that, he did exactly $$$n$$$ <span class="tex-font-style-it">steps</span>. Each <span class="tex-font-style-it">step</span> looked like this:</p><ul> <li> Look at the leftmost and rightmost elements of $$$p$$$, and pick the smaller of the two.</li><li> If you picked the leftmost element of $$$p$$$, append it to the left of $$$a$$$; otherwise, if you picked the rightmost element of $$$p$$$, append it to the right of $$$a$$$.</li><li> The picked element is erased from $$$p$$$. </li></ul><p>Note that on the last step, $$$p$$$ has a length of $$$1$$$ and its minimum element is both leftmost and rightmost. In this case, Polycarp can choose what role the minimum element plays. In other words, this element can be added to $$$a$$$ both on the left and on the right (at the discretion of Polycarp).</p><p>Let's look at an example. Let $$$n=4$$$, $$$p=[3, 1, 4, 2]$$$. Initially $$$a=[]$$$. Then:</p><ul><li> During the first step, the minimum is on the right (with a value of $$$2$$$), so after this step, $$$p=[3,1,4]$$$ and $$$a=[2]$$$ (he added the value $$$2$$$ to the right). </li><li> During the second step, the minimum is on the left (with a value of $$$3$$$), so after this step, $$$p=[1,4]$$$ and $$$a=[3,2]$$$ (he added the value $$$3$$$ to the left). </li><li> During the third step, the minimum is on the left (with a value of $$$1$$$), so after this step, $$$p=[4]$$$ and $$$a=[1,3,2]$$$ (he added the value $$$1$$$ to the left). </li><li> During the fourth step, the minimum is both left and right (this value is $$$4$$$). Let's say Polycarp chose the right option. After this step, $$$p=[]$$$ and $$$a=[1,3,2,4]$$$ (he added the value $$$4$$$ to the right).</li></ul><p>Thus, a possible value of $$$a$$$ after $$$n$$$ steps could be $$$a=[1,3,2,4]$$$.</p><p>You are given the final value of the resulting array $$$a$$$. Find <span class="tex-font-style-bf">any</span> possible initial value for $$$p$$$ that can result the given $$$a$$$, or determine that there is no solution.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains an integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases in the test.</p><p>Each test case consists of two lines. The first of them contains an integer $$$n$$$ ($$$1 \le n \le 2\cdot10^5$$$) — the length of the array $$$a$$$. The second line contains $$$n$$$ integers $$$a_1, a_2, \dots, a_n$$$ ($$$1 \le a_i \le n$$$) — the elements of the array $$$a$$$. All elements of the $$$a$$$ array are distinct numbers.</p><p>It is guaranteed that the sum of the values $$$n$$$ over all test cases in the test does not exceed $$$2\cdot10^5$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>Print $$$t$$$ lines, each of the lines must contain the answer to the corresponding set of input data: numbers $$$p_1, p_2, \dots, p_n$$$  — any of the possible initial values of the array $$$p$$$, which will lead to the given array $$$a$$$. All elements of $$$p$$$ are distinct integers from $$$1$$$ to $$$n$$$. Thus, if there are several solutions, print any. If there is no solution, then print <span class="tex-font-style-tt">-1</span> on the line.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id009216861664878552" id="id006539171996981704" class="input-output-copier">Copy</div></div><pre id="id009216861664878552">4
4
1 3 2 4
1
1
5
1 3 5 4 2
3
3 2 1
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id006817375603823812" id="id0008836067254596236" class="input-output-copier">Copy</div></div><pre id="id006817375603823812">3 1 4 2
1
-1
2 3 1
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>The first test case in the example is clarified in the main section of the problem statement. There may be other correct answers for this test set.</p><p>In the second test case, $$$n=1$$$. Thus, there is only one permutation that can be the answer: $$$p=[1]$$$. Indeed, this is the answer to this test case.</p><p>In the third test case of the example, no matter what permutation you take as $$$p$$$, after applying the $$$n$$$ steps, the result will differ from $$$a=[1, 3, 5, 4, 2]$$$.</p></div>