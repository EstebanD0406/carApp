public class Voiture {
    private String model;
    private String color;
    private int speed;

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
            speed += 10;
            showDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void decelerate() {
        if (isFast()) {
            speed -= 10;
            showDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    private boolean isFast() {
        return speed - 10 >= 0;
    }

    private boolean isSlow() {
        return speed + 10 <= 120;
    }

    public void showDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }
}