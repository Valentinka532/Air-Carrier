public class Main {
    public static void main(String[] args) {

        double ticketCost = 13676;

        double bonusMilesPerRuble = 20;

        int bonusMiles = (int) (ticketCost / bonusMilesPerRuble);

        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}