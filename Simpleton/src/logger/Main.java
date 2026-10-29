/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logger;

/**
 *
 * @author Luis
 */
public class Main {
    public static void main(String[] args) {
  
        AuthModule auth = new AuthModule();
        auth.realizarAccion();

        PaymentModule payment = new PaymentModule();
        payment.realizarAccion();
    }
}
