package com.settlers.demotesty.Fundimentals;

import java.util.ArrayList;
import java.util.List;

/**
 * This class deals with the trading aspect of the game
 * A player requests resource cards from other players in return for
 * some of his/her resource cards
 * The other players can accept or reject the offer
 * If the offer is accepted, the resource cards are swapped
 *
 * @author Sean
 * @version 1.0 13.04.2023
 */
public class Trade {
    private Player currentPlayer; // current player is the one making the trade
    private List<Player> accepting;
    private List<Card> requestedCards;
    private List<Card> offeredCards;

    /**
     * Construct a trade between players
     * @param offering - player making the offer
     * @param accepting - player accepting the offer
     * @param requested - cards requested by the player
     * @param offered - cards offer by the player
     */
    public Trade(Player offering, ArrayList<Player> accepting, List<Card> requested, List<Card> offered) {
        this.currentPlayer = offering;
        this.accepting = accepting;
        this.requestedCards = requested;
        this.offeredCards = offered;
    }

    /**
     * If more than one player accepts, select player who accepted first
     * Then, transfer cards if Trade offer has been accepted
     */
    public void tradeCards() {
        // if at least one player accepted
        if (accepting.size() > 0) {
            // take resource cards from accepted player
            for (Card request : requestedCards) {
                accepting.get(0).getResourceCard(request.toString());
            }
            // player making offer receives cards from other player
            for (Card card : requestedCards) {
                currentPlayer.addResourceCard(card);
            }
            // player accepting offer receives cards from other player
            for (Card card : offeredCards) {
                accepting.get(0).addResourceCard(card);
            }
        }
    }
}
