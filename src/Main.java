public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000; // цена одного билета
        int milePrice = 20; // количесво рублей для 1 мили
        int mili = ticketPrice / milePrice;

        System.out.println("Начислено бонусов: " + mili);
    }
}

