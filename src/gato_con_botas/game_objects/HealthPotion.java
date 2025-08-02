package gato_con_botas.game_objects;

import gato_con_botas.player.Player;

public class HealthPotion implements GameObject {
    @Override
    public String interact(Player player) {
        player.heal(20);
        return "El Gato con Botas bebe la poción. ¡+20 puntos de salud!";
    }

    @Override
    public String getName() {
        return "Poción Mágica de Salud";
    }
}