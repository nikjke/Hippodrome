import java.util.Random;

/**
 * Created by nikjke on 04.10.2016.
 */
public class Betting {
    static int betOnRandomHorse;
    static int randomBet;

     static void doBetOnRandomHorseRandomBet() {
        Random random = new Random();
        betOnRandomHorse = random.nextInt(3);
        randomBet = random.nextInt(100) + 1;

        if (betOnRandomHorse == 0) {
            System.out.println("Я ставлю на " +  + " " + randomBet + " рублей");
        }
        if (betOnRandomHorse == 1) {
            System.out.println("Я ставлю на "  + Game.horse1 + " " + randomBet + " рублей");
        }
        if (betOnRandomHorse == 2) {
            System.out.println("Я ставлю на "  + Game.horse2 + " " + randomBet  + " рублей");
        }
    }
}
