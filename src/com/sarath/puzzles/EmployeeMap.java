package com.sarath.puzzles;

import com.sarath.datastructure.MyHashMap;

import java.util.*;

/**
 * Created by spilathottathil on 11/7/17.
 */
public class EmployeeMap {

    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<String,Integer>();
        employees.put("Douglas",2);
        employees.put("Adam",4);
        employees.put("Micheal",1);
        employees.put("Theressa",10);

        //System.out.println(employees);

        List<Employee>  myEmployeeList = new ArrayList<>();

        for(Map.Entry<String,Integer> employee : employees.entrySet()){
            Employee sortEmployee = new Employee();
            sortEmployee.setName(employee.getKey());
            sortEmployee.setSalaray(employee.getValue());
            myEmployeeList.add(sortEmployee);
        }


        //Or
    /* Iterator<Map.Entry<String,Integer>> it =  employees.entrySet().iterator();

        while (it.hasNext()){
            Employee sortEmployee = new Employee();
            Map.Entry<String,Integer> namePair = it.next();
            sortEmployee.setName(namePair.getKey());
            sortEmployee.setSalaray(namePair.getValue());
            myEmployeeList.add(sortEmployee);
        }*/


        Collections.sort(myEmployeeList);
        System.out.println("full list " + myEmployeeList);
        System.out.println(myEmployeeList.subList(myEmployeeList.size() - 3,myEmployeeList.size() ));
    }




}
