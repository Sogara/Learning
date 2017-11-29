import java.util.Scanner; // импорт класса Scanner

/**
 * Класс для считывания переменных
 */

public class ReadClass {

    public double readNextDouble() {  // Метод класса Scanner

        Scanner sc = new Scanner(System.in); // вызов конструктора Scanner
        double i = 0;

        if (sc.hasNextDouble()) {// проверяет, можно ли считать с потока ввода вещественное число типа double
            i = sc.nextDouble();// nextDouble() — считывает вещественное число типа double
        } else {
            System.out.println("Вы ввели не целое число");
        }

        return i; // возвращает значение из переменной <i>

    }

}



