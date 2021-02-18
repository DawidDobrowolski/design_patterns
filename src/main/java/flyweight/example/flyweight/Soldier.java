package flyweight.example.flyweight;

public class Soldier {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;


    public Soldier(int x, int y) {
        this.stats = UnitStatsRepository.getSoldierUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
