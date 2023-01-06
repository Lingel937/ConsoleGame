package Items;

public class Items {
    public static Item wood;
    public static Item sword;
    public static Item raspberry;
    public static Item hay;
    public static Item Heugabel;

    public static Item LeatherHelmet;
    public static Item LeatherBoots;
    public static Item WoodenBoots;
    public static Item IronChestplate;
    public static Item ClothTunik;
    public static Item BulletproofVest;
    public static Item SleepingPants;
    public static Item LeatherPants;
    public static Item CargoPants;
    public static Item NoHat;
    public static Item NoBodyarmor;
    public static Item NoPants;
    public static Item Barefoot;
    public static void itemslol(){


        //resources
        wood = new Item(1,"wood","Resource","",0, 0,0,0,0, 0);
        hay = new Item(1,"hay","Resource","",0,0,0,0,0,0);

        //food
        raspberry = new Item(1, "Raspberry", "Food","",1,0,0,10,0,0);



        //weapons
        Heugabel = new Item(1, "Heugabel","Weapon", "",1,10,0.10,0,0,0);
        sword = new Item(1, "sword","Weapon", "",1,25,0.25,0,0,0);

        //armor

            //helmets
            LeatherHelmet = new Item(1, "LeatherHelmet","Armor","Helmet",0,0,0,0,0,3);

            //BodyArmor
            IronChestplate =new Item(1, "IronChestplate","Armor","Boots",0,0,0,0,0,30);
            ClothTunik = new Item(1, "ClothTunik","Armor","BodyArmor",0,0,0,0,0,6);
            BulletproofVest = new Item(1, "BulletproofVest","Armor","BodyArmor",0,0,0,0,0,40);

            //Pants
            LeatherPants = new Item(1, "LeatherPants","Armor","Pants",0,0,0,0,0,13);
            CargoPants = new Item(1, "CargoPants","Armor","Pants",0,0,0,0,0,10);

            //boots

            WoodenBoots = new Item(1, "WoodenBoots","Armor","Boots",0,0,0,0,0,3);
            LeatherBoots = new Item(1, "LeatherBoots","Armor","Boots",0,0,0,0,0,5);

            //
            Barefoot = new Item(1,"none","Armor","Boots",0,0,0,0,0,4);
            NoBodyarmor = new Item(1,"none","Armor","BodyArmor",0,0,0,0,0,20);
            NoHat = new Item(1,"none","Armor","Helmet",0,0,0,0,0,6);
            NoPants = new Item(1,"none","Armor","Pants",0,0,0,0,0,10);
    }
}
