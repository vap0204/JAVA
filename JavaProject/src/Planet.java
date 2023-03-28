import java.util.ArrayList;

public class Planet  extends CosmicObjects{

    private double distanceToSun;//AU

    private ArrayList<CosmicObjects> cosmicBodies=new ArrayList<>();
    public Planet(String name,double mass,double diameter,double distanceToSun){
        super(name,mass,diameter);
        this.distanceToSun=distanceToSun;
    }

    public void addBody(CosmicObjects body){
        cosmicBodies.add(body);

    }

    public void printBodies(boolean dangerousOnly){
        for(int i=0;i<cosmicBodies.size();i++){
            if (dangerousOnly) {
                if(cosmicBodies.get(i) instanceof Asteroid){
                    Asteroid temp=(Asteroid) cosmicBodies.get(i);
                    if(temp.collisionChance()>30){
                        System.out.println(temp);
                        System.out.print("Demage: "+ temp.collisionDamage());
                    }
                }

            }else{
                System.out.println(cosmicBodies.get(i));
            }

        }
    }
    @Override
    public double gravitatinalAcceleration() {
        return(getMass()/getDiameter())/Math.pow(Math.sqrt(distanceToSun)/3,20);

    }
}
