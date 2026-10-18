<h2><a href="https://codeforces.com/contest/1822/problem/C" target="_blank" rel="noopener noreferrer">1822C — Bun Lover</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1822C](https://codeforces.com/contest/1822/problem/C) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">C. Bun Lover</div><div class="time-limit"><div class="property-title">time limit per test</div>3 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Tema loves cinnabon rolls — buns with cinnabon and chocolate in the shape of a "snail".</p><p>Cinnabon rolls come in different sizes and are square when viewed from above. The most delicious part of a roll is the chocolate, which is poured in a thin layer over the cinnabon roll in the form of a spiral and around the bun, as in the following picture:</p><center> <img class="tex-graphics" src="https://espresso.codeforces.com/883110c5011d3c0b7480d539e73ab22ba73d6db0.png" style="zoom: 75.0%;max-width: 100.0%;max-height: 100.0%;"><p> <span class="tex-font-size-small">Cinnabon rolls of sizes 4, 5, 6</span> </p></center><p>For a cinnabon roll of size $$$n$$$, the length of the outer side of the square is $$$n$$$, and the length of the shortest vertical chocolate segment in the central part is one.</p><p>Formally, the bun consists of two dough spirals separated by chocolate. A cinnabon roll of size $$$n + 1$$$ is obtained from a cinnabon roll of size $$$n$$$ by wrapping each of the dough spirals around the cinnabon roll for another layer.</p><p><span class="tex-font-style-bf">It is important that a cinnabon roll of size $$$n$$$ is defined in a unique way.</span></p><p>Tema is interested in how much chocolate is in his cinnabon roll of size $$$n$$$. Since Tema has long stopped buying small cinnabon rolls, it is guaranteed that $$$n \ge 4$$$.</p><p>Answer this non-obvious question by calculating the total length of the chocolate layer.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains a single integer $$$t$$$ ($$$1 \le t \le 10^5$$$) — the number of test cases.</p><p>The following $$$t$$$ lines describe the test cases.</p><p>Each test case is described by a single integer $$$n$$$ ($$$4 \le n \le 10^9$$$) — the size of the cinnabon roll.</p></div><div class="output-specification"><div class="section-title">Output</div><p>Output $$$t$$$ integers. The $$$i$$$-th of them should be equal to the total length of the chocolate layer in the $$$i$$$-th test case.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00655178428185765" id="id0020711777984710844" class="input-output-copier">Copy</div></div><pre id="id00655178428185765"><div class="test-example-line test-example-line-even test-example-line-0">4</div><div class="test-example-line test-example-line-odd test-example-line-1">4</div><div class="test-example-line test-example-line-even test-example-line-2">5</div><div class="test-example-line test-example-line-odd test-example-line-3">6</div><div class="test-example-line test-example-line-even test-example-line-4">179179179</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id005711836708838579" id="id0048301470814222525" class="input-output-copier">Copy</div></div><pre id="id005711836708838579">26
37
50
32105178545472401
</pre></div></div></div>