<h2><a href="https://codeforces.com/contest/1674/problem/B" target="_blank" rel="noopener noreferrer">1674B — Dictionary</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1674B](https://codeforces.com/contest/1674/problem/B) |

## Topics
`combinatorics` `math`

---

## Problem Statement

<div class="header"><div class="title">B. Dictionary</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>512 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>The Berland language consists of words having <span class="tex-font-style-bf">exactly two letters</span>. Moreover, <span class="tex-font-style-bf">the first letter of a word is different from the second letter</span>. Any combination of two different Berland letters (which, by the way, are the same as the lowercase letters of Latin alphabet) is a correct word in Berland language.</p><p>The Berland dictionary contains all words of this language. The words are listed in a way they are usually ordered in dictionaries. Formally, word $$$a$$$ comes earlier than word $$$b$$$ in the dictionary if one of the following conditions hold:</p><ul> <li> the first letter of $$$a$$$ is less than the first letter of $$$b$$$; </li><li> the first letters of $$$a$$$ and $$$b$$$ are the same, and the second letter of $$$a$$$ is less than the second letter of $$$b$$$. </li></ul><p>So, the dictionary looks like that:</p><ul> <li> Word $$$1$$$: <span class="tex-font-style-tt">ab</span> </li><li> Word $$$2$$$: <span class="tex-font-style-tt">ac</span> </li><li> ... </li><li> Word $$$25$$$: <span class="tex-font-style-tt">az</span> </li><li> Word $$$26$$$: <span class="tex-font-style-tt">ba</span> </li><li> Word $$$27$$$: <span class="tex-font-style-tt">bc</span> </li><li> ... </li><li> Word $$$649$$$: <span class="tex-font-style-tt">zx</span> </li><li> Word $$$650$$$: <span class="tex-font-style-tt">zy</span> </li></ul><p>You are given a word $$$s$$$ from the Berland language. Your task is to find its index in the dictionary.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains one integer $$$t$$$ ($$$1 \le t \le 650$$$) — the number of test cases.</p><p>Each test case consists of one line containing $$$s$$$ — a string consisting of <span class="tex-font-style-bf">exactly two different lowercase Latin letters</span> (i. e. a correct word of the Berland language).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print one integer — the index of the word $$$s$$$ in the dictionary.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id005489634072568229" id="id0049031524378528313" class="input-output-copier">Copy</div></div><pre id="id005489634072568229"><div class="test-example-line test-example-line-even test-example-line-0">7</div><div class="test-example-line test-example-line-odd test-example-line-1">ab</div><div class="test-example-line test-example-line-even test-example-line-2">ac</div><div class="test-example-line test-example-line-odd test-example-line-3">az</div><div class="test-example-line test-example-line-even test-example-line-4">ba</div><div class="test-example-line test-example-line-odd test-example-line-5">bc</div><div class="test-example-line test-example-line-even test-example-line-6">zx</div><div class="test-example-line test-example-line-odd test-example-line-7">zy</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id001427607480524331" id="id00029319316808208762" class="input-output-copier">Copy</div></div><pre id="id001427607480524331">1
2
25
26
27
649
650
</pre></div></div></div>