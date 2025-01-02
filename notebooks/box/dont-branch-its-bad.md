# don't branch, it's bad!

Don't branch!
It's bad!
Don't do it!
At least wait as long as you can.

Code that is *one logical thread* is so much simpler to understand.

Colloraries:

**Prefer trunk-based development to features branches.**
Feature branches give you *several* codebases you need to understand rather than one.
One is easier!
They solve a problem you should solve a different way: the fact that code isn't perfect the first time it's written.
If you want to avoid too much bad code in your codebase, I propose:

- Pairing with people who need help
- Writing code in a way such that new behavior can be added without breaking existing functionality
- Actively rewviewing code that is merged to master.

**Push if statements to the edge of your code**.
Make the decisions as early as possible, then keep the rest of the code dumb.
Dumb code is straightforward.
(*straight* code does not *turn and twist*, and does *definitely* not *branch*, a branch both turns and splits.).
