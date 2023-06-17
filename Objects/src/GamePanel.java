public class GamePanel {

    GameMode gm;

    GamePanel(GameMode gameMode){ //das durch Main erstellte Objekt von GameMode wurde hier als Parameter durchgegeben und auf gm initialisiert.
        gm = gameMode;
        System.out.println(this.gm.getGamemode());
    }
}
