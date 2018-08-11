package com.sarath.geekforgeeks;

import java.util.Date;
import java.util.Map;

/**
 * @author Sarath Pilathottathil
 * Date 8/8/18 5:12 PM
 * Email : spilathottathil@apple.com
 **/
public class LeetCode {
    //Rate Limititer

    private static boolean isAllow(Long clientID){

        
        return true;

    }

    class User{
        private int time;
        private int count;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
