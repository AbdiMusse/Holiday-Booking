
/**
 * This is a holiday Class that represents the holiday which the person will purchase from the website.
 *
 * @author (Abdi-rahman Musse)
 * @version (17/11/2017)
 */
public class Holiday
{
    //This is the reference number of the holiday.
    private String refNo;
    //This is the type of holiday.
    private String type;
    //This is the price of the holiday.
    private double price;
    /**
     * Constructor for objects of class Holiday
     */
    public Holiday(String reference, String holidayType, double price)
    {
        // initialise instance variables
        refNo = reference;
        type = holidayType;
        this.price = price;
    }
    
    /**
     * Constructor for objects of class Holiday
     */
    public Holiday()
    {
        // initialise instance variables
        refNo = "AB315";
        type = "touring";
        this.price = 500;
    }

    /**
     * This allows us to change the reference number of the holiday.
     */
    public void setRefNumber(String newRefNumber)
    {
      refNo = newRefNumber;  
    }
    
    /**
     * This allows us to change the type of holiday.
     */
    public void getHolidayType(String newType)
    {
      type = newType;  
    }
    
    /**
     * This allows us to change the price of the holiday.
     */
    public void getHolidayPrice(double newPrice)
    {
      price = newPrice;  
    }
    
    /**
     * This returns the reference number of the holiday.
     */
    public String getRefNumber()
    {
      return refNo;  
    }
    
    /**
     * This returns the type of holiday.
     */
    public String getHolidayType()
    {
      return type;  
    }
    
    /**
     * This returns the price of the holiday.
     */
    public double getHolidayPrice()
    {
      return price;  
    }
}