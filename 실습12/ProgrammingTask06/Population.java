package chap12.ProgrammingTask06;

public class Population {
    private String capital;
    private double population;

    public Population(String capital, double population) {
        this.capital = capital;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return capital + "(" + population + ")";
    }
}
