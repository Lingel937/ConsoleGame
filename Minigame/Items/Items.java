package Items;

public class Items {
    public static Item wood;
    public static Item sword;
    public static Item raspberry;
    public static Item hay;
    public static Item Heugabel;
    public static void itemslol(){


        //resources
        wood = new Item(1,"wood","Resource","",0, 0,0,0,0);
        hay = new Item(1,"hay","Resource","",0,0,0,0,0);

        //food
        raspberry = new Item(1, "Raspberry", "Food","",1,0,0,10,0);



        //weapons
        Heugabel = new Item(1, "Heugabel","Weapon", "",1,10,0.10,0,0);
        sword = new Item(1, "sword","Weapon", "",1,25,0.25,0,0);
    }
}
