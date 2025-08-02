package gato_con_botas.dungeon;

import gato_con_botas.game_objects.GameObject;
import gato_con_botas.player.Player;

public class EnemyRoom extends BaseRoom {
    private GameObject enemy;

    public EnemyRoom(GameObject enemy) {
        this.enemy = enemy;
        this.description = "Una habitación oscura con un aura amenazante...";
    }

    @Override
    public void enter(Player player) {
        System.out.println("\nEntras en " + getDescription());
        System.out.println("¡Oh no! " + enemy.getName() + " aparece!");
        System.out.println(enemy.interact(player));
        player.incrementRoomsExplored();
    }
}