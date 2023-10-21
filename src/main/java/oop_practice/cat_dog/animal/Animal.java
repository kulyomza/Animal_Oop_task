package oop_practice.cat_dog.animal;

public abstract class Animal {

    final String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void sound();


}