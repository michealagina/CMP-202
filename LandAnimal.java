public class LandAnimal extends Animal {
    @Override
    String move() {
        return "Swings on tree";
    }
    public static void main(String[] args) {
        LandAnimal tiger = new LandAnimal();
        lion.name = "tigris";
        LandAnimal ape = new LandAnimal();
        System.out.println(tiger.move());
        System.out.println(ape.move());
    }
}
