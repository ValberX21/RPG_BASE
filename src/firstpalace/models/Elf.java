package firstpalace.models;

import firstpalace.enums.CharacterClasses;
import firstpalace.interfaces.CastSpell;
import firstpalace.interfaces.CharacterActions;

public class Elf extends baseCharacter implements CharacterActions, CastSpell {

    private boolean _HighElf;

    public Elf(String race, String name, String origem, CharacterClasses charClass, int attack, boolean highElf) {
        super(race, name, origem, charClass, attack);
        this._HighElf = highElf;
    }

    @Override
    public String attack() {
        return "By sky and earth I will defend my land !!!";
    }

    @Override
    public int heal() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public String usingSpell() {
        return null;
    }
}
