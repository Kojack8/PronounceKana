package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    File file;

    public void run(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        Write writer = new Write();
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
                || symbol == 'ギ' || symbol == 'ジ' || symbol == 'ビ') && (i + 1 < j) && (s.charAt(i+1) == 'ャ' ||
                s.charAt(i+1) == 'ゃ' || s.charAt(i+1) == 'ュ' || s.charAt(i+1) == 'ゅ' || s.charAt(i+1) == 'ョ' ||
                s.charAt(i+1) == 'ょ')){
                    char cYoon = s.charAt(i + 1);
                    String ans = trans.yoon(symbol, cYoon);
                    writer.run(ans + " ");
                    i++;
                } else {
                    String translated = trans.change(symbol);
                    writer.run(translated + " ");
                }
                i++;


            }
            writer.run("\n");
        }
        scan.close();
    }
}
