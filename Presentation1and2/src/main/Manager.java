package main;

import java.util.Collections;
import java.util.Comparator;

public class Manager extends Employee {

    public Manager(String name,String ministry,int workingDay,int overTime){
        super(name,ministry,workingDay,1500000,overTime);
    }
}
