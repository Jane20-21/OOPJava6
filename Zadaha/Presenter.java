package Zadaha;

import java.io.IOException;
import java.util.Scanner;
import Zadaha.Service.AddTask;
import Zadaha.Service.PrintTaskInPlaner;

public class Presenter {

    public void button() throws IOException {
        Scanner in = new Scanner(System.in);
        new View().firstQuestion();
        int chois = in.nextInt();
        if (chois == 1) { 
            new Model().printPlaner(new Model().planerSplite());
        } else if (chois == 2) { 
            new View().choisTask();
            int choisTask = in.nextInt();
            new PrintTaskInPlaner(new Model().planerSplite()).printTask(choisTask);
        } else if (chois == 3) { 
            new AddTask().writeInPlaner();
        } else
            System.out.println("Выш вбор непонятен");
    }
}
