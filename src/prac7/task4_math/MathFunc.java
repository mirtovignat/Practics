package prac7;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double baseValue, double exponentValue) {
        return Math.pow(baseValue, exponentValue);
    }

    @Override
    public double complexModule(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        MathFunc mathFunction = new MathFunc();
        System.out.println("Длина окружности радиуса 5: " + mathFunction.circleLength(5));
        System.out.println("Степень 2^3: " + mathFunction.power(2, 3));
        System.out.println("Модуль комплексного числа 3+4i: " + mathFunction.complexModule(3, 4));
    }
}