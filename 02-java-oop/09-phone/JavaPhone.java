public abstract class JavaPhone {
    protected String version;
    protected int battery;
    protected String carrier;
    protected String ringtone;

    public JavaPhone(String version, int battery, String carrier, String ringtone) {
        this.version = version;
        this.battery= battery;
        this.carrier= carrier;
        this.ringtone= ringtone;
    }
    public abstract void displayInfo();

    public void setVersion(String version){
        this.version=version;
    }
    public void setBattery(int battery){
        this.battery=battery;
    }
    public void setRingtone(String ringtone){
        this.ringtone=ringtone;
    }
    public void setCarrier(String carrier){
        this.carrier=carrier;
    }
    public String getVersion() {
        return version;
    }
    public int getBattery() {
        return battery;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getRingtone() {
        return ringtone;
    }
}
