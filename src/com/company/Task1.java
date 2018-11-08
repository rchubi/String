package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roman on 06.11.2018.
 */
public class Task1 {
    private Scanner in;
    private String str1;
    private String str2;

    public Task1() {
        in = new Scanner(System.in);
    }

    public void InputTwoString() {
        System.out.println("Input str1: ");
        str1 = in.nextLine();
        System.out.println("Input str2: ");
        str2 = in.nextLine();

        boolean b = str2.contains(str1);

        System.out.println(b);
    }

    public void inputLastFirstName() {
        System.out.println("Input first/last name:");
        String name = in.nextLine();

        String[] arr = name.split(" ");

        System.out.println("Initzial: " + arr[0] + " " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".");
        System.out.println("Name - " + arr[1]);
        System.out.println("Name, familia, middle name: " + arr[1] + " " + arr[0] + " " + arr[2]);
    }

    public boolean checkCorrectName(String name) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(name);
        return m.matches();

    }

}

