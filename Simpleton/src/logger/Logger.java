/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logger;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Luis
 */
public class Logger {
    private FileWriter writer;
    
    private Logger(){
        try{
            writer = new FileWriter("app.txt",true);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static Logger getInstance(){
        return Holder.INSTANCE;
    }
    
    private static class Holder {
        private static final Logger INSTANCE = new Logger();
    }
    
    public void log(String message){
        try{
            writer.write(message + "\n");
            writer.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
