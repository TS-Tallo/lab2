# Reflection – AI Number Program Lab

##  Student Name:
Joseph Wacha

##  GitHub Repository Link:
https://github.com/TS-Tallo/lab2

## Iteration 1

What the AI code does:
- The prompt only gave the method signature, so the generated code sums the array.

Tests passed/failed:
- testBasicArray failed. Expected 9, and a sum is not 9.
- testNegativeNumbers failed. Expected -1.
- testSingleValue would pass only if that array is just 42.
- testEmptyArray failed. Expected Integer.MIN_VALUE, and a sum of nothing is 0.

What surprised you:
- The prompt never said what findResult should return, so the first version was a guess.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- The prompt asked for the largest integer, so the sum was replaced with a scan. largest starts at 0.

What improved:
- Positive values now work. testBasicArray expects 9 and testSingleValue expects 42.

What still failed and why:
- testNegativeNumbers still fails. Expected -1, but 0 is larger than every negative number, so the method returns 0.
- testEmptyArray still fails. An empty array never updates largest, so it returns 0 instead of Integer.MIN_VALUE.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
-

What was fixed:
-

What you learned:
-

Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?
