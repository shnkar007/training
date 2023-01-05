package io;

import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter (System.out,true);
        out.println("Testing the text file");
        int i = -7;
        out.println(i);
        double d = 4.5e-7;
        out.println(d);
    }
}
