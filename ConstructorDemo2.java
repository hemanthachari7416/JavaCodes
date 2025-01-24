class Item
{
    int itemNum;
    String itemName;
    Item(int itemNum, String itemName) // Parameterized constructor
    {
        this.itemNum = itemNum;
        this.itemName = itemName;
    }
    Item(){}
    void display()
    {
        System.out.println("Item Num: "+ itemNum);
        System.out.println("Item Name: "+ itemName);
    }
}
public class ConstructorDemo2 {
    public static void main(String[] args){
        Item item1 = new Item(234,"Mouse");
        item1.display();
        Item item2 = new Item();
        item2.display();
    }
}
