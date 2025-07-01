package firstpalace;

import firstpalace.battle.onexone;
import firstpalace.enums.CharacterClasses;
import firstpalace.interfaces.Battle;
import firstpalace.models.Elf;
import firstpalace.models.Knight;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Battle battle = new onexone();

        HashMap<String, Integer> fighter1 =  new HashMap<>();
        HashMap<String, Integer> fighter2 =  new HashMap<>();
        Random random =  new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("An Elf will prepar attack, row data (D6) pressing(Enter/return)");
        scanner.nextLine();

        int attackElf = random.nextInt(7) + 1;

        Elf elf1 = new Elf("Elf","Ikaro","Florest south", CharacterClasses.ELF,attackElf,false);

        System.out.println("Now Lizardman is preparing attack, row data (D6) pressing(Enter/return)");
        scanner.nextLine();

        int attackLizarman = random.nextInt(7) + 1;

        Knight k1 = new Knight("Lizardman","Robert","Desert",CharacterClasses.KNIGHT,attackLizarman,3);

        System.out.println(elf1.attack());
        System.out.println(k1.attack());

        fighter1.put(elf1.getName(),elf1.getAttack());
        fighter2.put(k1.getName(),k1.getAttack());

        System.out.println(battle.oneone(fighter1,fighter2));

    }
}
