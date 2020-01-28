# The Bowling Game Kata (Java) - Uncle Bob Martin

## Scoring Bowling.
The game consists of 10 frames as shown above. In each frame the player has
two opportunities to knock down 10 pins. The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries. The bonus for
that frame is the number of pins knocked down by the next roll. So in frame 3
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the
number of pins knocked down on the next roll.)

A strike is when the player knocks down all 10 pins on his first try. The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame. However no more than three balls can be rolled in
tenth frame.

## Getting Started
1. Fork and clone this repository
1. Write your tests in src/test/java/com/galvanize/bowling/GameTest.java
1. Implement your tests in src/main/java/com/galvanize/bowling/Gaje.java

### Acceptance Criteria
1. create a new game
1. can record rolling of ball
1. all (20) gutters
1. all (20) ones
1. one spare, one roll with pins down, and the rest (17) gutters
1. one strike, two rolls with pins down, and the rest (16) gutters
1. perfect game - 10 strikes + two 10s (strikes)

[Code Dojo - Demonstration Video](https://www.youtube.com/watch?v=OPGTPQ4kURU) 
