import java.util.ArrayList;

public class Main {

    private static ArrayList<Car> parkingSlots = new ArrayList<>();
    public static void main(String[] args) {

        //Instanz eines normalen Autos
        Car bmw = new Car(230, 180, 450, 200);
        //Instanz eines LKW
        Truck man = new Truck(100, 300, 1300, 250, 16000 );

        Camper hymer =new Camper( 120, 280, 700, 210, 2 );

        parkingSlots.add(bmw);
        parkingSlots.add(man);
        parkingSlots.add(hymer);



        //Unterklassen können auch über Basisklassen referenziert werden
        Car daf = new Truck(100, 300, 1300, 250, 16000 );

        //aber für den Zugriff auf Methoden der Unterklassen
        //ist ein Downcast notwendig
        Truck dafTruck = (Truck)daf;
        int weight = dafTruck.getWeight();

        //Aufgabe:

        //ToDo 1. Erstellen Sie eine weiter Klasse  "Camper"
        //ToDo 2. Speichern Sie in der Liste 10 Fahrzeuge von allen Typen
        //ToDo 3. Schreiben Sie ein Methode hier in main "pickRandom" die zufällig ein Fahrzeug auswählt und zurückgibt
        //ToDo 4. Wie kann ich rauskriegen, was für ein Typ das rausgezogene Objekt ist?

        var randomCar = pickRandom();
        System.out.println( "Der Typ ist "+randomCar.getClass().getSimpleName() );

    }

    private static Car pickRandom(){
        int max = parkingSlots.size();
        int randomIndex = (int)(Math.random()*max);

        return parkingSlots.get(randomIndex);
    }
}