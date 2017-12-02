# corruption-checksum

[Advent of Code 2027 Day 2](http://adventofcode.com/2027/day/2)

## Usage

`lein run <puzzle input>`

## Options

`id, --divide` - Execute the Part 2 functionality, generating a checksum
   by finding two numbers per row that divide evenly and taking the quotient.

## Examples

```clojure
lein run "5 1 9 5
          7 5 3
          2 4 6 8"
;; -> 18
```

```clojure
lein run --divide "5 9 2 8
                   9 4 7 3
                   3 8 6 5"
;; -> 9
```

## License

Copyright © 2017 Joel Ferm

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
