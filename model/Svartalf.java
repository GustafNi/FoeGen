
package model;

import logic.DiceRoller;


public class Svartalf {
    private int styrka;
    private int storlek;
    private int fysik;
    private int smidighet;
    private int intelligens;
    private int psyke;
    private int karisma;
    public DiceRoller dr = new DiceRoller();
    
    public Svartalf() {
        styrka = dr.diceT6(2) + 2;
        storlek = dr.diceT4(2) + 2;
        fysik = dr.diceT6(3);
        smidighet = dr.diceT6(3);
        intelligens = dr.diceT6(2) + 2;
        psyke = dr.diceT6(3);
        karisma = dr.diceT6(2);
    }

    @Override
    public String toString() {
        String print = "Svartalf" + "\n"
                + "styrka= " + styrka + "\n"
                + "storlek= " + storlek + "\n"
                + "fysik= " + fysik + "\n"
                + "smidighet= " + smidighet + "\n"
                + "intelligens= " + intelligens +  "\n"      
                + "psyke= " + psyke + "\n"
                + "karisma= " + karisma;
        return print;
    }
    
}
