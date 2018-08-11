package com.sarath.puzzles;

import java.text.NumberFormat;
import java.text.ParseException;
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
        employeeList.add("Adam 63984909 5eb4-4924-99f2-537e01b9a1f4");
        employeeList.add("Pappy 639849095eb4-4924-99f2-537e01b9a1f4");
        employeeList.add("John rESTEASY003210: Could not find resource for full path");
        employeeList.add("Baby HttpChannel.handle(HttpChannel.java:334)");

        //List<String> out1 = getMaxOccurance(employeeList);
        List<LogFile> sortedList = sortLogFiles(employeeList);

        for(LogFile s :sortedList){
           // System.out.println(s.getFirstPart()+" "+s.getNextPart());
            System.out.println(s.getFulltext());
        }
        System.out.println("-----------------");
        List<String> employeeList2 = new ArrayList<String>();
        employeeList2.add("org.jboss.resteasy.core.registry.SegmentNode.ma");
        employeeList2.add("org.jboss.resteasy.core.registry.SegmentNode.ma");
        //employeeList2.add("63984909-5eb4-4924-99f2-537e01b9a1f4");
        employeeList2.add("RESTEASY003210: Could not find resource for full path");
        employeeList2.add("HttpChannel.handle(HttpChannel.java:334)");
        employeeList2.add("639849095eb4-4924-99f2-537e01b9a1f4");

        Collections.sort(employeeList2);
        for(String s : employeeList2) {
            System.out.println(s);
        }



    }

    /**
     * Given list of strings
     * @return
     */
    private static List<LogFile> sortLogFiles(List<String>  logFileList){
        List<LogFile> characterList = new ArrayList<>();
        List<LogFile> alphaNumericList = new ArrayList<>();

        //Iterate
        for(String s : logFileList){
            LogFile logFile = new LogFile();
            logFile.setFulltext(s);
            String [] parts = s.split(" ",3);
            logFile.setFirstPart(parts[0]);
            logFile.setNextPart(parts[1]);
            try {
                 Integer.parseInt(logFile.getNextPart());
                 alphaNumericList.add(logFile);
            }catch (NumberFormatException nfe){
                characterList.add(logFile);
            }
        }
        Collections.sort(characterList);
        characterList.addAll(alphaNumericList);
        return  characterList;
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
