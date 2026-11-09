package prac4;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщений на номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "Phone{number='" + number + "', model='" + model + "', weight=" + weight + "}";
    }

    public static void main(String[] args) {
        Phone phoneFirst = new Phone("+79111111111", "Nokia", 0.2);
        Phone phoneSecond = new Phone("+79222222222", "Samsung");
        Phone phoneThird = new Phone();

        phoneFirst.receiveCall("Александр");
        phoneSecond.receiveCall("Иван", "+79999999999");
        phoneFirst.sendMessage("+79111111111", "+79222222222", "+79333333333");
    }
}