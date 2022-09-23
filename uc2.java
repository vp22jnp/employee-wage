package com.bridgelabday4;

public class uc2 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int RATE_PER_HRS = 20;
        int emphrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            emphrs = 8;
        else
            emphrs = 0;
            empwage = emphrs * RATE_PER_HRS;
            System.out.println("empwage:" +empwage);
        }
    }

