import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiderTest {

    @Test
    public void deveRetornarNome() {
        Lider.getInstance().setNome("Caio");
        assertEquals("Caio", Lider.getInstance().getNome());
    }

    @Test
    public void deveRetornarEquipe() {
        Lider.getInstance().setEquipe("Sala Agil");
        assertEquals("Sala Agil", Lider.getInstance().getEquipe());
    }

}

