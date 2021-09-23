public class Car {
    private String fuelType;
    private String name;
    private int engineCapacity;
    private int noOfGears;
    private float power;
    private Tyre tyre;
    private Music music;

    public Car(String fuelType, String name, int engineCapacity, int noOfGears, float power, Tyre tyre, Music music) {
        this.fuelType = fuelType;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.noOfGears = noOfGears;
        this.power = power;
        this.tyre=tyre;
        this.music=music;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getName() {
        return name;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public float getPower() {
        return power;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void acclerate(){
        System.out.println(name+" Car is accelerating");
    }

    public void applyBrake(){
        System.out.println(name+" Brake is applied ");
    }
    public void changeGear(){
        System.out.println(name+" Gear changed");
    }
    public void modifiedGear(int gear){
        if(noOfGears-1 >= gear){
            System.out.println("Gear changed to "+gear);
        }
        else
            System.out.println("Enter valid gear number !!!!");

    }
    public void steer(){
        System.out.println(name+" Car is changing direction");
    }
        public void displayFeatures(){
            System.out.println("Features of "+name+" car :");
            System.out.println("Fuel type is "+fuelType);
            System.out.println("Engine capacity "+engineCapacity+ " CC");
            System.out.println("No of gears "+noOfGears);
            System.out.println("power "+power);
        }
        public void tyre(){
            System.out.println("tyre name "+tyre.getTyreName());
            System.out.println("tyre size "+tyre.getTyreSize());
        }
        public void music(){
            System.out.println("Brand name : "+music.getName());
            System.out.println("No of Speakers : "+music.getNoOFSpeaker());
            System.out.println("No of Sub woofers : "+music.getNoOfSub());
            System.out.println("Size of Display : "+music.getDisplaySize());
        }
}
