package firstpalace.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class ElfTest {

    @Test
    public void testAttack() {
        Elf elf = new Elf("Elf", "Tauriel", "Forest", null, 30, true);
        String result = elf.attack();
        assertEquals("By sky and earth I will defend my land !!!", result);
    }
}
