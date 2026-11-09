package prac7;

public class ProcessStrings implements StringOperations {
    @Override
    public int countCharacters(String inputString) {
        return inputString.length();
    }

    @Override
    public String getOddCharacters(String inputString) {
        StringBuilder resultString = new StringBuilder();
        for (int index = 0; index < inputString.length(); index += 2) {
            resultString.append(inputString.charAt(index));
        }
        return resultString.toString();
    }

    @Override
    public String reverseString(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings();
        String testString = "Программирование";
        System.out.println("Символов: " + processStrings.countCharacters(testString));
        System.out.println("Нечетные позиции: " + processStrings.getOddCharacters(testString));
        System.out.println("Инверсия: " + processStrings.reverseString(testString));
    }
}