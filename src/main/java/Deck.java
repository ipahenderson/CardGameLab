import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;


    public Deck(){
        this.cards = new ArrayList<>();
    }


    public int deckSize(){
        return this.cards.size();
    }

    public void populateDeck(){
        int i = 0;
        for(SuitType suit : SuitType.values()){
            for(ValueType value : ValueType.values()){
                cards.add(new Card(suit, value));
                i++;
            }

        }
    }








}
