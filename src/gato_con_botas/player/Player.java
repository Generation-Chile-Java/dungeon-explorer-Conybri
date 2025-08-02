package gato_con_botas.player;

import gato_con_botas.game_objects.GameObject;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<GameObject> inventory;
    private int roomsExplored;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
        this.roomsExplored = 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        health += amount;
    }

    public void addToInventory(GameObject item) {
        inventory.add(item);
    }

    public void showStatus() {
        System.out.println("\n=== Estado de " + name + " ===");
        System.out.println("Salud: " + health);
        System.out.println("Habitaciones exploradas: " + roomsExplored);
        System.out.println("Inventario (" + inventory.size() + "):");

        for (GameObject item : inventory) {
            System.out.println("- " + item.getName());
        }
    }

    public void incrementRoomsExplored() {
        roomsExplored++;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
