package main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    protected String name;
    protected String ministry;
    protected int workingDay;
    protected double salaryDay;
    protected int overTime;

    public Employee() {
    }
    public Employee(String name,String ministry,int workingDay, double salaryDay, int overTime) {
        this.name = name;
        this.ministry = ministry;
        if (workingDay >= 0 && workingDay <= 31){
            this.workingDay = workingDay;
        }else {
            this.workingDay = 0;
        }
        if (overTime >= 0 && overTime <= 31){
            this.overTime = overTime;
        }else {
            this.overTime = 0;
        }
        this.salaryDay = salaryDay;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        if(workingDay>= 1 && workingDay <=31){
            this.workingDay = workingDay;
        }
    }
    public double getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(double salaryDay) {
        this.salaryDay = salaryDay;
    }

    public String getMinistry() {
        return ministry;
    }

    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }


    public double salary(int workingDay, int overTime){
         return salaryDay * workingDay + overTime * 300000;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMaximumFractionDigits(0);
        return "Employee[" +
                "Name= " + name  +
                ", Ministry= " + ministry  +
                ", Working Day= " + workingDay  +
                ", Salary= " + numberFormat.format(salary(workingDay, overTime)) +
                ']';
    }
}
