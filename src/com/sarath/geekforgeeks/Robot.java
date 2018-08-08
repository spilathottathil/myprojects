package com.sarath.geekforgeeks;

/**
 * @author Sarath Pilathottathil
 * Date 7/19/18 5:06 PM
 * Email : spilathottathil@apple.com
 **/
public class Robot {

    public static void main(String[] args) {
        //find position after movements
        String direction = "UDDLLRUUUDUURUDDUULLDRRRR";
        int x=0;
        int y=0;
        for (int i = 0; i < direction.length(); i++) {
            char dir = direction.charAt(i);
            if(dir == 'U'){
                y = y +1;
            }else if(dir == 'D'){
                y = y -1 ;
            }else if(dir == 'L'){
                x = x -1;
            }else if(dir == 'R'){
                x = x +1;
            }
        }

        //System.out.println("("+x+","+y+")");
        String move = "GLLG";
        System.out.println(isCircular(move));
    }

    //find if circular
    private static boolean isCircular(String move){
        //GLGLGLG
        int x=0,y=0;
        char dir = 'E';
        for (int i = 0; i < move.length(); i++) {
            char current = move.charAt(i);
            if(current == 'G'){
                if(dir == 'E'){
                    x = x+1;
                }else if(dir =='W'){
                   x = x-1;
                }else if(dir =='N'){
                    y = y+1;
                }else {
                    y = y-1;
                }
            }else if(current == 'L'){
                if(dir == 'E'){
                    dir = 'N';
                }else if(dir =='W'){
                    dir = 'S';
                }else if(dir =='N'){
                    dir = 'W';
                }else {
                    dir = 'E';
                }

            }else if(current == 'R') {
                if(dir == 'E'){
                    dir = 'S';
                }else if(dir =='W'){
                    dir = 'N';
                }else if(dir =='N'){
                    dir = 'E';
                }else {
                    dir = 'W';
                }
            }
        }

        if(x==0 && y==0 ){
            return true;
        }

        return false;
    }

    //Build Lowest Number by Removing n digits from a given number




}
