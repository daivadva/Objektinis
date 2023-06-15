public class Plant {
    private String name;
    private String latinName;
    private boolean year;
    private String continent;
    private int plantHigh;
    private boolean edible;

    public Plant() {
    }

    public Plant(String name, String latinName, boolean year, String continent, int plantHigh, boolean edible) {
        this.name = name;
        this.latinName = latinName;
        this.year = year;
        this.continent = continent;
        this.plantHigh = plantHigh;
        this.edible = edible;
    }

    public void setName(String name) {
        this.name = name;
    }


}
