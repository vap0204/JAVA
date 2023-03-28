public class Moon extends CosmicObjects{
    private double distanceToPlanet;
    public Moon(String name,double mass,double diameter,double distanceToPlanet){
        super(name,mass,diameter);
        this.distanceToPlanet=distanceToPlanet;

    }

    @Override
    public double gravitatinalAcceleration() {
        return(getMass()/getDiameter())/Math.pow(Math.sqrt(distanceToPlanet)/3,20);
    }
}
