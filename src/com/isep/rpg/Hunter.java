package com.isep.rpg;
// Le joueur peut choisir d'incarner un héros chasseur
public class Hunter extends Hero{
    public int arrows;   // Le chasseur possède un nombre limité de flèches pour attaquer
    void attack(){}
    void defend(){}

    @Override
    void useConsumable(Consumable consumable) {

    }

}
