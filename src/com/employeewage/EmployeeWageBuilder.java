package com.employeewage;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        int empHours=0;
        int empWage=0;
        Random random=new Random();
        int empCheck=random.nextInt(3);
        if(empCheck==IS_FULL_TIME) {
            System.out.println("Employee is present");
            empHours=8;
        }
        else if(IS_PART_TIME==empCheck) {
            empHours=4;
            System.out.println("Employee is Half Day");
        }
        else {
            empHours=0;
        }
        empWage=empHours*EMP_RATE_PER_HOUR;
        System.out.println("The daily wage of EMployee is "+ empWage);
    }
}
