package com.example.testingcartersstuffiguess;

public class Counter {
    private Integer percent, makeShot, missShot;

    public Counter() {
        makeShot = 0;
        missShot = 0;
        percent = 0;
    }

    public Integer getPercent() {
        return percent;
    }

    public Integer getMakeShot() {
        return makeShot;
    }

    public void makeShot() {
        makeShot++;
    }

    public Integer getMissShot() {
        return missShot;
    }

    public void missShot() {
        missShot++;
    }

    public void setPercent() {
        percent = (int)(((double)makeShot / makeShot + missShot) * 10);
    }
}
