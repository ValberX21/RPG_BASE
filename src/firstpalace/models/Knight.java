package firstpalace.models;

import firstpalace.enums.CharacterClasses;
import firstpalace.interfaces.CharacterActions;

public class Knight extends baseCharacter implements CharacterActions {

    public int _knightRank;

    public Knight(String race, String name, String origem, CharacterClasses charClass,int attack, int knightRank) {
        super(race, name, origem, charClass,attack);
        this._knightRank = knightRank;
    }

    @Override
    public String attack() {
        return "Taking my sword, COME !, FACE ME";
    }

    @Override
    public int heal() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
