package com.example;

public class Player implements Combatant {
    // Atribut private (enkapsulasi)
    private String name;
    private int hp;
    private int baseDamage;

    // Constructor
    public Player(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    // Getter dan Setter untuk name
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk hp
    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    // Getter dan Setter untuk baseDamage
    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    // Implementasi method dari interface Combatant
    @Override
    public void attack(Combatant target) {
        System.out.println(name + " attacks " + target.getName() + "!");
        target.takeDamage(baseDamage);
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(name + " takes " + damage + " damage! (HP: " + hp + ")");
    }

    @Override
    public void spesialSkill(Combatant target) {
        System.out.println(name + " uses a special skill!");
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}