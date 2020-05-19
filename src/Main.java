public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price;
        int bonus;
        int miles = service.calculate(price = 60_000, bonus = 20);
        System.out.println(miles);
    }
}
