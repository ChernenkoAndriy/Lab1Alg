public class StatMenu {
    public StatMenu() {
    }

    public static void run() {
        while (true) {
            int act = DataInput.getInt("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Вивести всіх студентів впорядкованих за курсами\n" +
                    "2. Вивести всіх студентів факультета впорядкованих за алфавітом\n" +
                    "3. Вивести всіх викладачів факультета впорядкованих за алфавітом\n" +
                    "4. Вивести всіх студентів кафедри впорядкованих за курсами\n" +
                    "5. Вивести всіх студентів кафедри впорядкованих за алфавітом\n" +
                    "6. Вивести всіх викладачів кафедри впорядкованих за алфавітом\n" +
                    "7. Вивести всіх студентів кафедри вказаного курсу\n" +
                    "8. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом\n" +
                    "9. Вивести студента за ПІБ\n" +
                    "10. Вивести викладача за ПІБ \n" +
                    "11. Вивести студента за спеціальністю\n" +
                    "b. Повернутися до головного меню");

            switch (act) {
                case 1:
                    // виведення всіх студентів впорядкованих за курсами
                    break;
                case 2:
                    // виведення всіх студентів факультета впорядкованих за алфавітом
                    break;
                case 3:
                    // виведення всіх викладачів факультета впорядкованих за алфавітом
                    break;
                case 4:
                    // виведення всіх студентів кафедри впорядкованих за курсами
                    break;
                case 5:
                    // виведення всіх студентів кафедри впорядкованих за алфавітом
                    break;
                case 6:
                    // виведення всіх викладачів кафедри впорядкованих за алфавітом
                    break;
                case 7:
                    // виведення всіх студентів кафедри вказаного курсу
                    break;
                case 8:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 9:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 10:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 11:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 'b':
                    return;
                default:
                    System.out.println("Ви ввели невірну команду");
            }
        }
    }
}
