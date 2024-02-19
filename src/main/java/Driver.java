public class Driver {
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= 10;
    }

    public void startCar(Voiture voiture) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Voiture voiture) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeSpeed(Voiture voiture, int nouvelleVitesse) {
        System.out.println(name + " change la vitesse de la voiture à " + nouvelleVitesse);
        voiture.accelerate();
    }
}