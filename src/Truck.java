public class Truck extends  Car {

       private int weight;

    public Truck(int speed, int height, int length, int width, int weight) {
        super(speed, height, length, width);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
