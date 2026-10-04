<h2><a href="https://codeforces.com/contest/1945/problem/A" target="_blank" rel="noopener noreferrer">1945A — Setting up Camp</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1945A](https://codeforces.com/contest/1945/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Setting up Camp</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>The organizing committee plans to take the participants of the Olympiad on a hike after the tour. Currently, the number of tents needed to be taken is being calculated. It is known that each tent can accommodate up to $$$3$$$ people.</p><p>Among the participants, there are $$$a$$$ introverts, $$$b$$$ extroverts, and $$$c$$$ universals:</p><ul> <li> Each introvert wants to live in a tent alone. Thus, a tent with an introvert must contain exactly one person — only the introvert himself. </li><li> Each extrovert wants to live in a tent with two others. Thus, the tent with an extrovert must contain exactly three people. </li><li> Each universal is fine with any option (living alone, with one other person, or with two others). </li></ul><p>The organizing committee respects the wishes of each participant very much, so they want to fulfill all of them.</p><p>Tell us the minimum number of tents needed to be taken so that all participants can be accommodated according to their preferences. If it is impossible to accommodate the participants in a way that fulfills all the wishes, output $$$-1$$$.</p></div><div class="input-specification"><div class="section-title">Input</div><p>Each test consists of multiple test cases. The first line contains a single integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases. This is followed by the descriptions of the test cases.</p><p>Each test case is described by a single line containing three integers $$$a$$$, $$$b$$$, $$$c$$$ ($$$0 \le a, b, c \le 10^9$$$) — the number of introverts, extroverts, and universals, respectively.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output a single integer — the minimum number of tents, or $$$-1$$$ if it is impossible to accommodate the participants.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0044588030499360276" id="id006363919678418812" class="input-output-copier">Copy</div></div><pre id="id0044588030499360276"><div class="test-example-line test-example-line-even test-example-line-0">10</div><div class="test-example-line test-example-line-odd test-example-line-1">1 2 3</div><div class="test-example-line test-example-line-even test-example-line-2">1 4 1</div><div class="test-example-line test-example-line-odd test-example-line-3">1 4 2</div><div class="test-example-line test-example-line-even test-example-line-4">1 1 1</div><div class="test-example-line test-example-line-odd test-example-line-5">1 3 2</div><div class="test-example-line test-example-line-even test-example-line-6">19 7 18</div><div class="test-example-line test-example-line-odd test-example-line-7">0 0 0</div><div class="test-example-line test-example-line-even test-example-line-8">7 0 0</div><div class="test-example-line test-example-line-odd test-example-line-9">0 24 0</div><div class="test-example-line test-example-line-even test-example-line-10">1000000000 1000000000 1000000000</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0015901907022945316" id="id002751656740114461" class="input-output-copier">Copy</div></div><pre id="id0015901907022945316">3
-1
3
-1
3
28
0
7
8
1666666667
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, $$$1$$$ tent will be given to the introverts, $$$1$$$ tent will be shared by two extroverts and one universal, and the last tent will be shared by two universals. In total, $$$3$$$ tents are needed.</p><p>In the second test case, three extroverts will take $$$1$$$ tent, and $$$1$$$ tent will be taken by an introvert. Then, one extrovert and one universal will be left. This extrovert will not be able to live with two others.</p></div>