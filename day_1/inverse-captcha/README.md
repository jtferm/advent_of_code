# inverse-captcha

[Advent of Code 2017 Day 1](http://adventofcode.com/2017/day/1)

Takes a string of digits and computes the sum of all elements that are the
same value as the next digit in the list.

## Usage

`lein run <puzzle input>`

## Options

`-h, --halfway` - Execute the Part 2 functionality, summing numbers that match
   halfway around the list. Undefined behavior for odd-length inputs.

## Examples

```clojure
lein run 1122
;; -> 3
```

```clojure
lein run 1212 --halfway
;; -> 6
```

## License

Copyright © 2017 Joel Ferm

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
