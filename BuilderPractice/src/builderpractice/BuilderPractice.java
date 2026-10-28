/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderpractice;

/**
 *
 * @author Luis
 */
public class BuilderPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sandwich sandwich = new SandwichBuilder()
                .setSize(10)
                .addCheese()
                .addLettuce()
                .addPepperoni()
                .addTomato()
                .setSize(20)
                .build();
        
        System.out.println(sandwich.getDescription());
    }
    
}
