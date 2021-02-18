package flyweight.example.flyweight;

public class UnitStatsRepository {

    private static UnitStats teslaTankUnitStats = new UnitStats("TeslaTank",200,100,50,25);
    private static UnitStats soldierUnitStats = new UnitStats("Rifleman", 25, 5, 20, 25);
    private static UnitStats DestroyerUnitStats = new UnitStats("Destroyer", 500, 250, 70, 10);

    private UnitStatsRepository() {
    }

    public static UnitStats getTeslaTankUnitStats() {
        return teslaTankUnitStats;
    }

    public static UnitStats getSoldierUnitStats() {
        return soldierUnitStats;
    }

    public static UnitStats getDestroyerUnitStats() {
        return DestroyerUnitStats;
    }
}
