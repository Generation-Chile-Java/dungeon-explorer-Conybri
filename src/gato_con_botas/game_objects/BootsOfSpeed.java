package gato_con_botas.game_objects;

import gato_con_botas.player.Player;

public class BootsOfSpeed implements GameObject {
    @Override
    public String interact(Player player) {
        return "El Gato con Botas se ajusta sus nuevas botas. ¡Ahora puede moverse más rápido!";
    }

    @Override
    public String getName() {
        return "Botas de Velocidad Legendarias";
    }
}