public class Main {
    private static  DataInput di = new DataInput();
    private static EditMenu em = new EditMenu();
    private static StatMenu sm = new StatMenu();
    private static AddMenu am = new AddMenu();
    public static void main(String[] args) {
        while (true) {
            char act = di.getChar("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Перейти до меню редагування кафедр та факультетів\n" +
                    "2. Перейти до меню редагуваня списків\n" +
                    "3. Перейти до меню пошуку та фільтрування списків\n" +
                    "b. Закінчити програму");

            switch (act) {
                case '1':
                    em.run();
                    break;
                case '2':
                    am.run();
                    break;
                case '3':
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