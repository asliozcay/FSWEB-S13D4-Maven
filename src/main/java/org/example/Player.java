package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;
    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealth(int healthPercentage) {
        if(healthPercentage>100){
            this.healthPercentage = 100;
        } else if (healthPercentage<0) {
            this.healthPercentage = 0;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;
        if(healthPercentage<=0){
            checkHealth(healthPercentage);
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        healthPercentage += healthPotion;
        if(healthPercentage>100){
            healthPercentage = 100;
        }
    }
}
