public abstract class CosmicObjects {
    private String name;
    private double mass; //tones
    private double diameter; //km

    public CosmicObjects(String name,double mass, double diameter){
        this.name=name;
        this.mass=mass;
        this.diameter=diameter;
    }

    @Override
    public String toString() {
        return "CosmicObjects{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", diameter=" + diameter +
                '}';
    }

    public abstract double gravitatinalAcceleration();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
