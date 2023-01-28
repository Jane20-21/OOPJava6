package Zadaha;

import java.io.IOException;
import java.util.ArrayList;

import Zadaha.Service.WorkWithPlaner;

public class Model {
    public  ArrayList<String[]>  planerSplite() throws IOException {
        WorkWithPlaner planer = new WorkWithPlaner();
        ArrayList<String> planerString = planer.planerArrayList();
        ArrayList<String[]> planerSplite = planer.planerSplite(planerString);
        return planerSplite;
    }

        public void printPlaner(ArrayList<String[]> planerSplite) {
            for (String[] element : planerSplite) {   
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            }
        }
}
