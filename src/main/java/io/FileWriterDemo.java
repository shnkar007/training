package io;

import java.io.*;

class FileWriterDemo {
    public static void main(String args[]) throws IOException {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        char buffer[] = new char[source.length ( )];
        source.getChars (0, source.length ( ), buffer, 0);

     /*   try (FileWriter f0 = new FileWriter ("file1.txt");
             FileWriter f1 = new FileWriter ("file2.txt");
             FileWriter f2 = new FileWriter ("file3.txt")) {
            // write to first file
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write (buffer[i]);
            }

            // write to second file
            f1.write (buffer);

            // write to third file
            f2.write (buffer, buffer.length - buffer.length / 4, buffer.length / 4);

        } catch (IOException e) {
            System.out.println ("An I/O Error Occured");
        }*/
        FileWriterDemo fd = new FileWriterDemo();
        fd.bufferedWriterex ();
    }
    public void bufferedWriterex(){
        File file = new File("D:/buffwriter.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        String data = "This is an example \n"+
                "of using buffered writer \n"+
                "please try this at home";
        String withSeparator = data+System.lineSeparator();
        try{
            fw=new FileWriter(file);
            bw= new BufferedWriter (fw);
            System.out.println(data.length());
            for(int i=3;i>0;i--) {
                bw.write (data);
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}