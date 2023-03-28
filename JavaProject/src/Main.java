public class Main {
    public static void main(String[] args) {

        Planet p=new Planet("Kb11223",95000000,500,1.3);
        Moon m=new Moon("Kb334243",190,0.5,3.2);
        Asteroid a=new Asteroid("Death from Above",8000,90,15,5);
        Asteroid a1=new Asteroid("SnowFlake",1300,9,1.3,0.4);
        Asteroid a2=new Asteroid("Tarmon gaidon",5000,300,2.6,1.6);

        p.addBody(p);
        p.addBody(a);
        p.addBody(a1);
        p.addBody(a2);

        p.printBodies(true);
    }
}