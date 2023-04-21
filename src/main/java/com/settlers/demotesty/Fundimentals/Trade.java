//package com.settlers.demotesty.Fundimentals;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * This class deals with the trading aspect of the game
// * A player requests resource cards from other players in return for
// * some of his/her resource cards
// * The other players can accept or reject the offer
// * If the offer is accepted, the resource cards are swapped
// *
// * @author Sean
// * @version 1.0 13.04.2023
// */
//public class Trade {
//    private int currentPlayer; // current player is the one making the trade
//    private List<Player> players;
//    private List<Card> requestedCards;
//    private List<Card> offeredCards;
//    private List<Player> acceptedPlayers;
//    private int complete;
//
//    /**
//     * Construct a trade between players
//     * @param currentPlayerIndex - player making the offer
//     * @param players - players
//     * @param requested - cards requested by the player
//     * @param offered - cards offer by the player
//     */
//    public Trade(int currentPlayerIndex, ArrayList<Player> players, List<Card> requested, List<Card> offered) {
//        this.currentPlayer = currentPlayerIndex;
//        this.players = players;
//        this.requestedCards = requested;
//        this.offeredCards = offered;
//        this.acceptedPlayers = new ArrayList<>();
//    }
//
//    /**
//     * Method to add players who accept the trade to a list
//     * @param accepted - player who accepted the trade
//     */
//    public void accept(Player accepted) {
//        acceptedPlayers.add(accepted);
//        complete++;
//    }
//
//    /**
//     * If more than one player accepts, select player who accepted first
//     * Then, transfer cards if Trade offer has been accepted
//     */
//    public void tradeCards() {
//        // if at least one player accepted
//        if (acceptedPlayers.size() > 0) {
//            // player making offer receives cards from other player
//            for (Card card : requestedCards) {
//                players.get(currentPlayer).addResCard(card);
//            }
//            // player accepting offer receives cards from other player
//            for (Card card : offeredCards) {
//                acceptedPlayers.get(0).addResCard(card);
//            }
//        }
//    }
//
//    /**
//     * If player rejects offer increment complete counter,
//     * - for checking if all players have made a decision
//     */
//    public void reject() {
//        complete++;
//        //TODO update for GUI
//        System.out.println("Offer rejected.");
//    }
//
//}
