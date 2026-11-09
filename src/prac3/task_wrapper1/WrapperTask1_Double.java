package prac3;

public class WrapperTask1_Double {
    public static void main(String[] args) {
        Double doubleObjectFirst = Double.valueOf(12.34);
        Double doubleObjectSecond = Double.valueOf("56.78");
        System.out.println("Объект 1: " + doubleObjectFirst);
        System.out.println("Объект 2: " + doubleObjectSecond);

        String stringValue = "99.99";
        double parsedDouble = Double.parseDouble(stringValue);
        System.out.println("Преобразованная строка в double: " + parsedDouble);

        Double conversionObject = Double.valueOf(45.67);
        byte primitiveByte = conversionObject.byteValue();
        short primitiveShort = conversionObject.shortValue();
        int primitiveInt = conversionObject.intValue();
        long primitiveLong = conversionObject.longValue();
        float primitiveFloat = conversionObject.floatValue();
        double primitiveDouble = conversionObject.doubleValue();

        System.out.println("Преобразование в примитивы:");
        System.out.println("byte: " + primitiveByte);
        System.out.println("short: " + primitiveShort);
        System.out.println("int: " + primitiveInt);
        System.out.println("long: " + primitiveLong);
        System.out.println("float: " + primitiveFloat);
        System.out.println("double: " + primitiveDouble);

        String doubleToString = Double.toString(3.14);
        System.out.println("Литерал double в строку: " + doubleToString);
    }
}