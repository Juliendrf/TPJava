package com.isep.rpg;
import java.util.List;

public abstract class Hero {
    public int lifePoints;  // Chaque héros possède  des points de vie, une arme et une armure
    public int armor;
    public int weaponDamage;
    public List<Potion> potions; // Il peut consommer de la nourriture ou des potions
    public List<Food> lembas;
    abstract void attack();
    abstract void defend(); // Chaque tour, le héros choisit d'attaquer, de se défendre ou d'utiliser un consommable
    abstract void useConsumable(Consumable consumable);

}
