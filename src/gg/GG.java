package gg;
import java.util.*;

public class GG {
      
    static Scanner sc = new Scanner (System.in);
    static boolean isMainMenuRunning = true;
    static int MainMenuChoice;
    static String mcName;
    
    public static void main(String[] args) {
        
        while(isMainMenuRunning){
            System.out.println("1. Start");
            System.out.println("2. Close");
            System.out.print("Enter your choice: ");
            MainMenuChoice = sc.nextInt();
            sc.nextLine();
            
            switch (MainMenuChoice){
                case 1: mainStory(); 
                            isMainMenuRunning = false;
                break;
                case 2: isMainMenuRunning = false;
                break;
                default: System.out.println("Invalid choice! Please try again");
            }
        }
        
        System.out.println("Thank you");
     
    }
    
    static void mainStory(){
        System.out.println("Hi, I'm Professo Delamaine");
        System.out.println("What is your name?");
        System.out.print("Enter your Name: ");
        mcName = sc.nextLine();
        System.out.println("It's nice to meet you " + mcName);
    }
}