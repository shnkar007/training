package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Using Buffered Reader reading a character
 * till q is encountered
 */
public class SimpleIOOperation {

    public static void main(String[] args) {
        char c;
        try {
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
            System.out.println ("Enter characters, 'q' to quit.");
            // read characters
            do {
                c = (char) br.read ( );
                System.out.println (c);
            } while (c != 'q');
        }catch(IOException e){
            System.out.println("IOException occurred");
        }
    }
}
