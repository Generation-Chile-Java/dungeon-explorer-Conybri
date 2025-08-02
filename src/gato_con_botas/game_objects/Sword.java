package gato_con_botas.game_objects;

import gato_con_botas.player.Player;

public class Sword implements GameObject {
    @Override
    public String interact(Player player) {
        return "El Gato con Botas empuña la espada con elegancia. ¡Ahora está más preparado para el combate!";
    }

    @Override
    public String getName() {
        return "Espada del Caballero Valiente";
    }
}