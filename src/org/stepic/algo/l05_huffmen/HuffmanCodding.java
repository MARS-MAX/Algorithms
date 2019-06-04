package org.stepic.algo.l05_huffmen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HuffmanCodding {

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\Макс\\IdeaProjects\\Algorithm&DataStructure\\src\\org\\stepic\\algo\\l05_huffmen\\input.txt"));
        String s = input.next();

        Map<Character, Integer> count = new HashMap<>();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new HuffmanCodding().run();
    }

}
