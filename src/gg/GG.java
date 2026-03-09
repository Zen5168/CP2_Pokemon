package gg;
import java.util.*;

public class GG {
    
    // Stat Order PokeName, PokeType, level, bHp, bAtk, bSp_Atk, bDef, bSp_def, bSpd
    
    // STARTER POKEMONS
    static Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Grass", 5, 45, 49, 65, 49, 65, 45);
    static Pokemon Charmander = new Pokemon("Charmander", "Fire", 5, 39, 52, 60, 43, 50, 65);
    static Pokemon Squirtle = new Pokemon("Squirtle", "Water", 5, 44, 48, 50, 65, 64, 43);
    
    // SPACE FOR FUTURE POKEMONS
    //--------------------------------------------
    
    
    //--------------------------------------------
    
    // MOVES
    //--------------------------------------------
    
    // Stat Order MoveName, MoveCategory, MoveType, power, accuracy, pp
    static Move Tackle = new Move("Tackle", "Physical", "Normal", 40, 100, 35);
    static Move Scratch = new Move("Scratch", "Physical", "Normal", 40, 100, 35);
    static Move VineWhip = new Move("Vine Whip", "Physical", "Grass", 45, 100, 25);
    
    //--------------------------------------------
    static Scanner sc = new Scanner (System.in);
    
    //Static Variables
    static boolean isMainMenuRunning = true;
    static boolean inBattle = true;
    static int MainMenuChoice;
    static String mcName;
    static int pokeChoice;
    static Pokemon playerPokemon;
    static Pokemon rivalPokemon;
    
    // Input Validation
    static int getIntInput(){
        while(true){
            try{
            int input = sc.nextInt();
            sc.nextLine();
            return input;
            
            }
            catch (InputMismatchException e) {
            String badInput = sc.nextLine();
            System.out.println("-------------------------------------------------------");
            System.out.println(badInput + " is not a number!");
            System.out.println("Please Try Again!");
            System.out.print("> "); 
        }   
    }
  }
    // MAIN 
    public static void main(String[] args) {
        
        MainMenu();
        System.out.println("Thank you");
    }
    
    // MAIN MENU
    static void MainMenu() {
        
            while(isMainMenuRunning){
            System.out.println("1. Start");
            System.out.println("2. Close");
            System.out.print("Enter your choice: ");
            MainMenuChoice = getIntInput();
            
            switch (MainMenuChoice){
                case 1: mainStory(); 
                            isMainMenuRunning = false;
                break;
                case 2: isMainMenuRunning = false;
                break;
                
                default: 
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Invalid choice! Please try again");
            }
        }
}
    // MAIN STORY
    static void mainStory(){
        
        System.out.println("???: Hi, I'm Professor Delamaine");
        System.out.println("Delamaine: What is your name?");
        System.out.print("Enter your Name: ");
        mcName = sc.nextLine();
        System.out.println("It's nice to meet you " + mcName);
        System.out.println("Delamaine: Let's not beat around the bush " + mcName + ", you may now finally own your first pokemon");
        System.out.println("Delamaine: Choose your pokemon");
        
        pokeChoice();
        RenamePokemon();
        
        System.out.println("Delamaine: Oh! Here comes your cousin");
        System.out.println("Cousin???: My name's Dwight, although this is the first time we've met I'm actually your cousin!");
        System.out.println("Delamaine: Dwight, you can now also choose your first pokemon!");
        
        // YOUR RIVAL AUTOMATICALLY CHOOSES A POKEMON THAT COUNTERS YOUR POKEMON
        switch(pokeChoice){
            case 1: System.out.println("Dwight chose " + Squirtle.PokeName + "!");
                        rivalPokemon = Squirtle;
                         break;
            case 2: System.out.println("Dwight chose " + Bulbasaur.PokeName + "!");
                         playerPokemon = Bulbasaur;
                         break;
            case 3: System.out.println("Dwight chose " + Charmander.PokeName + "!");
                         playerPokemon = Charmander;
                         break;
        }
        
        System.out.println("Delamaine: my son, Dwight seems like he wants to battle");
        battle();
    }
    
    static void pokeChoice(){
        boolean isChoosingPokemon = true;
        while(isChoosingPokemon){
                    System.out.println("""
                           1. Charmander
                           2. Squirtle
                           3. Bulbasaur
                           """);
        System.out.print("Choose a pokemon (1-3): ");
        pokeChoice = getIntInput();
        
        switch(pokeChoice){
            case 1: System.out.println("You chose " + Charmander.PokeName + "!");
                        playerPokemon = Charmander;
                        isChoosingPokemon = false;
            break;
            case 2: System.out.println("You chose " + Squirtle.PokeName + "!");
                       playerPokemon = Squirtle;
                       isChoosingPokemon = false;
            break;
            case 3: System.out.println("You chose " + Bulbasaur.PokeName + "!");
                        playerPokemon = Bulbasaur;
                        isChoosingPokemon = false;
            break;
            default: 
                System.out.println("-------------------------------------------------------");
                System.out.println("That's not a pokemon! Please choose again");
          }
        }
    }
    
    static void RenamePokemon(){
        int renameOption;
        String PokemonNewName;
        boolean renameRunning = true;
        
        System.out.println("Do you want to rename your pokemon?");
        System.out.println("1. Yes");
        System.out.println("2. No");
       
        do{
        System.out.print("> ");
        renameOption = getIntInput();
            switch(renameOption){
            case 1:System.out.print("Enter your pokemon's new name: ");
                        PokemonNewName = sc.nextLine();
                        System.out.println("You renamed your pokemon " + PokemonNewName);
                        renameRunning = false;
                        break;
            case 2: System.out.println("You decided not to rename your pokemon" );
                        renameRunning = false;
                        break;
            default: 
                System.out.println("-------------------------------------------------------");
                System.out.println(renameOption +" is not an option!");
          }
        }
        
        while(renameRunning);
        }
    
            static void battle(){
                int battleChoice;
                
                while (inBattle){
                    System.out.println("""
                                       1. Fight
                                       2. Pokemon
                                       3. Bag
                                       4. Run
                                       """);
                    System.out.println("What will you do (1-4)?");
                    System.out.print("> ");
                    battleChoice = getIntInput();
                    
                    switch (battleChoice){
                        case 1: //fight();
                                    break;
                        case 2: //SwitchPokemon();
                                    break;
                        case 3: // bag ();
                                    break;
                        case 4: System.out.println("You ran away");
                                    inBattle = false;
                                    break;
                        default: System.out.println("Invalid choice!");   
                    }
                }
            }
            
    static void battle(Pokemon player, Pokemon rival) {
        System.out.println("Battle: " + player.PokeName + " vs " + rival.PokeName);    
      }
    }
