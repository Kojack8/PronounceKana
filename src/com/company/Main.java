package com.company;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Start start = new Start();
        File file = start.run();

        Read read = new Read();
        read.run(file);
    }
}
