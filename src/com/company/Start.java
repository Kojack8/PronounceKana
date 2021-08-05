package com.company;


import javax.swing.*;
import java.io.File;
import java.nio.file.Paths;

public class Start {
    File selectFile;

    public File run(){

        String path = Paths.get("PronounceKana.iml").toAbsolutePath().toString();
        File f = new File(path);

        JFileChooser jf = new JFileChooser(path);
        jf.setCurrentDirectory(f);
        int result = jf.showOpenDialog(jf.getParent());

        if (result == JFileChooser.APPROVE_OPTION){
            selectFile = jf.getSelectedFile();

        }
        return selectFile;


    }



}
