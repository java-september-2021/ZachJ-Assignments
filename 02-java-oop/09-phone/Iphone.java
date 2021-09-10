public class Iphone extends JavaPhone implements Ringable {
    public Iphone(String version, int battery, String carrier, String ringtone){
        super(version, battery, carrier, ringtone);
    }
    @Override
    public void ring(){
        super.getRingtone();
        System.out.printf("%s", ringtone);
    }
    @Override
    public void unlock(){
    System.out.println("Unlocking via Face ID");
    }

    @Override
    public void displayInfo() {
        super.getVersion();
        super.getBattery();
        super.getCarrier();
        System.out.println("Version:"+version);
        System.out.println("Current Battery:"+battery);
    }
}
