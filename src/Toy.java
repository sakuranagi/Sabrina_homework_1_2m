public class Toy {
    private ToyType toyType;
    private Material material;
    private Factory factory;

    public Toy(ToyType toyType, Material material, Factory factory) {
        this.toyType = toyType;
        this.material = material;
        this.factory = factory;
    }

    public ToyType getToyType() {
        return toyType;
    }

    public Material getMaterial() {
        return material;
    }

    public Factory getFactory() {
        return factory;
    }

    public String getInfo() {
        return  "TOY TYPE: " + toyType +
                "\nMATERIAL: " + material +
                "\nFACTORY: " + factory.getName() +
                "\nMADE IN: " + factory.getCountry();

    }
}
