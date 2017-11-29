public class CalculatorTest {

    public static void main(String[] args) {

        ReadClass readClass = new ReadClass();

        double one;
        double two;

        System.out.print("Введите первое число: ");
        one = readClass.readNextDouble();
        System.out.print("Введите второе число: ");
        two = readClass.readNextDouble();

        Calculator calculator = new Calculator(one, two);

        System.out.println("Выбрать действие: ");
        System.out.println("1. Сложить: ");
        System.out.println("2. Умножить: ");
        System.out.println("3. Вычесть: ");
        System.out.println("4. Разделить: ");
        System.out.println("5. Выход: ");
        System.out.println("Введите номер пункта: ");

        int action = (int) readClass.readNextDouble();

        switch (action){

            case 1: System.out.println(calculator.add()); break;
            case 2: System.out.println(calculator.subs()); break;
            case 3: System.out.println(calculator.multi()); break;
            case 4: System.out.println(calculator.div()); break;
            case 5: System.out.println(calculator.mod()); break;
            case 0: break;

            default: System.out.println("Вы выбрали неверный пункт.");
        }


    }


}
