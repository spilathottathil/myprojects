package com.sarath.puzzles;

import com.sarath.datastructure.Queue;

import java.util.PriorityQueue;

/**
 * Created by spilathottathil on 11/8/17.
 */
public class EmployeeQueue {


    public static void main(String[] args) {
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();
        Employee emp1 = new Employee();
        emp1.setName("Adam");
        emp1.setSalaray(220);

        Employee emp2 = new Employee();
        emp2.setName("John");
        emp2.setSalaray(260);

        Employee emp3 = new Employee();
        emp3.setName("Monai");
        emp3.setSalaray(250);

        priorityQueue.add(emp1);
        priorityQueue.add(emp2);
        priorityQueue.add(emp3);

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);
    }


}
