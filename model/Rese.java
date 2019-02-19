
package model;

import logic.DiceRoller;


public class Rese {
    private int styrka;
    private int storlek;
    private int fysik;
    private int smidighet;
    private int intelligens;
    private int psyke;
    private int karisma;
    public DiceRoller dr = new DiceRoller();
    
    public Rese() {
        styrka = dr.diceT6(3) + 24;
        storlek = dr.diceT6(3) + 12;
        fysik = dr.diceT6(2) + 6;
        smidighet = dr.diceT6(2) + 3;
        intelligens = dr.diceT6(2);
        psyke = dr.diceT6(3);
        karisma = dr.diceT4(2);
    }

    @Override
    public String toString() {
        String print = "Rese" + "\n"
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
