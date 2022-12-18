public class Main {
    public static void main(String[] args) {
        int ticket_price = 1000; // цена одного билета
        int mile_price = 20; // количесво рублей для 1 мили
        int mili = ticket_price / mile_price;

        System.out.println("Начислено бонусов: " + mili);
    }
}

