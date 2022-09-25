public class Referee
{

    private CardPile stock;
    private Card topCard;
    private HumanPlayer human;
    private ComputerPlayer computer;
    private boolean itsHumansTurn;

    public Referee()
    {
        stock = CardPile.makeDeck(CardPile.ACE_LOW);
        human = new HumanPlayer();
        computer = new ComputerPlayer();
    }

    /**
     * deal 5 cards to each of the two players.
     */
    public void initialDealCardsToPlayers()
    {
        // -----------------------------------------
        // TODO: You write this!


        // -----------------------------------------
    }

    /**
     * Run the main loop
     */
    public void runGame()
    {
        initialDealCardsToPlayers();
        topCard = stock.dealCard();

        itsHumansTurn = Math.random()>0.5;
        if (itsHumansTurn)
            System.out.println("Human won the coin toss and goes first.");
        else
            System.out.println("Human lost the coin toss and goes second.");

        while(gameIsStillPlaying())
        {
            if (itsHumansTurn)
            {
                manageHumansTurn();

            }
            else
            {
                manageComputersTurn();
            }
            itsHumansTurn = !itsHumansTurn;
        }
        System.out.println("Game Over.");
    }

    /**
     * Tells the human it's his or her turn, tells the human what card must be matched, and asks human to pick a card.
     *
     * If the selection comes back null, draws a card (if possible), otherwise, check whether this is a legal move.
     *
     * If so, play the card: set "topCard" to the selected card. If playing an eight, ask the player for a suit and make
     * the top card be a new 8 Card of that suit. (This is something you can't do in real life.)
     *
     * If the card played was the player's last, congratulate him or her.
     *
     * Repeat until either the player has played a card OR the player can't play a card and the stock is empty.
     */
    public void manageHumansTurn()
    {
        // -----------------------------------------
        // TODO: You write this!
        System.out.println("Managing Human's turn. (not yet written.)"); // remove this when it is no longer accurate.

        // -----------------------------------------
    }

    /**
     * Tells the human that it is the computer's turn.
     * Gets a random, legal card from the computer:
     *      •Creates a temp pile
     *      •Gets a random card from the computer - if its legal, keeps track of this card. Otherwise, add to temp pile.
     *      •Keeps drawing until it runs out of cards or finds a legal card.
     *      •Gives all the cards in temp pile back to the computer.
     * If it found a legal move, plays it (i.e., sets "topCard" to the selected card and tells player that card was
     *    played). Consoles player if it was the last one.
     * Otherwise, draws a card - if its legal, plays it (i.e., sets "topCard" to the selected card and tells player
     *    that card was played.)
     *      •Otherwise adds card to the computer's pile and repeats drawing until it either finds a legal card or
     *          the stock runs out.
     */
    public void manageComputersTurn()
    {
        // -----------------------------------------
        // TODO: You write this!
        System.out.println("Managing Computer's turn. (not yet written.)"); // remove this when it's no longer accurate.

        // -----------------------------------------
    }

    /**
     * determines whether the proposed card is allowed to go onto the top card.
     * @param cardToPlay - the card we are considering playing
     * @return - whether this card is allowed on that card.
     */
    public boolean isLegalPlay(Card cardToPlay)
    {
        // -----------------------------------------
        // TODO: You write this!


        // -----------------------------------------
        return false; // temp code.
    }


    /**
     * Checks whether any of the cards in the human's pile would be a legal move on topCard.
     * @return true if there is a possible play, false otherwise.
     * Postcondition: the human player has the same cards as before, in the same order.
     */
    public boolean humanPlayerHasMove()
    {
        // -----------------------------------------
        // TODO: You write this!
        // hint: as with some other methods we've seen, make a temporary pile, and transfer each card to that pile as
        //       you check them. Then, when done, transfer them all back to the player.

        // -----------------------------------------
        return false; // temp code.
    }

    /**
     * determines whether the game should continue playing.
     * @return whether both players still have cards to play.
     */
    public boolean gameIsStillPlaying()
    {
        //------------------------------------------
        // TODO: You write this!

        return true; // temp code.
        // -----------------------------------------
    }

}
