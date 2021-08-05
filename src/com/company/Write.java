package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Write {

    public void run(String s) {
        System.out.println(s);
        String path = Paths.get("translated").toAbsolutePath().toString();
        File f = new File(path);
        System.out.println(f.toString());
        try {
            // PrintWriter pw = new PrintWriter(fName); //can't append like this
            PrintWriter pw = new PrintWriter(new FileOutputStream(path + "\\Translation.txt", true));
            pw.write(s);

            pw.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
