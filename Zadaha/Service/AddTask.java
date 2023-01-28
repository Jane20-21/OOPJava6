package Zadaha.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AddTask {
    int maxID = 0;
    String addInfo = "";
    public AddTask() {
    }

    public void writeInPlaner() throws IOException {
        FileWriter addTask = new FileWriter("D:/Geek/Java/OOPHomeWork6/JavaHomeWork/Zadaha/planer.csv", true);
        String addInfo = addInfo();
        addTask.append(addInfo);
        addTask.append("\n");
        addTask.close();
    }

    public String addInfo() throws IOException {
        int id = maxID();
        addInfo = addInfo + (id + 1) + ";";
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String nowDate = formatter.format(date);
        addInfo = addInfo + nowDate + ";";
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Введите фамилию автора задачи");
        addInfo = addInfo + in.nextLine() + ";";
        System.out.println("Введте дедлайн в формате дд-мм-гггг");
        addInfo = addInfo + in.nextLine() + ";";
        System.out.println("Кратко опишите задачу");
        addInfo = addInfo + in.nextLine() + ";";
        System.out.println("Введите приоритет задачи (1 - не срочная, 2 - средняя, 3 - срочная)");
        addInfo = addInfo + in.nextLine();
        return addInfo;
    }

    public int maxID() throws IOException {
        WorkWithPlaner planer = new WorkWithPlaner();
        ArrayList<String[]> planerSplite = planer.planerSplite(planer.planerArrayList());
        String[] temp0 = planerSplite.get(0);
        maxID = Integer.parseInt(temp0[0]);
        for (int i = 0; i < planerSplite.size(); i++) {
            String[] temp = planerSplite.get(i);
            if (Integer.parseInt(temp[0]) > maxID) {
                maxID = Integer.parseInt(temp[0]);
            }
        }
        return maxID;
    }
}
