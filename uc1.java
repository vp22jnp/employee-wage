package com.bridgelabday4;

import java.sql.SQLOutput;

public class uc1 {
    public static void main(String[] args) {
        int IS_FULL_TIME =1;
        double empcheck=Math.floor(Math.random()*10)%2;
        if (empcheck== IS_FULL_TIME) {
            System.out.println("employee is present");
        }else{
            System.out.println("employee is absent");
        }
    }
}
