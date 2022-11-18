
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

    Description:

      Food is an item.
      
*/


package Items;

public class Food extends Item  {


  
    public Food(String sName, int nLevel, int nNutritionalValue ){
        m_sItemType = "Food";  
        m_SItemName = sName;
        


      
    }
    //If you eat, your health increases.
    public void eat(){

    }
}
