public class Camper extends Car {

    private int bed;

    public Camper(int speed, int height, int length, int width, int bed) {
        super(speed, height, length, width);
        this.bed = bed;
    }


    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }
}
