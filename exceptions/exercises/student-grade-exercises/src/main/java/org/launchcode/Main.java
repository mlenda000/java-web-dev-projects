package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Divide(7, 0);
        Divide(6, 3);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        for (Map.Entry<String, String> e : studentFiles.entrySet()) {
            System.out.println(e.getValue());
            System.out.println(CheckFileExtension(e.getValue()));
        }
    }
    public static void Divide(int x, int y) {
        int answer = 0;
        try {
            answer = x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Denominator can't be zero!");
        }
        if (answer != 0){
            System.out.println(answer);
        }

    }

    public static int CheckFileExtension(String fileName)
    {   int a=0;
        if(fileName.contains(".java")){
            a+=1;
        }else if(fileName == null){
            System.out.println("testing--------");
            a-=1;
        }

        // Write code here!
        return a;

    }
}