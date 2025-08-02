package gato_con_botas.dungeon;

import gato_con_botas.player.Player;

public class EmptyRoom extends BaseRoom {
    public EmptyRoom() {
        this.description = "Una habitación vacía con paredes de piedra. Solo escuchas el sonido de tus pasos.";
    }

    @Override
    public void enter(Player player) {
        System.out.println("\nEntras en " + getDescription());
        player.incrementRoomsExplored();
    }
}