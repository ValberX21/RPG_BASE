package firstpalace.models;

import firstpalace.enums.CharacterClasses;

public abstract class baseCharacter {

    private String race;
    private String name;
    private String origem;
    private CharacterClasses charClass;
    private int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public baseCharacter(String race, String name, String origem, CharacterClasses charClass, int attack) {
        this.race = race;
        this.name = name;
        this.origem = origem;
        this.charClass = charClass;
        this.attack =  attack;

    }

    public abstract String attack();


}
