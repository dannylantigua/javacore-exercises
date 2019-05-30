/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandmaps;

/**
 *
 * @author USGDAL
 */
public class Capital {
    
    private String name;
    private String population;
    private String squareMileage;

    public Capital(String name, String population, String squareMileage) {
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getSquareMileage() {
        return squareMileage;
    }

    public void setSquareMileage(String squareMileage) {
        this.squareMileage = squareMileage;
    }
}
