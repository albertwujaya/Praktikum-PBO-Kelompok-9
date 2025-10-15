package com.example;

public interface Combatant {
    void attack(Combatant target);
    void takeDamage(int damage);
    void spesialSkill(Combatant target);
    boolean isAlive();
    String getName();
    int getHp();
}
