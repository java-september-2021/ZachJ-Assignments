public class Bat extends Mammal {
    Bat() {
        super(300);
    }
    public int getEnergyLevel() {
        return this.energyLevel;
        }

    public int fly() {
        getEnergyLevel();
        int energyLevel = this.energyLevel - 50;
        System.out.println("Whoosh! Like the night, the bat flies off! Bat is at:" + energyLevel);
        setEnergyLevel();
        return this.energyLevel;
    }
    public int eatHuman() {
        getEnergyLevel();
        int energyLevel = this.energyLevel + 25;
        System.out.println("Somewhere nearby, a screech is heard, followed by squelching noise. Bat is at:" + energyLevel);
        setEnergyLevel();
        return this.energyLevel;
    }
    public int attackTown() {
        getEnergyLevel();
        energyLevel=this.energyLevel - 100;
        System.out.println("With a blodcurdling screech, the bat destroys City Hall! Bat is at:" + energyLevel);
        setEnergyLevel();
        return this.energyLevel;
    }

    public void setEnergyLevel() {
        this.energyLevel = energyLevel;
    }
}
