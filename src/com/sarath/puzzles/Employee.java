package com.sarath.puzzles;

/**
 * Created by spilathottathil on 10/26/17.
 */
public class Employee  implements Comparable<Employee>{

    private Integer salaray;
    private String name;

    public Integer getSalaray() {
        return salaray;
    }

    public void setSalaray(Integer salaray) {
        this.salaray = salaray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee e){

        if( this.salaray.compareTo(e.getSalaray()) == 0) {

            return this.name.compareTo(e.name);
        }else {
            return  e.getSalaray() - this.getSalaray();
        }
    }

    @Override
    public String toString(){
        return this.salaray + " " + this.name+"\n";
    }
}
