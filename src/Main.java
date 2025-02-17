public class Main {

    public static void main(String[] args) {

        //Instanz eines normalen Autos
        Car bmw = new Car(230, 180, 450, 200);
        //Instanz eines LKW
        Truck man = new Truck(100, 300, 1300, 250, 16000 );

        //Unterklassen können auch über Basisklassen referenziert werden
        Car daf = new Truck(100, 300, 1300, 250, 16000 );

        //aber für den Zugriff auf Methoden der Unterklassen
        //ist ein Downcast notwendig
        Truck dafTruck = (Truck)daf;
        int weight = dafTruck.getWeight();

    }
}