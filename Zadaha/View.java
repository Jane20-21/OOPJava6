package Zadaha;

public class View {
    
    public void firstQuestion() {
        System.out.println("Что вы хотите сделать?\n"
                + "1. Распечатать планер\n"
                + "2. Вывести на экран задачи с определнным уровнем приоритета\n"
                + "3. Добавить задачу в планер");
    }

    public void choisTask() {
        System.out.println("Выберите, задачу какого приоритера вы хотите вывести на экран:\n"
                + "1 - не срочная; 2 - средняя; 3 - срочная");
    }
}
