import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    private Voiture voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Voiture("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        voiture.accelerate();
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        voiture.accelerate();
        voiture.decelerate();
        assertThat(voiture.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testAfficherDetails() {
        // How to assert the output using AssertJ for console output?
        // Note: Testing console output is often more complex and depends on additional libraries.
    }
}
