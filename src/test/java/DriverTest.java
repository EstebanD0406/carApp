import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        driver.startCar(voiture);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        driver.stopCar(voiture);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        driver.changeSpeed(voiture, 80);
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }
}
