<h2><a href="https://codeforces.com/contest/1974/problem/A" target="_blank" rel="noopener noreferrer">1974A — Phone Desktop</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | C++20 (GCC 13-64) |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1974A](https://codeforces.com/contest/1974/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Phone Desktop</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Little Rosie has a phone with a desktop (or launcher, as it is also called). The desktop can consist of several screens. Each screen is represented as a grid of size $$$5 \times 3$$$, i.e., five rows and three columns.</p><p>There are $$$x$$$ applications with an icon size of $$$1 \times 1$$$ cells; such an icon occupies only one cell of the screen. There are also $$$y$$$ applications with an icon size of $$$2 \times 2$$$ cells; such an icon occupies a <span class="tex-font-style-bf">square</span> of $$$4$$$ cells on the screen. Each cell of each screen can be occupied by no more than one icon.</p><p>Rosie wants to place the application icons on the minimum number of screens. Help her find the minimum number of screens needed.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains $$$t$$$ ($$$1 \leq t \leq 10^4$$$) — the number of test cases. </p><p>The first and only line of each test case contains two integers $$$x$$$ and $$$y$$$ ($$$0 \leq x, y \leq 99$$$) — the number of applications with a $$$1 \times 1$$$ icon and the number of applications with a $$$2 \times 2$$$ icon, respectively.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output the minimal number of required screens on a separate line.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id006686086805487609" id="id006439249284460519" class="input-output-copier">Copy</div></div><pre id="id006686086805487609"><div class="test-example-line test-example-line-even test-example-line-0">11</div><div class="test-example-line test-example-line-odd test-example-line-1">1 1</div><div class="test-example-line test-example-line-even test-example-line-2">7 2</div><div class="test-example-line test-example-line-odd test-example-line-3">12 4</div><div class="test-example-line test-example-line-even test-example-line-4">0 3</div><div class="test-example-line test-example-line-odd test-example-line-5">1 0</div><div class="test-example-line test-example-line-even test-example-line-6">8 1</div><div class="test-example-line test-example-line-odd test-example-line-7">0 0</div><div class="test-example-line test-example-line-even test-example-line-8">2 0</div><div class="test-example-line test-example-line-odd test-example-line-9">15 0</div><div class="test-example-line test-example-line-even test-example-line-10">8 2</div><div class="test-example-line test-example-line-odd test-example-line-11">0 9</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0009952372729717784" id="id0016505960393035735" class="input-output-copier">Copy</div></div><pre id="id0009952372729717784">1
1
2
2
1
1
0
1
1
2
5
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>The solution for the first test case can look as follows:</p><center> <img class="tex-graphics" height="189px" src="https://espresso.codeforces.com/69bfe873bb73df843b5e6cfe368944566e59deae.png" style="max-width: 100.0%;max-height: 100.0%;"> <span class="tex-font-size-small">Blue squares represent empty spaces for icons, green squares represent $$$1 \times 1$$$ icons, red squares represent $$$2 \times 2$$$ icons</span> </center><p>The solution for the third test case can look as follows:</p><center> <img class="tex-graphics" height="189px" src="https://espresso.codeforces.com/facbdb8597936a2abe24d5c89da8f0ef149a84fb.png" style="max-width: 100.0%;max-height: 100.0%;"> </center></div>