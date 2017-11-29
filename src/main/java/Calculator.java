import java.util.Scanner;

/**
 * Класс калькулятор, использует переменные с типом double (возможность вводить дробные числа)
 * и методы для вычисления
 */

public class Calculator {


    private   double a; // задаем тип переменной
    private double b;


    public  Calculator(double a, double b) {

        this.a = a; // с помощю this ссылаемся напрямую к переменной объекта <a>
        this.b = b;

    }

    /**
     * add - сложение
     *
     * @return - возвращает результат сложения 2x чисел (a+b)
     */
    public double add(){

        return a + b;
}


    /**
     * subs - вычетание
     *
     * @return - возвращает результат вычетания 2x чисел (a-b)
     */
public double subs(){

    return a - b;
}

    /**
     * multi - умножение
     *
     * @return - возвращает результат умножения 2x чисел (a*b)
     */
public double multi() {

    return a * b;
}

    /**
     * div - деление
     *
     * @return - возвращает результат деления 2x чисел (a/b)
     */
    public double div(){

    return a / b;
}


}

