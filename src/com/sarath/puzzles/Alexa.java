package com.sarath.puzzles;

import java.util.*;

/**
 * @author Sarath Pilathottathil
 * Date 8/7/18 11:08 AM
 * Email : spilathottathil@apple.com
 **/
public class Alexa {

    public static void main(String[] args) {
        List<String> employeeList = new ArrayList<String>();
        employeeList.add("AAron org.jboss.resteasy.core.registry.SegmentNode.ma");
        employeeList.add("Peeli org.jboss.resteasy.core.registry.SegmentNode.ma");
        employeeList.add("Adam 63984909-5eb4-4924-99f2-537e01b9a1f4");
        employeeList.add("John RESTEASY003210: Could not find resource for full path");
        employeeList.add("Baby HttpChannel.handle(HttpChannel.java:334)");



        //List<String> out1 = getMaxOccurance(employeeList);
        List<LogFile> out1 = sortLogFiles(employeeList);

        for(LogFile s :out1){
            System.out.println(s.getFirstPart()+" "+s.getNextPart());
        }

    }

    /**
     * Given list of strings
     * @return
     */
    private static List<LogFile> sortLogFiles(List<String>  logFileList){
        List<LogFile> sorted = new ArrayList<>();
        List<LogFile> unsorted = new ArrayList<>();

        //Iterate
        for(String s : logFileList){
            LogFile logFile = new LogFile();
            String [] parts = s.split(" ",2);
            logFile.setFirstPart(parts[0]);
            logFile.setNextPart(parts[1]);
            if(Character.isDigit(logFile.getNextPart().charAt(0))){
                unsorted.add(logFile);
            }else{
                sorted.add(logFile);
            }

        }
        Collections.sort(sorted);

        sorted.addAll(unsorted);
        return  sorted;
    }

    /**
     * Question 2
     * @param inputList
     * @return
     */
    private static  List<String> getMaxOccurance(List<String> inputList){

        HashMap<String,Integer> myMap = new HashMap<>();
        int max =1;
        List<String> out = new ArrayList<>();


      for (String s : inputList){

          if(myMap.get(s) != null){
              myMap.put(s,myMap.get(s)+1);
          }else {
              myMap.put(s,1);
          }
      }

      for(Map.Entry<String,Integer> entry : myMap.entrySet()){
        if(entry.getValue() > max){
            max = entry.getValue();
            out.clear();
            out.add(entry.getKey());

        }else if(entry.getValue() ==  max){
            max = entry.getValue();
            out.add(entry.getKey());
        }

      }

        return out;
    }
}
