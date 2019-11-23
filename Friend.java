
/**
 * This is a friend class that represent a person.
 *
 * @author (Abdi-rahman Musse)
 * @version (02/12/2017)
 */
public class Friend
{
    //This is the name of the friend.
    private String name;
    //This tells us how much money the friend has.
    private double money;
    /**
     * Constructor for objects of class Friend
     */
    public Friend(String newName, int amountToSpend)
    {
        name = newName;
        money = amountToSpend;
    }

    /**
     * This allows us to change the amount of money the person has
     */
    public void setMoney(double newMoney)
    {
        money = newMoney;
    }
    
    /**
     * This allows us to chage the name of the friend
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * This returns the friends detail
     */
    public String toString()
    {
        return name + " has £" + money;
    }
    
    /**
     * This returns the amount of moeny the friend has
     */
    public double getMoney()
    {
        return money;
    }
    
    /**
     * This returns the name of the friend
     */
    public String getName()
    {
        return name;
    }
}
