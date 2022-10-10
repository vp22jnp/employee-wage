package com.bridgelabday4;
import java.util.Random;
public class uc8 {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;

    public static int computeEmpwage(String company, int empratePerHour, int numOfworkingdays, int maxHoursPerMonth) {
        int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
        while (totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfworkingdays) {
            totalworkingdays++;
            int empcheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empcheck) {
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;

            }
            totalemphrs += emphrs;
            System.out.println("Day:" + totalworkingdays + "emphrs:" + emphrs);
        }
        int totalEmpwage = totalemphrs * empratePerHour;
        System.out.println("total empwage for company:" + "company is" + totalEmpwage);
        return totalEmpwage;
    }

    public static void main(String[] args) {
        computeEmpwage("mahindra", 20, 2, 10);
        computeEmpwage("tata", 10, 4, 20)  ;
    }
}