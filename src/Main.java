public class Main {
    public static void main(String[] args) {

        int balans = 90; // текущий баланс
        int x = 1000; // сумма пополнения
        if (x >= 1000) {
            System.out.println("Ваш баланс: ");
            System.out.println((x / 100) + (balans) + (x) + " рублей.");
            System.out.println("Начисленно " +(x / 100)+" баллов.");
        } else {
            System.out.println("Ваш баланс:");
            System.out.println((x) + (balans) + " рублей");
        }
        System.out.println("Хорошего дня!");
    }
}