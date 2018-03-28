package com.sarath.puzzles;

public class ScoreBean implements Comparable<ScoreBean>{


    private int count;
    private Integer score;

    public int compareTo(ScoreBean scoreBean){
        return scoreBean.getScore() - this.getScore();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
