package gato_con_botas.dungeon;

import gato_con_botas.game_objects.GameObject;
import gato_con_botas.player.Player;

public class TreasureRoom extends BaseRoom {
    private GameObject treasure;

        public TreasureRoom(GameObject treasure) {
            this.treasure = treasure;
            this.description = "Una habitación iluminada con un cofre dorado en el centro.";
        }

        @Override
        public void enter(Player player) {
            System.out.println("\nEntras en " + getDescription());
            System.out.println("¡Has encontrado " + treasure.getName() + "!");
            System.out.println(treasure.interact(player));
            player.addToInventory(treasure);
            player.incrementRoomsExplored();
        }
    }

