package Items;

public class Items {
    
    //Resources
    public static Item wood;
    public static Item hay;
    public static Item stone;
    
    //food
    public static Item raspberry;
    public static Item bread;
    public static Item jamal;
    
    //weapons
    
        //>10dmg
        public static Item club;
        public static Item largestick;
        public static Item arrow;
        public static Item brassknuckles;
        public static Item book;
        public static Item humanleg;
        public static Item humanarm;
        public static Item humanskull;
        
        //>15dmg
        public static Item pitchfork;
        public static Item baton;
        public static Item mace;
        public static Item ropewhip;
        
        //>20dmg
        public static Item prisonshank;
        public static Item chainwhip;
        
        //>25dmg
        public static Item sythe;
        
        //>30dmg
        public static Item sword;
        public static Item axe;
        
    //Armor
    
        //helmet
        public static Item nohat;
        public static Item leatherhelmet;
        
        //bodyarmor
        public static Item nobodyarmor;
        public static Item ironchestplate;
        public static Item clothtunik;
        public static Item bulletproofvest;
    
        //pants
        public static Item nopants;
        public static Item sleepingpants;
        public static Item leatherpants;
        public static Item cargopants;
    
        //boots
        public static Item barefoot;
        public static Item leatherboots;
        public static Item woodenboots;
    
    //void
    public static void itemslol(){


        // (1)(Name)(Type)(category)(level)(damage)(damagefactor)(nutrition)(Count)(Protection)
        //resources
        wood = new Item(1,"wood","Resource","",0, 0,0,0,1, 0);
        hay = new Item(1,"hay","Resource","",0,0,0,0,1,0);
        stone = new Item(118,"stone","Rescource","",0,0,0,0,1,0);

        //food
        raspberry = new Item(1, "raspberry", "Food","",1,0,0,10,1,0);
        bread = new Item(118,"bread","Food","",1,0,0,50,1,0);
        jamal = new Item(118,"Jamal","Food","",1,0,0,1000,1,0);

        //weapons
        pitchfork = new Item(1, "pitchfork","Weapon", "",1,10,0.10,0,1,0);
        sword = new Item(1, "sword","Weapon", "",1,25,0.25,0,1,0);
        club = new Item(118, "club","Weapon","",1,8,0.1,0,1,0);
        baton = new Item(118,"baton","Weapon","",1,12,0.2,0,1,0);
        prisonshank = new Item(118,"prison shank","Weapon","",1,15,0.05,0,1,0);
        largestick = new Item(118,"large stick","Weapon","",1,5,0.1,0,1,0);
        arrow = new Item(118,"arrow","Weapon","",1,7,0.05,0,1,0);
        axe = new Item(118,"axe","Weapon","",1,27,0.25,0,1,0);
        mace = new Item(118,"mace","Weapon","",1,14,0.1,0,1,0);
        brassknuckles = new Item(118,"brass knuckles","Weapon","",1,6,0.05,0,1,0);
        sythe = new Item(118,"sythe","Weapon","",1,20,0.2,0,1,0);
        book = new Item(118,"book","Weapon","",1,3,0.1,0,1,0);
        chainwhip = new Item(118,"chain whip","Weapon","",1,17,0.2,0,1,0);
        ropewhip = new Item(118,"rope whip","Weapon","",1,14,0.15,0,1,0);
        humanleg = new Item(118,"human leg","Weapon","",1,8,0.1,0,1,0);
        humanarm = new Item(118,"human arm","Weapon","",1,8,0.1,0,1,0);
        humanskull = new Item(118,"human skull","Weapon","",1,7,0.1,0,1,0);
        
        //armor

            //helmets
            nohat = new Item(1,"none","Armor","Helmet",0,0,0,0,1,6);
            leatherhelmet = new Item(1, "leather helmet","Armor","Helmet",0,0,0,0,1,3);

            //BodyArmor
            nobodyarmor = new Item(1,"none","Armor","BodyArmor",0,0,0,0,1,20);
            ironchestplate =new Item(1, "iron chestplate","Armor","Boots",0,0,0,0,1,30);
            clothtunik = new Item(1, "cloth tunik","Armor","BodyArmor",0,0,0,0,1,6);
            bulletproofvest = new Item(1, "bullet proof vest","Armor","BodyArmor",0,0,0,0,1,40);

            //Pants
            nopants = new Item(1,"none","Armor","Pants",0,0,0,0,1,10);
            leatherpants = new Item(1, "leather pants","Armor","Pants",0,0,0,0,1,13);
            cargopants = new Item(1, "cargo pants","Armor","Pants",0,0,0,0,1,10);
            sleepingpants = new Item(118,"sleeping pants","Armor","Pants",0,0,0,0,1,7);

            //boots
            barefoot = new Item(1,"none","Armor","Boots",0,0,0,0,1,4);
            woodenboots = new Item(1, "wooden boots","Armor","Boots",0,0,0,0,1,3);
            leatherboots = new Item(1, "leather boots","Armor","Boots",0,0,0,0,1,5);
            
    }
}
