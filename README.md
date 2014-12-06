Turing machine kata
===================

This is a multi-part kata where we will create a working turing machine that is capable of solving any computable
problem (assuming you have enough RAM and patience). For more information on Turing Machines, see:
<http://en.wikipedia.org/wiki/Turing_machine>

Part 1 - The tape
-----------------

One of the defining parts of a Turing machine is an infinitely long tape of symbols. A tape head can move left
and right along the tape one symbol at a time, reading and writing the symbol it currently points at. Implement the
skeleton `TuringTape` class as follows:

- All symbols on the tape should initially be the default symbol
- It should be possible to move the tape head left or right by one symbol
- It should be possible to get and set the current symbol at the tape head

It would be nice to be able to visualise the current state of the tape. Implement `toString()`. The output should be
a space-delimited list with the current tape head location wrapped in brackets as follows:

`0 0 1 1 [1] 1 0`