package gato_con_botas.game_objects;

import gato_con_botas.player.Player;

public class Giant implements GameObject {
    @Override
    public String interact(Player player) {
        int damage = (int)(Math.random() * 15) + 10;
        player.takeDamage(damage);
        return "El Gigante gruñón te golpea con su garrote. ¡Pierdes " + damage + " puntos de salud!";
    }

    @Override
    public String getName() {
        return "Gigante Gruñón";
    }
}