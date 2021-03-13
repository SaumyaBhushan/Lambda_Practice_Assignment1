package com.knoldus;

public class CodeDriver {
    public static void main(String[] args){


        ScanInput scan = new ScanInput();

        int firstNo = scan.scanUserInput();
        int second_no = scan.scanUserInput();

        System.out.println(Find_Max.find_max_no.apply(firstNo, second_no));
    }
}
