package com.settlers.demotesty.Controllers;

import com.settlers.demotesty.Fundimentals.*;
import com.settlers.demotesty.Fundimentals.Trade;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Controller for the Trade class and GUI
 */
public class TradeController {
    @FXML
    private VBox one, two;
    @FXML
    private ImageView b1, b2, o1, o2, w1, w2, l1, l2, g1, g2;
    @FXML
    private Label numBrick, numOre, numWool, numLumber, numGrain;
    @FXML
    private ImageView offer1, offer2, offer3, request1, request2, request3;
    @FXML
    private ImageView offer1b, offer2b, offer3b, request1b, request2b, request3b;
    @FXML
    private Label offerMessage, requestMessage;
    @FXML
    private Label p1, p2, p3;
    @FXML
    private Label p1info, p2info, p3info;
    @FXML
    private Button playerOneAcceptButton, playerTwoAcceptButton, playerThreeAcceptButton;
    @FXML
    private Button playerOneRejectButton, playerTwoRejectButton, playerThreeRejectButton;

    // store requested/offered cards
    private ArrayList<Card> requestCards = new ArrayList<>();
    private ArrayList<Card> offerCards = new ArrayList<>();

    // store players
    Player current, player1, player2, player3;
    // players who accept the trade
    private ArrayList<Player> accepted;
    private ArrayList<Player> rejected;
    // number of resources for current player
    int brickCount, grainCount, oreCount, woolCount, lumberCount;

    @FXML
    /**
     * Initialize GUI
     */
    private void initialize() {
        System.out.println("Initializing...");
        one.setVisible(true);
        two.setVisible(false);
        // set labels for number of resources
        setLabels();
        // set player labels on GUI
        setPlayers();
        // set up handlers for offer cards
        b1.setOnMouseClicked(mouseEvent -> addOffer(b1));
        o1.setOnMouseClicked(mouseEvent -> addOffer(o1));
        l1.setOnMouseClicked(mouseEvent -> addOffer(l1));
        w1.setOnMouseClicked(mouseEvent -> addOffer(w1));
        g1.setOnMouseClicked(mouseEvent -> addOffer(g1));
        // set up handlers for requests cards
        b2.setOnMouseClicked(mouseEvent -> addRequest(b2));
        o2.setOnMouseClicked(mouseEvent -> addRequest(o2));
        l2.setOnMouseClicked(mouseEvent -> addRequest(l2));
        w2.setOnMouseClicked(mouseEvent -> addRequest(w2));
        g2.setOnMouseClicked(mouseEvent -> addRequest(g2));
        // set handlers for accept buttons
        playerOneAcceptButton.setOnMouseClicked(mouseEvent -> p1info.setText(accept(player1)));
        playerTwoAcceptButton.setOnMouseClicked(mouseEvent -> p2info.setText(accept(player2)));
        playerThreeAcceptButton.setOnMouseClicked(mouseEvent -> p3info.setText(accept(player3)));
        // set handlers for reject buttons
        playerOneRejectButton.setOnMouseClicked(mouseEvent -> reject(player1));
        playerTwoRejectButton.setOnMouseClicked(mouseEvent -> reject(player2));
        playerThreeRejectButton.setOnMouseClicked(mouseEvent -> reject(player3));
    }

    /**
     * Constructor for a Trade Controller, adds players for trading with parameters
     * @param players
     * @param currentPlayer
     */
    public TradeController(ArrayList<Player> players, int currentPlayer) {
        accepted = new ArrayList<>();
        rejected = new ArrayList<>();
        System.out.println("creating controller");
        // set up players for trade
        current = players.get(currentPlayer);
        for (Player player : players) {
            if (player != current) {
                if (player1 == null) {
                    player1 = player;
                } else if (player2 == null) {
                    player2 = player;
                } else if (player3 == null) {
                    player3 = player;
                }
            }
        }
    }


    /**
     * Method to process Accept button clicks
     * @param player
     * @return message
     */
    private String accept(Player player) {
        String message = "";
        if (player.getResourceCards().isEmpty()) {
            message = "     Not enough resources!";
            rejected.add(player); // automatically add player to rejected
            // every player has made a decision
        } else {
            // if the player has not already clicked "accept" and been added
            if (!accepted.contains(player)) {
                // get players resource cards
                ArrayList<Card> resources = player.getResourceCards();
                ArrayList<Card> tempList = new ArrayList<>();
                boolean allFound = false;
                // player has resource cards
                for (Card requestCard : requestCards) {
                    boolean found = false; // flag to check if card has been found
                    // get each of the requested cards from the player's resources
                    for (int i = 0; i < resources.size(); i++) {
                        // if requested card found in player's resource cards
                        if (requestCard.toString().equals(resources.get(i).toString())) {
                            // card found -> add card to temporary list by taking from players resources
                            tempList.add(resources.remove(i));
                            found = true;
                            break; // only need first card found
                        }
                    }
                    if (!found) {
                        break; // card not found, exit search
                    }
                }
                // all cards found
                if (requestCards.size() == tempList.size()) {
                    accepted.add(player);
                    message = "     Accepted for trading";
                } else {
                    message = "     You don't have all the resources!";
                    rejected.add(player);
                }
            }
        }
        if (rejected.size() + accepted.size() == 3) {
            finishTrade();
        }
        return message;
    }

    /**
     * Method to process Reject button clicks
     * @param player
     */
    private void reject(Player player) {
        if (!rejected.contains(player)) {
            rejected.add(player);
            if (accepted.size() + rejected.size() == 3) {
                finishTrade();
            }
        }
    }

    @FXML
    /**
     * Gets number of each type of resource card for the current player
     * Displays number beneath the card as Label
     */
    private void setLabels() {
        // initialize counts to 0
        brickCount = grainCount = oreCount = woolCount = lumberCount = 0;
        // get current player's resource cards
        ArrayList<Card> resourceCards = current.getResourceCards();
        // get number of each type of resource card and add to GUI label
        for (Card card : resourceCards) {
            // loop through each card, increment counts for cards if type found
            switch (card.toString()) {
                case "brick":
                    brickCount++;
                    break;
                case "grain":
                    grainCount++;
                    break;
                case "ore":
                    oreCount++;
                    break;
                case "lumber":
                    lumberCount++;
                    break;
                case "wool":
                    woolCount++;
                    break;
            }
        }
        // set labels in GUI
        this.numBrick.setText(String.valueOf(brickCount));
        this.numGrain.setText(String.valueOf(grainCount));
        this.numLumber.setText(String.valueOf(lumberCount));
        this.numOre.setText(String.valueOf(oreCount));
        this.numWool.setText(String.valueOf(woolCount));
    }

    @FXML
    /**
     * Adds card to offers, updates GUI
     * If the resource card is not available, sets message in GUI
     */
    private void addOffer(ImageView card) {
        // get card type from the ImageView
        String type = getCard(card);
        // if player has the chosen card
        if (hasCard(type)) {
            // if less than 3 cards chosen
            if (offerCards.size() < 3) {
                if (offer1.getImage() == null) {
                    offer1.setImage(card.getImage());
                    offer1b.setImage(card.getImage());
                    //take resource card from player
                    getOfferCard(type);
                } else if (offer2.getImage() == null) {
                    offer2.setImage(card.getImage());
                    offer2b.setImage(card.getImage());
                    getOfferCard(type);
                } else if (offer3.getImage() == null) {
                    offer3.setImage(card.getImage());
                    offer3b.setImage(card.getImage());
                    getOfferCard(type);
                }
            } else {
                offerMessage.setText("Only three cards are allowed!");
            }
        } else {
            offerMessage.setText("You don't have any " + type + " cards!");
        }
    }

    /**
     * Method to take card from player's resource cards and add to offer cards
     * @param type Card to take from player
     */
    private void getOfferCard(String type) {
        Card card;
        if ((card = current.getResourceCard(type)) != null) {
            offerCards.add(card);
            setLabels(); // update labels
        }
    }

    /**
     * Method to take cards from player accepting the trade
     */
    private void getRequestCard(Player acceptingPlayer, String type) {
        Card card;
        if ((card = acceptingPlayer.getResourceCard(type)) != null) {
            requestCards.add(card);
        }
    }
    /**
     * Returns boolean indicating whether the player has a resource card of the given type
     * @param type - type of resource card
     * @return hasCard
     */
    private boolean hasCard(String type) {
        boolean hasCard = false;
        int count = switch (type) {
            case "brick" -> brickCount;
            case "grain" -> grainCount;
            case "ore" -> oreCount;
            case "lumber" -> lumberCount;
            case "wool" -> woolCount;
            default -> 0;
        };
        if (count > 0) {
            hasCard = true;
        }
        return hasCard;
    }

    /**
     * Assigns players to labels in GUI
     */
    @FXML
    private void setPlayers() {
        // set players labels
        p1.setText("PLAYER: " + player1.getPlayerName());
        p2.setText("PLAYER: " + player2.getPlayerName());
        p3.setText("PLAYER: " + player3.getPlayerName());
    }

    /**
     * Adds requested card to requestCards
     * @param card the image clicked on
     */
    @FXML
    private void addRequest(ImageView card) {
        String type = getCard(card);
        if (requestCards.size() < 3) {
            if (request1.getImage() == null) {
                request1.setImage(card.getImage());
                request1b.setImage(card.getImage());
                requestCards.add(new Card(type));
            } else if (request2.getImage() == null) {
                request2.setImage(card.getImage());
                request2b.setImage(card.getImage());
                requestCards.add(new Card(type));
            } else if (request3.getImage() == null) {
                request3.setImage(card.getImage());
                request3b.setImage(card.getImage());
                requestCards.add(new Card(type));
            }
        } else {
            requestMessage.setText("Only three cards are allowed!");
        }
    }

    /**
     * Get card type from imageview id
     * @param card - ImageView to get type from
     * @return type - card type
     */
    private String getCard(ImageView card) {
        char c = card.getId().charAt(0);
        String type = null;
        switch (c) {
            case 'b':
                type = "brick";
                break;
            case 'l':
                type = "lumber";
                break;
            case 'o':
                type = "ore";
                break;
            case 'w':
                type = "wool";
                break;
            case 'g':
                type = "grain";
                break;
        }
        return type;
    }

    /**
     * Continues to Trade screen
     */
    @FXML
    private void onTradeButtonClick() {
        one.setVisible(false);
        two.setVisible(true);
    }

    /**
     * Resets GUI
     */
    @FXML
    private void onResetButtonClick() {
        offer1.setImage(null);
        offer2.setImage(null);
        offer3.setImage(null);
        offer1b.setImage(null);
        offer2b.setImage(null);
        offer3b.setImage(null);
        request1.setImage(null);
        request2.setImage(null);
        request3.setImage(null);
        request1b.setImage(null);
        request2b.setImage(null);
        request3b.setImage(null);
        requestCards.clear();
        offerMessage.setText("");
        requestMessage.setText("");
        // return cards to player
        for (Card offer : offerCards) {
            current.addResourceCard(offer);
        }
        offerCards.clear();
        setLabels();
    }

    /**
     * Method to transfer the current player's and the accepted player's resource cards
     */
    private void finishTrade() {
        System.out.println("finalizing trade...");
        Trade trade = new Trade(current, accepted, requestCards, offerCards);
        Stage stage = (Stage) one.getScene().getWindow();
        trade.tradeCards();
        stage.close();
    }
}
