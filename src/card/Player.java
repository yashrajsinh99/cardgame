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
public class Player {

    public static void main(String[] args) {
        CardHand cardh = new CardHand();
        cardh.CardGenerate();
        for (Card card : cardh.cards) {
            System.out.print(card.getValue() + "of" + card.getColours());
        }
    }

}
