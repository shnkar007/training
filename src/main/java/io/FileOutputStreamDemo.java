package io;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String... args) {
        String source = "Happy New Year\n"
                + " to all of you.\n"
                + " Resolve to Learn Technology day in and day out.";
        byte buf[] = source.getBytes();

        // Use try-with-resources to close the files.
        try (FileOutputStream f0 = new FileOutputStream("D:/text1.txt");
             FileOutputStream f1 = new FileOutputStream("D:/text2.txt");
             FileOutputStream f2 = new FileOutputStream("D:/text3.txt") )
        {

            // write to first file
            for (int i=0; i < buf.length; i += 2) f0.write(buf[i]);

            // write to second file
            f1.write(buf);

            // write to third file
            f2.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch(IOException e) {
            System.out.println("An I/O Error Occured");
        }

    }
}
