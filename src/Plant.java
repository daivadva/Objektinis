public class Plant {
    private String name;
    private String latinName;
    private boolean annualPlant; //true = annual, false = perennial
    private String continent;
    private int plantHigh;
    private boolean edible; // true = edible, false = perennial

    public Plant() {
    }

    public Plant(String name, String latinName, boolean annualPlant, String continent, int plantHigh, boolean edible) {
        this.name = name;
        this.latinName = latinName;
        this.annualPlant = annualPlant;
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

    public void setAnnualPlant(boolean annualPlant) {
        this.annualPlant = annualPlant;
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

    public boolean isAnnualPlant(){
        return annualPlant;
    }

    public boolean isEdible(){
        return edible;
    }



}
