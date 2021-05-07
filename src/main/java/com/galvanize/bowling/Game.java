package com.galvanize.bowling;

public class Game {
    int[] scores;
    int index;

    public Game() {
        this.scores = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.index = 0;
    }

    public int getScore() {
        int total = 0;

        for (int frame = 0; frame < 10; frame++) {
            int scoreOne = scores[(frame * 2)];
            int scoreTwo = scores[(frame * 2) + 1];

            if (scoreOne == 10) {
                if (scores[(frame * 2) + 2] == 10) {
                    if (frame == 9) {
                        total += 20 + scoreTwo;
                    } else {
                        total += 20 + scores[(frame * 2) + 4];
                    }
                } else {
                    total += 10 + scores[(frame * 2) + 2] + scores[(frame * 2) + 3];
                }
            } else if (scoreOne + scoreTwo == 10) {
                total += 10 + scores[(frame * 2) + 2];
            } else {
                total += scoreOne + scoreTwo;
            }
        }

        return total;
    }

    public void score(int score) {
        scores[index] += score;
        if (score == 10) {
            if (index > 17)  {
                index++;
            } else {
                index += 2;
            }
        } else {
            index++;
        }
    }
}
