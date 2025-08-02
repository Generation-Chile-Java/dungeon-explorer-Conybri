package gato_con_botas.dungeon;

import gato_con_botas.player.Player;

public interface Room {
    void enter(Player player);
    String getDescription();
}
