public class Gorilla extends Mammal {
    Gorilla(){
        super();
    }
    public int throwSomething() {
        getEnergyLevel();
        int energyLevel= this.energyLevel-5;
        System.out.println("Splat! Gorilla is now at:" + energyLevel);
        setEnergyLevel();
        return this.energyLevel;
    }
    public int eatBananas() {
        getEnergyLevel();
        int energyLevel = this.energyLevel + 10;
        System.out.println("Mmm. Gorilla is now at:" + energyLevel);
        setEnergyLevel();
        return this.energyLevel;
    }
    public int climb() {
        getEnergyLevel();
        int energyLevel = this.energyLevel -10;
        System.out.println("Whoa! Gorilla is now up high and at:" + energyLevel);
        setEnergyLevel();
        return this.energyLevel;
    }

    public void setEnergyLevel() {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }
}