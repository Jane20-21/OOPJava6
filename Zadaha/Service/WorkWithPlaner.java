package Zadaha.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithPlaner {
    ArrayList<String> planer = new ArrayList<>();
    ArrayList<String[]> planerSplite = new ArrayList<>();
    public WorkWithPlaner() {
    }

    public ArrayList<String> planerArrayList() throws IOException {
        FileReader inFile = new FileReader("D:/Geek/Java/OOPHomeWork6/JavaHomeWork/Zadaha/planer.csv");
        Scanner file = new Scanner(inFile);
        while (file.hasNextLine()) {
            String line = file.nextLine();
            planer.add(line);
        }
        return planer;
    }

    public ArrayList<String[]> planerSplite(ArrayList<String> planer) {
        for (String element : planer) {
            String[] lineTemp = element.split(";");
            planerSplite.add(lineTemp);
        }
        return planerSplite;
    }
}
