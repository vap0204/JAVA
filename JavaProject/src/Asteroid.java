import java.util.Random;

public class Asteroid extends CosmicObjects implements Detection{
    private double distanceToPlanet;
    private double distanceToSun;
    Random random=new Random();
    public Asteroid(String name,double mass,double diameter,double distanceToPlanet,double distanceToSun){
        super(name,mass,diameter);
        this.distanceToPlanet=distanceToPlanet;
        this.distanceToSun=distanceToSun;
    }

    @Override
    public double gravitatinalAcceleration() {
        return Detection.SOACE_FACTOR*(getMass()/getDiameter())/Math.pow(Math.sqrt(distanceToSun)/3,20)-distanceToPlanet;
    }

    @Override
    public double collisionChance() {
        return random.nextInt(101)*distanceToPlanet;
    }

    @Override
    public double collisionDamage() {
        return (getMass()/getDiameter()*random.nextDouble());
    }
}
