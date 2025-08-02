package gato_con_botas;

import gato_con_botas.dungeon.*;
import gato_con_botas.game_objects.*;
import gato_con_botas.player.Player;
import gato_con_botas.quiz.JavaQuiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la Mazmorra del Gato con Botas!");
        System.out.println("Para avanzar entre salas, deberás responder preguntas sobre Java.");
        System.out.print("Ingresa el nombre de tu gato aventurero: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, 100);
        List<Room> dungeon = createDungeon();

        System.out.println("\n¡" + playerName + " se aventura en la mazmorra con sus elegantes botas!");

        int currentRoom = 0;
        while (player.isAlive() && currentRoom < dungeon.size()) {
            System.out.println("\n=== Sala " + (currentRoom + 1) + " de " + dungeon.size() + " ===");

            // Pregunta para entrar a la sala
            boolean canEnter = JavaQuiz.askQuestion(scanner);

            if (canEnter) {
                Room room = dungeon.get(currentRoom);
                room.enter(player);
                player.showStatus();
                currentRoom++;
            } else {
                System.out.println("No puedes entrar a la sala hasta responder correctamente.");
                player.takeDamage(5);
                System.out.println("El Gato con Botas se lastima al intentar forzar la entrada. -5 HP!");

                if (!player.isAlive()) {
                    System.out.println("\n¡Oh no! " + player.getName() + " ha sido derrotado...");
                    break;
                }
            }

            if (player.isAlive() && currentRoom < dungeon.size()) {
                System.out.print("\n¿Continuar explorando? (s/n): ");
                String input = scanner.nextLine().toLowerCase();

                if (input.equals("n")) {
                    System.out.println("\nEl Gato con Botas decide retirarse con su botín...");
                    break;
                }
            }
        }

        if (player.isAlive() && currentRoom == dungeon.size()) {
            System.out.println("\n¡Felicidades! " + player.getName() + " ha explorado toda la mazmorra!");
        }

        System.out.println("=== Fin del juego ===");
        scanner.close();
    }

    private static List<Room> createDungeon() {
        List<Room> dungeon = new ArrayList<>();

        // Crear las salas de la mazmorra
        dungeon.add(new EmptyRoom());
        dungeon.add(new TreasureRoom(new Sword()));
        dungeon.add(new EnemyRoom(new Giant()));
        dungeon.add(new TreasureRoom(new HealthPotion()));
        dungeon.add(new EnemyRoom(new Witch()));
        dungeon.add(new TreasureRoom(new BootsOfSpeed()));
        dungeon.add(new EmptyRoom());

        return dungeon;
    }
}