class Commands{

  public static void hunt(){
    //you will hunt a random monster and get loot, loose health and get coins. @Lingel
    int nHealtChange;


    Game.s_mPlayerCharacter.changeHealth(30);
    System.out.println("Hunt finished");
    
  }

  public static void help(){
    //prints out all commands @Lingel937
    System.out.println("Commands:");
    System.out.println("help: prints out all commands");
    System.out.println("hunt: you will hunt a random monster and get loot, loose health and get coins");
    System.out.println("inventory: shows your inventory");
    System.out.println("exit: exits the game");
  }
  
  public static void health(){
    //prints out your current health @Lingel937
    System.out.println("Your current health is: "+Game.s_mPlayerCharacter.getHealth());
  }
  public static void heal (){
    //@Lingel937
    Game.s_mPlayerCharacter.changeHealth(-50);
    System.out.println("You healed yourself. You now have "+Game.s_mPlayerCharacter.getHealth()+" HP");

  }
    public static void profile(){
        //prints out your profile @Lingel937
        System.out.println("Your Name: "+Game.s_mPlayerCharacter.getName());
        System.out.println("Your Class: "+Game.s_mPlayerCharacter.getCharacterType());
        System.out.println("Your Level: "+Game.s_mPlayerCharacter.getLevel());
    }
}