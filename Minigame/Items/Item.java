
/*
    Author:                  Valentin Lingelbach
    Version added:           WIP_0.1
    Last Update in Version:  WIP_0.1

    Description:

      Superclass of all items
      this class doesnt contain a lot but it inherits to every item
*/

package Items;

public class Item {
    protected String m_sItemName;
    protected String m_sItemType;
    protected int m_nItemLevel;
    protected int m_nItemID;
    //protected String m_s

    public void LevelUp() {
        m_nItemLevel++;
    }


}