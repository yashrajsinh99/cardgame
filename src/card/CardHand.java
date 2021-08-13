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
public class CardHand {
    private int handSize=100;
    public Card[] cards= new Card[handSize];
    
    public void CardGenerate()
    {
        int count=0;
        for(Card.Colours col:Card.Colours.values())
        {
            for(Card.Value val: Card.Value.values())
            {
                cards[count]= (new Card(col,val));
                count++;
            }
        }
    }
    
}
