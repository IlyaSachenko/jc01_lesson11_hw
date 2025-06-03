public class ComplexNumber {
    public double real;
    public double imaginary;

    //Сложение комплексных чисел
    public ComplexNumber add(ComplexNumber other){
        ComplexNumber result = new ComplexNumber();
        result.real = this.real + other.real;
        result.imaginary = this.imaginary + other.imaginary;
        return result;
    }

    //Вывод чисел в виде строки
    public String getString(){
        return String.format("%.1f + %.1fi", real, imaginary);
    }
}
