package decorator.example.decorator;

public class RoadDecorator extends Terrain {

    protected Terrain terrain;

    public RoadDecorator(Terrain terrain) {
        super("",0);
        this.terrain = terrain;
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() - 10;
    }

    @Override
    public String description() {
        return terrain.description() + " z drogą";
    }
}
