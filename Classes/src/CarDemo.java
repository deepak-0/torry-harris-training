public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",22);
        Music jbl =new Music("JBL",6,2,7.7f);
        Car bmw= new Car("petrol" , "BMW", 2000 ,8,99.9f,mrf,jbl);
        Car audi=new Car("Diesel","Audi",2500,9,108.3f,mrf,jbl);
        Car honda=new Car("petrol","Honda",1350,7,90.5f,mrf,jbl);
        //bmw.displayFeatures();
        //bmw.acclerate();
       // bmw.applyBrake();
       // bmw.changeGear();
        //bmw.steer();
       // bmw.modifiedGear(9);
        //audi.modifiedGear(8);
      Tyre cont = new Tyre("Continental",28);
        audi.setTyre(cont);
       audi.tyre();
       bmw.tyre();
       audi.music();

       Music bose = new Music("Bose",8,3,10.3f);
       bmw.setMusic(bose);
       bmw.music();

       honda.displayFeatures();
       honda.tyre();
       honda.music();
    }
}
