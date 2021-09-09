public class ZooKeepOneTest {
    public static void main(String[] args) {
        Gorilla koko = new Gorilla();
        Bat wayne =new Bat();
        koko.displayEnergy();//100
        koko.throwSomething();//95
        koko.throwSomething();//90
        koko.throwSomething();//85
        koko.eatBananas();//95
        koko.eatBananas();//105
        koko.climb();//95
        wayne.displayEnergy();//300
        wayne.attackTown();//200
        wayne.attackTown();//100
        wayne.attackTown();//0
        wayne.eatHuman();//25
        wayne.eatHuman();//50
        wayne.fly();//0
        wayne.fly();//-50

    }
}
