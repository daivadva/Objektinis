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

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setYear(boolean year) {
        this.year = year;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPlantHigh(int plantHigh) {
        this.plantHigh = plantHigh;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public String getContinent() {
        return this.continent;
    }
    public int getPlantHigh(){
        return this.plantHigh;
    }



}
