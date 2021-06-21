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
            int scoreOne = this.scores[(frame * 2)];
            int scoreTwo = this.scores[(frame * 2) + 1];

            if (scoreOne == 10) {
                if (this.scores[(frame * 2) + 2] == 10) {
                    if (frame == 9) {
                        total += 20 + scoreTwo;
                    } else {
                        total += 20 + this.scores[(frame * 2) + 4];
                    }
                } else {
                    total += 10 + this.scores[(frame * 2) + 2] + this.scores[(frame * 2) + 3];
                }
            } else if (scoreOne + scoreTwo == 10) {
                total += 10 + this.scores[(frame * 2) + 2];
            } else {
                total += scoreOne + scoreTwo;
            }
        }

        return total;
    }

    public void score(int score) {
        this.scores[this.index] += score;

        if (score == 10 && this.index <= 17)  {
            this.index++;
        }

        this.index ++;
    }

    public int getFrame() {
        int frame = (int) Math.ceil((this.index + 1) / 2.0);

        return Math.min(frame, 10);
    }

    public int getRoll() {
        int roll = this.index % 2 == 0 ? 1 : 2;
        return index == 20 ? 3 : roll;
    }

    public boolean getGameOverStatus() {
        if (index > 20) {
            return true;
        } else if (index == 20) {
            return this.scores[18] != 10;
        } else {
            return false;
        }
    }
}
