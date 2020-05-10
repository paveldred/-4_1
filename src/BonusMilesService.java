public class BonusMilesService {
    public static int calculate(int cost) {
        int miles = cost / 100 / 20;
        return miles;
    }

}
