package com.bridgelabz.assignment;

import java.util.Random;

public class EmployeeWageComputation
{
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWage = 0;
        int totalHours = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int employeeAttendance = getRandomAttendance(); // 0 - Absent, 1 - Present, 2 - Part-time

            int dailyWage = 0;
            int workingHours = 0;

            switch (employeeAttendance) {
                case 0:
                    System.out.println("Day " + day + ": Employee is Absent");
                    break;
                case 1:
                    System.out.println("Day " + day + ": Employee is Present");
                    workingHours = FULL_DAY_HOURS;
                    break;
                case 2:
                    System.out.println("Day " + day + ": Employee is Part-time");
                    workingHours = PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("Invalid attendance");
                    break;
            }

            dailyWage = workingHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
            totalHours += workingHours;
        }

        System.out.println("Total working hours: " + totalHours);
        System.out.println("Total wage for the month: " + totalWage);
    }

    public static int getRandomAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }
}
