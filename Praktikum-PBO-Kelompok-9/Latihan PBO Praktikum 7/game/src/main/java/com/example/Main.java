package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== RPG Simulator ===");
        System.out.println("Game Start!");
        System.out.println("--------------------");
        System.out.print("Masukkan nama player:");
        String playerName = input.nextLine();

        System.out.print("Masukkan hp player: ");
        int playerHp = input.nextInt();

        System.out.print("Masukkan damage player: ");
        int playerDamage = input.nextInt();

        Player player = new Player(playerName, playerHp, playerDamage);
        Goblin goblin = new Goblin("Goblin Scout", 50, 10);

        int round = 1;
        while(player.isAlive() && goblin.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");
            System.out.println("Player [" + player.getName() + "] HP: " + player.getHp());
            System.out.println("Enemy [" + goblin.getName() + "] HP: " + goblin.getHp());
            System.out.println();
            
            // Player menyerang
            player.attack(goblin);
            
            // Goblin menyerang balik jika masih hidup
            if (goblin.isAlive()) {
                goblin.attack(player);
            } else {
                System.out.println("\n" + goblin.getName() + " has been defeated!");
            }
            
            round++;
        }

        System.out.println("\n====================");
        if (player.isAlive()) {
            System.out.println("Victory! " + player.getName() + " wins!");
        } else {
            System.out.println("Defeat! " + player.getName() + " has fallen!");
        }
        System.out.println("Game End!");
    }
}