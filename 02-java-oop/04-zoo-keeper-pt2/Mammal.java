public class Mammal {
    int energyLevel;
    Mammal() {
        energyLevel =100;
    }
    Mammal(int energy) {
        energyLevel = energy;
    }
    public int displayEnergy() {
        System.out.println("Animal is at:" + energyLevel);
        return energyLevel;
    }
}