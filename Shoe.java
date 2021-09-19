import java.util.ArrayList;

public class Shoe
{

    public ArrayList<BJCard> shoe = new ArrayList<BJCard>();
    public int size;
    public int totalCards;

    public Shoe (int decks)
    {
        size = decks;
        totalCards = decks * 52;

        for(int i = 0; i < decks; i++)
        {
            
            BJDeck tempdeck = new BJDeck();
            

            

            for(int x = 0; x < 52; x++)
            {
                shoe.add(tempdeck.Deck.remove(0));
            }

            
        
        }

    }

    public void Shuffle()
    {
        ArrayList<BJCard> tempShoe = new ArrayList<BJCard>();
        while(shoe.size() > 0)
        {
            tempShoe.add(shoe.remove(getRandomNumber(0, shoe.size()-1)));
        }
        shoe = tempShoe;
    }

    public int getRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

}