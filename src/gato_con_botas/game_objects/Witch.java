package gato_con_botas.game_objects;

import gato_con_botas.player.Player;

public class Witch implements GameObject {
    @Override
    public String interact(Player player) {
        int damage = (int)(Math.random() * 10) + 5;
        player.takeDamage(damage);
        return "La Bruja Malvada lanza un hechizo. ¡Pierdes " + damage + " puntos de salud!";
    }

    @Override
    public String getName() {
        return "Bruja Malvada";
    }
}