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
- findResult returns the largest value in the array. An empty array returns Integer.MIN_VALUE.

What was fixed:
- The empty-array case, and starting from the first element so a negative maximum is not lost.

What you learned:
- A short prompt leaves the model guessing. The tests are the spec. Starting the maximum at 0 is wrong when every value is negative.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
- The first prompt had no behavior, so the code summed the array. The second asked for the largest value, but still started at 0. The third added the empty-array rule, which is what the tests required.

- How did testing affect your changes?
- The starter run showed expected 9, -1, 42, and Integer.MIN_VALUE. That is what made the zero-start bug and the empty-array bug visible.

- What did version control help you understand?
- Each commit kept one prompt's result. The wrong sum and the zero-start version are still in the history instead of being overwritten.
