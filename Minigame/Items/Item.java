
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
    protected String m_SItemName;
    protected String m_sItemType;
    protected int m_nItemLevel;

    public void LevelUp() {
        m_nItemLevel++;
    }


}