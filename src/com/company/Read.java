package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    File file;

    public void run(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            Translate trans = new Translate();
            String s = scan.next();
            int i = 0;
            int j = s.length();
            while (i < j) {
                char symbol = s.charAt(i);
                if ((symbol == 'り' || symbol == 'み' || symbol == 'ひ' || symbol == 'に' || symbol == 'ち' ||
                symbol == 'し' || symbol == 'き' || symbol == 'ぎ' || symbol == 'じ' || symbol == 'び' || symbol == 'キ'
                || symbol == 'シ' || symbol == 'チ' || symbol == 'ニ' || symbol == 'ヒ' || symbol == 'ミ' || symbol == 'リ'
                || symbol == 'ギ' || symbol == 'ジ' || symbol == 'ビ') && i < j){
                    System.out.println("$$$$$$" + s.charAt(i));
                } else {
                    String translated = trans.change(symbol);
                    System.out.print(translated + " ");
                }
                i++;


            }
            System.out.println();
        }
        scan.close();
    }
}
