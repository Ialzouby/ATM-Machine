/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author issamalzouby
 */
public class Menu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>(); 
    public void getLogin()throws IOException {
        int x = 1; 
        do{
            try{
                data.put(123456,1234);
                data.put(212212, 212);
                System.out.println("Welcome to the Alzouby ATM");
                System.out.println("Enter your customer number Please");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your pin number");
                setPinNumber(menuInput.nextInt());
                
            }catch (Exception e){
                System.out.println("Invalid character, enter only numbers" + "\n");
                x = 2; 
            }
            for(Entry<Integer, Integer> entry:data.entrySet()){
                if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("Wrong customer number or ID" + "\n");
        }while(x==1);
    }
    int selection; 
    //display account menu
    public void getAccountType(){
        System.out.println("Select the account you would like to access");
        System.out.println("Type 1: Checking Account");
        System.out.println("Type 2: Saving Acccount");
        System.out.println("Exit");
        System.out.println("Choice :");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1: 
                getChecking();
                break; 
            case 2: 
                getSaving();
                break; 
            case 3: 
                System.out.println("Thank you for using this ATM , BYE!");
                getAccountType();
        }
    }
    //Display Checking account menu with selection
    public void getChecking(){
        System.out.println("Checking Account");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw funds");
        System.out.println("Type 3: Deposit funds");
        System.out.println("Type 4: Exit");
        System.out.println("Choice :"+ "\n");
        selection = menuInput.nextInt();
        switch(selection){
            case 1: 
                System.out.println("Checking account balance"+ moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break; 
            case 2: 
                getCheckingWithdrawalInput();
                getAccountType();
                break; 
            case 3: 
                getCheckingDepositInput();
                getAccountType();
                break; 
            default: 
                System.out.println("\n" + "Invalid Choice " + "\n");
                getChecking();
        }
    }
    //Display Saving Account
    public void getSaving(){
        System.out.println("Saving Account");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw funds");
        System.out.println("Type 3: Deposit funds");
        System.out.println("Type 4: Exit");
        System.out.println("Choice :"+ "\n");
        selection = menuInput.nextInt();
        switch(selection){
            case 1: 
                System.out.println("Saving account balance"+ moneyFormat.format(getSavingBalance()));
                getAccountType();
                break; 
            case 2: 
                getSavingWithdrawalInput();
                getAccountType();
                break; 
            case 3: 
                getSavingDepositInput();
                getAccountType();
                break; 
            default: 
                System.out.println("\n" + "Invalid Choice " + "\n");
                getSaving();
    }
    }
}
