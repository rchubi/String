package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
//        task1.InputTwoString();
//        task1.inputLastFirstName();

        List<Boolean> b = new ArrayList<Boolean>();
        b.add(task1.checkCorrectName("Andryi"));
        b.add(task1.checkCorrectName("er3453f"));
        b.add(task1.checkCorrectName("fkd_8jskdj"));
        b.add(task1.checkCorrectName("Oleg"));
        b.add(task1.checkCorrectName("Rj82diu"));

        System.out.println(b);


    }
}
