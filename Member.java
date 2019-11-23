import java.util.*;

/**
 * This is a member Class that represents a person.
 *
 * @author (Abdi-rahman Musse)
 * @version (16/11/2017)
 */
public class Member
{
    // This tells us the persons email.
    private String email;
    //This tells us the membership number of the person.
    private int membershipNumber;
    //This gives us the status of the person logging in.
    private boolean loginStatus;
    // This is a pointer to the Holiday Class.
    private Holiday holiday;
    //This is a pointer to the Website Class.
    private Website website;
    //This is an ArrayList of friends which stores the holiday companions of the member.
    private ArrayList<Friend>companions;
    //This tells us how much money the member has.
    private double memberMoney;
    /**
     * Constructor for objects of class Member
     */
    public Member(String newEmail, int moneyAmount)
    {
        // initialise instance variables
        email = newEmail;
        membershipNumber = 0;
        loginStatus = false;
        companions = new ArrayList<Friend>();
        memberMoney = moneyAmount;
    }
    
    /**
     * Default constructor for objects of class Member
     */
    public Member()
    {
        // initialise instance variables
        email = "abdi@hotmail.com";
        membershipNumber = 0;
        loginStatus = false;
        companions = new ArrayList<Friend>();
        memberMoney = 900;
    }
    
    public void memberShipNumber()
    {
        if (membershipNumber == 0)
        {
            membershipNumber = website.getBiggestNumber();
        }
    }
    
    /**
     * This allows us to add friends to the ArrayList.
     */
    public void storeFriend(Friend friend)
    {
        if (holiday == null)
        {
            companions.add(friend);
        }
        // is this okay?
    }
    
    /**
     * This prints out the detail of all friends in the ArrayList.
     */
    public void listFriends()
    {
        for (Friend friend : companions)
        {
            System.out.println (friend.toString());
        }
    }

    /**
     * This allows the member to choose a holiday.
     */
    public void selectHoliday(Holiday holiday)
    {
        if (getLoginStatus() == true)
        {
            this.holiday = holiday;
            if (checkMoney() == true)
            {
              System.out.println ("Member " + membershipNumber + 
              " has selected holiday reference number " +
              holiday.getRefNumber() +", a " + holiday.getHolidayType() +
              " holiday at £"
              + holiday.getHolidayPrice() + " per person.");
              for (Friend friend : companions)
              {
                  System.out.print(friend.getName() + ", ");
              }
              if (companions.size() > 0)
              {System.out.print( "will be joining you in this holiday");
              }
            }
            else
            {
                whoCannotPay();
                this.holiday = null;
            }
        }
        else
        {
            System.out.println ("Please log in before choosing a holiday!");
        }
    }
    
    /**
     * This checks if the member and companions are able to pay for the holiday.
     */
    public boolean checkMoney()
    {
        Iterator <Friend> it = companions.iterator();
        boolean hasEnough = true;
        
        if (getMemberMoney() < holiday.getHolidayPrice())
        {
            return false;
        }
        while (it.hasNext())
        { 
            Friend currentFriend = it.next();
            if (currentFriend.getMoney() < holiday.getHolidayPrice())
            {
                return false;
            }
        }
        return hasEnough;
    }
    
    /**
     * This lets us know who is unable to pay for the holiday.
     */
    public void whoCannotPay()
    {
        Iterator <Friend> it = companions.iterator();
        if (memberMoney < holiday.getHolidayPrice())
        {
            System.out.print("You do not have enough money to pay for the holiday. " );
            System.out.print("Please add £" + (holiday.getHolidayPrice()-getMemberMoney()) + ".");
            System.out.println();
        }
        while (it.hasNext())
        { 
            Friend currentFriend = it.next();
            if (currentFriend.getMoney() < holiday.getHolidayPrice())
            {
                System.out.print(currentFriend.getName() + " has insufficiant money. ");
                System.out.print("Please add £" + (holiday.getHolidayPrice()-currentFriend.getMoney()) + ".");
                System.out.println();
            }
        }
    }
    
    /**
     * This allows the person to pay for the holiday.
     */
    public void payForHoliday()
    {
        website.checkOut(this);
        memberMoney = getMemberMoney() - holiday.getHolidayPrice();
        for (Friend friend : companions)
        {
           double currentFriendMoney = friend.getMoney();
           currentFriendMoney = friend.getMoney() - holiday.getHolidayPrice();
           friend.setMoney(currentFriendMoney);
        }
        setHoliday(null);
        //Can i have this here? 
    }
    
    /**
     * This gives the webiste feild a value.
     */
    public void setWebsite(Website website)
    {
        if (getLoginStatus() == true)
        {
            this.website = website;
        }
    }
    
    /**
     * This allows us to change the email adress of the person.
     */
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    /**
     * This allows us to change the membership number of the person.
     */
    public void setMembershipNum(int newNumber)
    {
        membershipNumber = newNumber;
    }
    
    /**
     * This allows the person to log in to the website.
     */
    public void setloginStatus(boolean newLogin)
    {
        loginStatus = newLogin;
    }
    
    /**
     * This allows the person to log in to the website.
     */
    public void setHoliday(Holiday newHoliday)
    {
        holiday = newHoliday;
    }
        
    /**
     * This allows the person to log in to the website.
     */
    public void setMemberMoney(double newMemberMoney)
    {
        memberMoney = newMemberMoney;
    }
    
    /**
     * This gives us details of the members details.
     */
    public String toString()
    {
        return email + ": " + membershipNumber;
    }
    
    /**
     * This gives us the email of the perosn.
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * This gives us the membership number of the person.
     */
    public int getMembershipNum()
    {
        return membershipNumber;
    }
    
    /**
     * This gives us the status of the login.
     */
    public boolean getLoginStatus()
    {
        return loginStatus;
    }
    
    /**
     * This gives us the amount of money the member has.
     */
    public double getMemberMoney()
    {
        return memberMoney;
    }
    
    /**
     * This gives us the pointer to the field holiday.
     */
    public Holiday getHoliday()
    {
        return holiday;
    }
}