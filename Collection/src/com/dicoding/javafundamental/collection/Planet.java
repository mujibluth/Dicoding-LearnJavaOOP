public class Planet {
    private String name;
    private Double mass;
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}