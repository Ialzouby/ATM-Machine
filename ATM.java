/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import java.io.IOException;

/**
 *
 * @author issamalzouby
 */
public class ATM extends Menu{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Menu menu = new Menu();
        menu.getPinNumber();
        menu.getLogin();
        
        
        
        
    }
    
}
