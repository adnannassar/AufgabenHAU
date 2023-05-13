package org.example;

import com.google.gson.Gson;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        // Gson gson = new Gson();
        System.out.println(add(1, 2));
        System.out.println(add(2, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

}