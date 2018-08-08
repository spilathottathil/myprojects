package com.sarath.puzzles;

/**
 * @author Sarath Pilathottathil
 * Date 8/8/18 3:46 PM
 * Email : spilathottathil@apple.com
 **/
public class LogFile implements Comparable<LogFile>{

    private String firstPart;
    private String nextPart;

    public String getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(String firstPart) {
        this.firstPart = firstPart;
    }

    public String getNextPart() {
        return nextPart;
    }

    public void setNextPart(String nextPart) {
        this.nextPart = nextPart;
    }

    @Override
    public int compareTo(LogFile logFile){

        if(this.nextPart.equals(logFile.getNextPart())){
            return this.firstPart.compareTo(logFile.getFirstPart());
        }else {
            return this.nextPart.compareTo(logFile.getNextPart());
        }
    }
}
