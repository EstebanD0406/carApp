public class Application {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.startCar(maVoiture);
        maVoiture.accelerate();
        moi.changeSpeed(maVoiture, 80);
        maVoiture.decelerate();
        moi.stopCar(maVoiture);
        maVoiture.showDetails();
    }
}