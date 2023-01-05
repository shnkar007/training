package io;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResDemo {
    public static void main(String... args) {


    int i;
     // First, confirm that both files has been specified.
    if(args.length != 2) {
        System.out.println("Usage: CopyFile from to");
        return;
    }

    // Copy a File.
    try(FileInputStream fin = new FileInputStream(args[0]);
    FileOutputStream fout = new FileOutputStream(args[1])) {
        // Attempt to open the files.


        do {
            i = fin.read();
            if(i != -1) fout.write(i);
        } while(i != -1);

    } catch(IOException e) {
        System.out.println("I/O Error: " + e);
     }

    }
}
