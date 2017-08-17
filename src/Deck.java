import javax.swing.*;
import java.util.ArrayList;

public class Deck {

	ArrayList<String> deck = new ArrayList<String>();
	ArrayList<String> shufflecDeck = new ArrayList<String>();

	ArrayList<String> value = new ArrayList<String>();
	ArrayList<String> suit = new ArrayList<String>();

	ArrayList<ImageIcon> imageDeck = new ArrayList<ImageIcon>();

	public void setDeck()
		{
			value.add("a");
			value.add("j");
			value.add("k");
			value.add("q");
			value.add("t");
			for (int i = 2; i <= 9; i++) {
				value.add(i + "");
			}

			suit.add("c");
			suit.add("d");
			suit.add("h");
			suit.add("s");

			for (int a = 0; a < suit.size(); a++) {
				for (int b = 0; b < value.size(); b++) {
					deck.add(value.get(b) + suit.get(a));
				}
			}

		}

	public void setShufflecDeck()
	{
		for (int i = 0; i < deck.size(); i++) {
			int index = (int) (Math.random() * deck.size());
			shufflecDeck.add(deck.remove(index));
			i--;
		}
	}

	public void setImageDeck()
	{
		for (int s = 0; s < shufflecDeck.size(); s++) {
			imageDeck.add(new ImageIcon(shufflecDeck.get(s) + ".gif"));
		}
	}

}
