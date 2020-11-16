package models.Fields;
import

public class ActionCard {

        private String name;
        private String description;
        private String move;
        private String freeProperty;
        boolean moveToStart;
        private int Value;
        private int cardToDiffPlayer;
        boolean extraAC;
        boolean jailFree;
        boolean buyProperty;

        public ActionCard(String name, String description, String move, String freeProperty, boolean moveToStart, int value, int cardToDiffPlayer, boolean extraAC, boolean jailFree, boolean buyProperty) {
            this.name = name;
            this.description = description;
            this.move = move;
            this.freeProperty = freeProperty;
            this.moveToStart = moveToStart;
            this.Value = value;
            this.cardToDiffPlayer = cardToDiffPlayer;
            this.extraAC = extraAC;
            this.jailFree = jailFree;
            this.buyProperty = buyProperty;
        }

        ActionCard[] actionCard = new ActionCard[23]; {
            actionCard[0] = new ActionCard("Chance", "Giv dette kort til Bilen og tag et chancekort mere. Bil på din næste tur skal du drøne frem til at hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller", 0, null,true,0 , 1, false, false, true);
            actionCard[1] = new ActionCard("Chance","Ryk frem til START. Modtag M2", "0", null, true,2, 0, false, false, false );
            actionCard[2] = new ActionCard("Chance", "Ryk op til 5 felter frem","5", null,false,0,0,false, false,false );
            actionCard[4] = new ActionCard("Chance, Gratis felt", "Ryk frem til et orange felt", "orange", "orange", false,0, 0, false, false, false );
            actionCard[5] = new ActionCard("Chance", "Ryk 1 felt frem eller tag et chacne kort mere", "1",null, false,0, 0, true, false, false);
            actionCard[6] = new ActionCard("Chance", "Giv dette kort til skibet, og tag et chance kort mere. Skibet på din næste tur skal du sejle til et hvilket som helst ledigt felt og købe det, hvis der ikke er nogle ledige falter skal du købe et fra en anden spiller", "FirstFreeField", null, false,0, 4, false,false, true);
            actionCard[7] = new ActionCard("Chance", "Du har spist for meget slik, BETAL M2 til banken", null,null, false, -2, 0, false,false, false  );
            actionCard[8] = new ActionCard("Chance, Gratis felt", "Ryk frem til et orange elelr grønt felt. Hvis det er ledigt får du det gratis ellers skal du Betale leje til ejeren", "orange/Green","orange/green",false, 0, 0, false, false, false  );
            actionCard [9] = new ActionCard("Chance, Gratis felt", "Ryk frem til det lyseblå falt. Hvis det er ledigt får du det gratis ellers skal du betale leje til ejeren", "Lightblue", "Lightblue", false, 0, 0, false, false, false );

        }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setPlayerPosition (String move) {
       if (move != null) {
           player.position += move;

    }

    public String getPlayerPosition(String move) {
           return player.postion;

    }

    public String getFreeProperty() {
           if (getFreeProperty )
        }
        return freeProperty;
    }


    public boolean isMoveToStart() {
        return moveToStart;
    }

    public void setMoveToStart(boolean moveToStart) {
        this.moveToStart = moveToStart;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getCardToDiffPlayer() {
        return cardToDiffPlayer;
    }

    public void setCardToDiffPlayer(int cardToDiffPlayer) {
        this.cardToDiffPlayer = cardToDiffPlayer;
    }

    public boolean isExtraAC() {
        return extraAC;
    }

    public void setExtraAC(boolean extraAC) {
        this.extraAC = extraAC;
    }

    public boolean isJailFree() {
        return jailFree;
    }

    public void setJailFree(boolean jailFree) {
        this.jailFree = jailFree;
    }

    public boolean isBuyProperty() {
        return buyProperty;
    }

    public void setBuyProperty(boolean buyProperty) {
        this.buyProperty = buyProperty;
    }

    public ActionCard[] getActionCard() {
        return actionCard;
    }

    public void setActionCard(ActionCard[] actionCard) {
        this.actionCard = actionCard;
    }
}

