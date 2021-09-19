import java.util.ArrayList;

public class BJDeck
{
    BJCard card;
    
    public ArrayList <BJCard> Deck;

    public BJDeck ()
    {
        Deck = new ArrayList<BJCard>();

        for (Suit s: Suit.values()){
            for (Face f: Face.values()){
                Deck.add(new BJCard(s, f));
            }
        }
    }

    public void Shuffle()
    {
        ArrayList <BJCard> tempDeck = new ArrayList<BJCard>();
        while(Deck.size() > 0)
        {
            tempDeck.add(Deck.remove(getRandomNumber(0, Deck.size()-1)));
        }
        Deck = tempDeck; 
    }

    public int getRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
