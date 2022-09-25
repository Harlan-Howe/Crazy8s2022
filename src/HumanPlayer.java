import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer
{

    private CardPile myCards;
    private String name;
    private Scanner keyboard;

    /**
     * Set up the scanner, ask the player for their name and make an empty cardpile.
     */
    public HumanPlayer()
    {
        keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        myCards = new CardPile();
    }

    /**
     * add the given card to the player's hand.
     * @param c - the card to add.
     */
    public void takeCard(Card c)
    {
        // -----------------------------------------
        // TODO: You write this!


        // -----------------------------------------
    }

    /**
     * gives the card at the top of the pile, removing it from the player's hand.
     * @return the card at the top of the player's pile, or null if there is no card.
     */
    public Card getFirstCard()
    {
        // -----------------------------------------
        // TODO: You write this!


        // -----------------------------------------
        return null; // temp code
    }

    /**
     * count the number of cards in the player's hand.
     * @return - the number of cards in the hand.
     */
    public int getNumCards()
    {
        // -----------------------------------------
        // TODO: You write this!


        // -----------------------------------------
        return 9999; // temp code.
    }


    public String getName()
    {
        return name;
    }

    /**
     * prints a list of the cards in the player's hand, with a number before each one.
     */
    public void showNumberedListOfCards()
    {
        int counter = 1;
        CardPile tempPile = new CardPile();
        System.out.println("\t+---------------+ "+name+"'s cards:");
        while (myCards.hasCard())
        {
            Card currentCard = myCards.dealCard();
            System.out.println(counter+"\t|"+currentCard+"\t|");
            tempPile.addCard(currentCard);
            counter++;
        }
        myCards.takeAllCardsFromPile(tempPile);
        System.out.println("\t+---------------+");
    }

    /**
     * Displays a numbered list of cards and asks the user for one of them (by number) or zero if the player wants
     * to draw.
     * postcondition:  if a card is returned, that card (only) will be removed from the player's hand; or no change,
     * if null is returned.
     * @return the card at the location of the user's selection, or null if the user's answer isn't one of the ones
     * offered.
     */
    public Card askForCard()
    {
        showNumberedListOfCards();
        int choice = getChoiceNumber();
        // "choice" is now the number on the list that the user requested, or a number outside of the range of the list.

        // -----------------------------------------
        // TODO: You write the rest of this!
        //     if the number is in range, remove the corresponding card from myCards and return it.
        //     otherwise, return null.


        // -----------------------------------------
        return null; // temp code.
    }

    /**
     * requests an integer from the user and keeps asking until it gets one.
     * @return the integer selected by the user.
     */
    public int getChoiceNumber()
    {
        // I've written this for you.
        int choice = 0;
        while(true)
        {
            System.out.println("Which number card do you want to play, or 0 to draw?");
            try // we're about to try something that might not work.
            {
                choice = keyboard.nextInt();
                break;
            }
            catch (InputMismatchException imExp) // we jump to here if the user's input isn't an integer.
            {
                System.out.println("That was not a numerical answer.");
                keyboard.nextLine(); // clears any extra spaces and the carriage return so we are ready to receive
                // another number.
            }
        }
        return choice;
    }


    /**
     * Shows a numbered list of suits and asks the user to pick a suit. If the user's answer is not acceptable, then
     * return the default value.
     * @param defaultValue - the value to return if the user gives a bad answer.
     * @return one of {"Hearts","Diamonds","Spades", or "Clubs"} (Spelling/capitalization matters.)
     */
    public String askForSuit(String defaultValue)
    {
        String result = defaultValue;
        // -----------------------------------------
        // TODO: You write this!


        // -----------------------------------------
        return result;
    }

}
