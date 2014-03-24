package designpatters.java.flyweight;

/**
 * The flyweight pattern applies to a program using a huge number of objects
 * that have part of their internal state in common where the other part of
 * state can vary. The pattern is used when the larger part of the objects state
 * can be made extrinsic (external to that object).
 * 
 * Example - The war game.
 * 
 * The war game instantiates 5 Soldier clients, each client maintains its
 * internal state which is extrinsic to the soldier flyweight. And Although 5
 * clients have been instantiated only one flyweight Soldier has been used.
 * 
 * Text Editors
 * 
 * Object oriented text editors need to create Character Objects to represent
 * each character that is in the document. A Character object maintains
 * information about what is the character, what is its font, what is the size
 * of the character, as well as character location inside the document. A
 * document typically consists of extremely large number of character objects
 * which requires large memory. Note that the number of characters in general
 * (Digits, Letters, Other special characters) is known and is fixed, and the
 * fonts that can be applied to each character are also known, thus by creating
 * a Letter flyweight that maintains Character Type (letter, digit, etc), as
 * well as font, and by creating a Letter Client object that only maintains each
 * characters location inside the document, we have reduced the editors memory
 * requirements drastically.
 * 
 * 
 * Consequences
 * 
 * Flyweight pattern saves memory by sharing flyweight objects among clients.
 * The amount of memory saved generally depends on the number of flyweight
 * categories saved (for example a soldier category and a lieutenant category as
 * discussed earlier).
 * 
 * @author pullalarevug
 * 
 */
public class Test {

    public static void main(final String[] args) {
        // start war

        // draw war terrain

        // create 5 soldiers:
        final SoldierClient warSoldiers[] = {new SoldierClient(), new SoldierClient(), new SoldierClient(),
                new SoldierClient(), new SoldierClient()};

        // move each soldier to his location
        // take user input to move each soldier
        warSoldiers[0].moveSoldier(17, 2112);

        // take user input to move each soldier
        warSoldiers[1].moveSoldier(137, 112);

        // note that there is only one SoldierImpl ( flyweight Imp)
        // for all the 5 soldiers
        // Soldier Client size is small due to the small state it maintains
        // SoliderImp size might be large or might be small
        // however we saved memory costs of creating 5 Soldier representations
    }
}
