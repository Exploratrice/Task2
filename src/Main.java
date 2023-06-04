public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int contributed = 1100;
        int bonus = contributed / 100;

        int sum;
        if (contributed > 1000) {
            sum = amount + contributed + bonus;
        } else {
            sum = amount + contributed;
        }

            System.out.println("Итоговый счет: ");
            System.out.println((sum) + " рублей(ь)");
            System.out.println("Из них: ");
            System.out.println((bonus) + " бонусных рублей(я)");
        }
    }