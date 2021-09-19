public class main {
    
    public static void main(String[] args)
    {
        
        Shoe shoe = new Shoe(6);
        
        System.out.println(shoe.size + ", " + shoe.totalCards);
        shoe.Shuffle();

        for (int i = 0; i < shoe.totalCards ; i++)
        {
            BJCard card = shoe.shoe.remove(0);
            System.out.println(card.face + ", " + card.suit);

        }

    }


}
