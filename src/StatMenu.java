public class StatMenu {
    public StatMenu() {
    }

    public void run(){
        while (true) {
            char act = DataInput.getChar("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Перейти до меню редагування кафедр та факультетів\n" +
                    "2. Перейти до меню редагуваня списків\n" +
                    "3. Перейти до меню пошуку та фільтрування списків\n" +
                    "b. Закінчити програму");

            switch (act) {
                case '1':
                    EditMenu em = new EditMenu();
                    em.run();
                    break;
                case '2':
                    AddMenu am = new AddMenu();
                    am.run();
                    break;
                case '3':
                    StatMenu sm = new StatMenu();
                    sm.run();
                    break;
                case 'b':
                    System.out.println("Дякую за використання нашої програми.");
                    return;
                default:
                    System.out.println("Ви ввели не команду");
            }
        }
    }
}
