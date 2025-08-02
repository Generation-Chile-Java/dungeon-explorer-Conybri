package gato_con_botas.game_objects;

import gato_con_botas.player.Player;

public interface GameObject {
    String interact(Player player);
    String getName();
}