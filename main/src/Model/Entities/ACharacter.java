package Model.Entities;

import Model.Interfaces.ICharacter;

//Parent class to all the alive beings in the game
//All alive beings have a name, strength, armor and health value, both max and current
public class ACharacter implements ICharacter {
        String name;
        double strength;
        double maxHealth;
        double currentHealth;
        double armor;
        CharacterState state;

        public ACharacter(double Strength, double Health, String Name, double Armor)
        {
                this.strength = Strength;
                this.maxHealth = Health;
                this.currentHealth = Health;
                this.name = Name;
                this.armor = Armor;
                this.state = CharacterState.ALIVE;


        }
        public void addHealth(double value)
        {
                if(value>0) {
                        currentHealth += Math.min(value, maxHealth);
                }
        }
        public void removeHealth(double value){
                if(value>0) {
                        currentHealth -= value;
                }
                if(currentHealth<=0){
                        this.state = CharacterState.DEAD;
                }
        }

        //Boolean for if a character is alive or not

        public CharacterState getState(){
                return state;
        }
        public boolean isAlive(){
                return state==CharacterState.ALIVE;
        }

        //Getters for all attributes for characters
        public double getStrength()
        {
                return this.strength;
        }
        public double getmaxHealth()
        {
                return this.maxHealth;
        }
        public double getCurrentHealth()
        {
                return this.currentHealth;
        }
        public String getName()
        {
                return this.name;
        }
        public double getArmor()
        {
                return this.armor;
        }

}
