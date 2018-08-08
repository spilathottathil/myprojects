package com.sarath.puzzles;

import java.util.*;

/**
 * Created by spilathottathil on 10/26/17.
 */
public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();


            Employee emp1 = new Employee();
            emp1.setName("Adam John");
            emp1.setSalaray(200);

        Employee emp2 = new Employee();
        emp2.setName("John Adam");
        emp2.setSalaray(250);

        Employee emp3 = new Employee();
        emp3.setName("Monai John");
        emp3.setSalaray(7888);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);


        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalaray() - o2.getSalaray();
            }
        });

        System.out.println(employeeList);

       // employeeList.forEach(e -> { if(e.getSalaray().equals(0) ) });




        //method 1

        //insertionSort(employeeList);
        //System.out.println(employeeList);
        //method 2 : use any sorting alogorthm
        int[] arrayA = {23,45,6,78,9,45,32,99,878989,3,2,997};
        mergeSort(0,arrayA.length-1,arrayA);
        for (int i = 0; i <arrayA.length ; i++) {
           //System.out.println(arrayA[i]);
        }

    }

    private static void insertionSort(List<Employee> empList){
        int N = empList.size();
        //full loop
        for (int i = 0; i <N ; i++) {
            //temp.
            Integer current = empList.get(i).getSalaray();
            int j = i-1;
            while(j>=0 && empList.get(j).getSalaray().compareTo(current) >0){

              empList.get(j+1).setSalaray(empList.get(j).getSalaray());
                j--;
            }
            empList.get(j+1).setSalaray(current);

        }

    }

    public static void mergeSort(int start,int end,int[] arrayA){
        if(start < end) {
            int mid = (start + end) / 2;

            mergeSort(start, mid, arrayA);
            mergeSort(mid + 1, end, arrayA);
            merge(start, mid, end, arrayA);
        }

    }

    public static void mergeSortList(int start,  int end, List<Employee> employees){
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSortList(start, mid, employees);
            mergeSortList(mid + 1, end, employees);
            //mergeList(start, mid, end, employees);
        }


    }




    public static void merge(int start, int mid, int end, int[] arrayA){

        //copy the logically split array
        int n1 = mid - start +1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        //now copy
        for (int i = 0; i <n1 ; i++) {
            left[i] = arrayA[start+i];
        }

        for (int j = 0; j < n2 ; j++) {
            right[j] = arrayA[mid+1+j];

        }
       //pointers
        int i=0,j=0;
        int k = start;

        while(i<n1 && j<n2){
           if( left[i] <= right[j] ){
              arrayA[k] = left[i];
               i++;
           }else {
               arrayA[k] = right[j];
               j++;
           }
            k++;

        }

        //copy rest of the data.

        while(i<n1){
            arrayA[k] = left[i];
            i++;
            k++;
        }

        while(j<n2){
            arrayA[k] = right[j];
            j++;
            k++;
        }
    }

}
