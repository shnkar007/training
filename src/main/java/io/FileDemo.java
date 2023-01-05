package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File ("D:");
        try{
            File f2 = new File("D:/FirstFile.txt");
            if(f2.exists()){
                f2.delete();
            }
            boolean b = f2.createNewFile ();
            System.out.println("file created");
        }catch(IOException ie){
            ie.printStackTrace();
        }
        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exist");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
        p(f1.isFile() ? "is normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + f1.lastModified());
        p("File size: " + f1.length() + " Bytes");

    }
}
