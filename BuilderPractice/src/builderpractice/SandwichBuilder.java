/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpractice;

/**
 *
 * @author Luis
 */
public class SandwichBuilder {

    private int size;
    private boolean cheese = false;
    private boolean tomato = false;
    private boolean pepperoni = false;
    private boolean lettuce = false;

    public SandwichBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public SandwichBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public SandwichBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public SandwichBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public SandwichBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public int getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isLettuce() {
        return lettuce;
    }
    
    public Sandwich build(){
        return new Sandwich(this);
    }

}
