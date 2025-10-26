package com.example;

import java.util.Random;

public class Goblin extends Enemy {
    private final Random random;

    // Constructor
    public Goblin(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
        this.random = new Random();
    }

    // Override method attack dengan mekanik critical hit 5%
    @Override
    public void attack(Combatant target) {
        int damage;
        int chance = random.nextInt(100); // menghasilkan angka 0-99
        
        if (chance < 5) { //jika angka random < 5 (0-4) -> 5% chance
            damage = getBaseDamage() * 2;
            System.out.println(getName() + " performs a CRITICAL HIT!");
            System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage!");
        } else { // 95% chance (5-99)
            damage = getBaseDamage();
            System.out.println(getName() + " attacks " + target.getName() + " for " + damage + " damage!");
        }
        
        target.takeDamage(damage);
    }
}