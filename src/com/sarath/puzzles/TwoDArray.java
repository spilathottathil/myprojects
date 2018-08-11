package com.sarath.puzzles;

import java.util.*;

public class TwoDArray {

    public static void main(String[] args) {
        String [][] scores = { {"Matt", "30"},
                {"Jason", "40"},
                {"Matt", "25"},
                {"Charles", "48"},
                {"Alice" , "28"}
        };

        HashMap<String, ScoreBean> scoresMap = new HashMap<>();


        for(String[] row : scores){

            String name = row[0];
            Integer score = Integer.valueOf(row[1]);
            ScoreBean scoreBean ;
            if(null == scoresMap.get(name) ){
                 scoreBean = new ScoreBean();
                scoreBean.setCount(1);
                scoreBean.setScore(score);
                scoresMap.put(name,scoreBean);
            }else{
                scoreBean = scoresMap.get(name);
                scoreBean.setScore((scoreBean.getScore()+ score) / (scoreBean.getCount()+1));
                scoreBean.setCount(scoreBean.getCount()+1);
                scoresMap.put(name,scoreBean);
            }

        }



        ArrayList<ScoreBean> scoreBeanArrayList = new ArrayList<>();

        for (Map.Entry<String, ScoreBean> myEntry : scoresMap.entrySet()){
            scoreBeanArrayList.add(myEntry.getValue());
        }

        Collections.sort(scoreBeanArrayList);

        System.out.printf(scoreBeanArrayList.get(0).getScore().toString());
    }


}
