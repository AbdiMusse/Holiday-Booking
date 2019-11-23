import java.util.*;
/**
 * This is a test class which allows me to test if my Classes work and interact
 * in the way i want them to.
 *
 * @author (Abdi-rahman Musse)
 * @version (02/12/2017)
 */
public class Main
{
    public Main()
    {
        //Step 1: 
        
        //This creates the Member Class object
        Member member1 = new Member("abdi@hotmail.com", 500);
        //This creates the Webiste Class object
        Website website = new Website("Club18");
        //This creates the Holiday Class object
        Holiday holiday = new Holiday("AB315", "touring", 500);
        
        //This allows the member to log in. 
        website.memberLogin(member1);
        //This allows the member to log out + makes the feild website in member class a null.
        //website.memberLogOut(member);
        //This allows the member to select a holiday.
        member1.selectHoliday(holiday);
        //This allows the member to pay for the holiday.
        member1.payForHoliday();
        
        //Step 2:

        //This creates the ArrayList object where the members are stored in.
        new ArrayList<Member>();
        //This creates a second Member Class object.
        Member member2 = new Member("ahmed@hotmail.com", 500);
        //This allows the second member to log in + add members to the ArrayList. 
        website.memberLogin(member2);
        //This allows the member1 to log in again so 2 members are logged in the website + add member to the ArrayList.
        website.memberLogin(member1);
        //This allows us to print details of all members that are logged in (in the ArrayList).
        website.listMembersLoggedIn();
        
        //Step 3:
        
        //This creates the Friend Class object
        Friend friend1 = new Friend("Joe", 600);
        //This creates the ArrayList object where the friends are stored in.
        new ArrayList<Friend>();
        //This allows the member to store a friend oject in the ArrayList.
        member1.storeFriend(friend1);
        //This allows us to print details of all friends stored in the ArrayList.
        member1.listFriends();
        
        //Step 4:
        
        //This allows the member to select a holiday and to allow the ckeckMoney() to be done.
        member2.selectHoliday(holiday);
        
        //Step 5: 
        
        //This allows the second member to pay for the holiday + 
        //debit the member and/or companions for the holiday cost.
        member2.payForHoliday();
    }
}