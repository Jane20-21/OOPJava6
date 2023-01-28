package Zadaha.Service;

import java.util.ArrayList;

public class PrintTaskInPlaner {
    private ArrayList<String[]> planerSplite;
    public PrintTaskInPlaner(ArrayList<String[]> planerSplite) {
        this.planerSplite = planerSplite;
    }

    public void printTask(int prioritet) {
        for (String[] element : planerSplite) {
            if (prioritet == 1 && element[5].equals("1")) {
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            } else if (prioritet == 2 && element[5].equals("2")) {
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            } else if (prioritet == 3 && element[5].equals("3")) {
                for (int i = 0; i < element.length; i++) {
                    System.out.print(element[i] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
