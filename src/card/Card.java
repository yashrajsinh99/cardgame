/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author Yashrajsinh

 */
public class Card {

    public enum Colours {
         GREEN, YELLOW, BLUE, RED,
    }; 

    public enum Value {
          SKIP,REVERSE, DRANTWO, DRAMFOUR, WILDCARDY ,ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
    }; 

    private final Colours colours;
    private final Value value;

    public Card(Colours col, Value val)
    {
        colours = col;

        value = val;

    }

    public Value getValue()
    {
        return this.value;
    }

    public Colours getColours() {

        return this.colours;
    }

}
