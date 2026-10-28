/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpractice;

/**
 *
 * @author Luis
 */
public class Sandwich {
    private int size;
    private boolean cheese;
    private boolean tomato;
    private boolean pepperoni;
    private boolean lettuce;

    public Sandwich(SandwichBuilder builder) {
        this.size = builder.getSize();
        this.cheese = builder.isCheese();
        this.tomato = builder.isTomato();
        this.pepperoni = builder.isPepperoni();
        this.lettuce = builder.isLettuce();
    }
    
    public String getDescription(){
        return "Size: " + size + " Cheese: " + cheese + " Tomato: " + tomato + " Pepperoni: " + pepperoni + " Lettuce: " + lettuce;
    }
    
    
}
