public class Main {
    public static void main(String[] args) {
        //Стоимость билета
        int ticketPrice = 5000;
        //Количество рублей для одной бонусной мили
        int forOneMile = 20;
        //Расчитываем количество бонусных милей
        int bonusMiles = ticketPrice / forOneMile;
        //Выводим количество бонусных миль на экран
        System.out.println("Количество бонусных миль = " + bonusMiles);
    }
}