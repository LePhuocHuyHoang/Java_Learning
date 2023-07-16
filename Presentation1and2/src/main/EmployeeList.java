package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EmployeeList {
    protected ArrayList<Employee> list;
    public EmployeeList(){
        this.list = new ArrayList<Employee>();
    }

    public EmployeeList(ArrayList<Employee> list) {
        this.list = list;
    }
    public void addEmployee(Employee employee){
        this.list.add(employee);
    }
    public void readSalary(){
        for (Employee employee:list) {
            System.out.println(employee);
        }
    }
    public Employee getFristEmployee() {
        for (Employee employee : list) {
            if (!(employee instanceof Manager)) {
                return employee;
            }
        }
        return null;
    }
    public void checkNullArray() {
        Employee firstEmployee = getFristEmployee();
        if (firstEmployee != null) {
            System.out.println(firstEmployee);
        } else {
            System.out.println("No employee found in the list.");
        }
    }
    public void readHighestSalary(){
        Collections.sort(this.list, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if (employee1.salary(employee1.workingDay, employee1.overTime) < employee2.salary(employee2.workingDay, employee2.overTime)){
                    return 1;
                }
                else if (employee1.salary(employee1.workingDay, employee1.overTime) > employee2.salary(employee1.workingDay, employee2.overTime)) {
                    return -1;
                }
                else {
                    return -0;
                }
            }
        });
    }
}
