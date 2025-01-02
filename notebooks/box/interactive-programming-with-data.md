# Interactive programming with data

I'm going to talk about what I love about Clojure 😁

And what I love about Clojure is **interactive programming with data**.

- *interactive programming* means that I'm continuously changing the behavior of a running system.
  I never restart it, I just tune it into what I want it to be.
- *with data* means I'm passing around serializable, immutable data structures.
  - *serializable* means two things.
    - the data can be serialized, stored on disk, be reloaded, and be equal to the original.
    - and the reader of the data doesn't need to know anything other than the data.
  - *immutable* means
    - I don't change objects, I take in data and return new data

... and this is an absolutely lovely experience.
But why?

## Interactive programming enables instant feedback

Because my program never restarts, how I structure my feedback loop is up to me.
I'm aiming for instant.

Types of feedback could be looking at a value, running some tests, or looking at graphs and tables.
All those are at my fingertips.
Developing my application means simultaneously developing better feedback loops and new behavior.

## data enables effective data modeling with opt-in structure

The contrast to data is custom types, like classes, structs and records.
Classes and structs let the programmer control memory representation (in low-level languages) to improve performance, and declare types to give stability guarantees.

I don't typically have to care about low-level performance in my daily Clojure programming work.
In the cases where I do have to care, using provided, fast primitives has been all that I need.
Those I've used are based on Tech.Ml.Dataset, by Chris Nuernberger: https://github.com/techascent/tech.ml.dataset

For stability guarantees, I don't want to use types, because they make my data opaque.

Once I've made private fields in my Java class, I loose two important benefits:

- Serialization out of the box: serialization depends on private properties
- Generic programming: I want to do things like "list an object's keys".

Instead of using types for stability guarantees, I want to use tests for behavior and schemas for structure, though only sparingly.
With those two in place, I no longer see the need for types.
