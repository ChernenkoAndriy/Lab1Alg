/*
Клас Main відповідає за головне меню програми.
Він використовується для керування виконанням програми та навігації між різними опціями.
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            char act = DataInput.getChar("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Перейти до меню редагування кафедр та факультетів\n" +
                    "2. Перейти до меню додавання списків\n" +
                    "3. Перейти до меню пошуку та фільтрування списків\n" +
                    "b. Закінчити програму");

            switch (act) {
                case '1':
                    EditMenu.run();
                    break;
                case '2':
                    AddMenu.run();
                    break;
                case '3':
                    StatMenu.run();
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