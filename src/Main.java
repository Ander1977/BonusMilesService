public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 30_000;
        int bonus = 20;
        int miles = service.calculate(price, bonus);
        System.out.println(miles);
    }
}
