public class CalculatorTest {

    /**
     * Данный класс запускает тест
     *
     */

    public static void main(String[] args) {

        ReadClass readClass = new ReadClass();  //вызов конструктора ReadClass

        double one; // обьявление типа и переменной
        double two;

        System.out.print("Введите первое число: "); //вывод строки в консоль
        one = readClass.readNextDouble();
        System.out.print("Введите второе число: ");
        two = readClass.readNextDouble();

        Calculator calculator = new Calculator(one, two); ////вызов конструктора Calculator

        System.out.println("Выбрать действие: ");
        System.out.println("1. Сложить: ");
        System.out.println("2. Вычесть: ");
        System.out.println("3. Умножить: ");
        System.out.println("4. Разделить: ");
        System.out.println("5. Выход: ");
        System.out.println("Введите номер пункта: ");

        int action = (int) readClass.readNextDouble(); // считывает значение в double и переводит его в int (1.0 в 1)

        switch (action){ // вызывает и выводит в консоль выбранное действие: (add,subs,multi,div)

            case 1: System.out.println(String.format("%.4f",calculator.add())); break;
            case 2: System.out.println(String.format("%.4f",calculator.subs())); break;
            case 3: System.out.println(String.format("%.4f",calculator.multi())); break;
            case 4: System.out.println(String.format("%.4f",calculator.div())); break;
            case 0: break;

            default: System.out.println("Вы выбрали неверный пункт."); // вызывается, если введеное значение не соответсвует условию swith



        }


    }


}
