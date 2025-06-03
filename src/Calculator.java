
public class Calculator {
    public static void main(String[] args) {

        //Создание комплексных чисел
        ComplexNumber x = new ComplexNumber();
        x.real = 1.1;
        x.imaginary = 1.1;

        ComplexNumber y = new ComplexNumber();
        y.real = 2.2;
        y.imaginary = 2.2;

        //Сложение
        ComplexNumber result = addNumbers(x, y);

        //Вывод результата
        printer(x, y, result);
    }

    //Метод для сложения чисел
    private static ComplexNumber addNumbers(ComplexNumber x, ComplexNumber y){
        return x.add(y);
    }

    //Метод вывода на экран
    private static void printer(ComplexNumber x, ComplexNumber y, ComplexNumber result){
        System.out.println("Число Х " + x.getString());
        System.out.println("Число Y " + y.getString());
        System.out.println("Результат вычисления " + result.getString());
    }
}