
package logic;

import java.util.Random;


public class DiceRoller {

    public int diceT6(int number) {
        Random random = new Random();
        int finResult = 0;
        for(int i = 1; i <= number; i++) {
            int result = random.nextInt(6) + 1;
            finResult = finResult + result;
        }
        return finResult;
    } 
    
    public int diceT4(int number) {
        Random random = new Random();
        int finResult = 0;
        for (int i = 1; i <= number; i++) {
            int result = random.nextInt(4) + 1;
            finResult = finResult + result; 
        }
        return finResult;
    }
}
