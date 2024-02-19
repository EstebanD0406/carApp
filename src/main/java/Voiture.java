public class Voiture {
    private String model;
    private String color;
    private int speed;

    final int marginSpeed = 10;
    final int maxSpeed = 120;
    final int minSpeed = 0;

    public Voiture(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (isSlow()) {
            speed += marginSpeed;
            showDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void decelerate() {
        if (isFast()) {
            speed -= marginSpeed;
            showDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    private boolean isFast() {
        return speed - marginSpeed >= minSpeed;
    }

    private boolean isSlow() {
        return speed + marginSpeed <= maxSpeed;
    }

    public void showDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }
}