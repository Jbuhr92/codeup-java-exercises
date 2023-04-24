package vehicles;

public class PequePeque extends Vehicle{

    public void makeNoise(){
        System.out.println("Pecky-pecky-pecky-pecky");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("sputter sputter kablunk");
    }
}
