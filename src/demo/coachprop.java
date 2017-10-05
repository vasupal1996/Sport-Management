
package demo;

public class coachprop {
     private int cid;
    private String cname;
    private String address;
    private String contact;
    private int salary;
    private int experience;
    private String gender;
    private String gametype;
    private String game;
    public void setId(int i)
    {
        cid=i;
    }
    public int getId()
    {
        return cid;
    }
    public void setName(String n)
    {
        cname=n;
    }
    public String getName()
    {
        return cname;
    }
    public void setContact(String c)
    {
        contact=c;
        
    }
    public String getContact()
    {
        return contact;
        
    
    }
    public void setExperience(int e)
    {
        experience=e;
    }
    public int getExperience()
    {
        return experience;
    }
    public void setAddress(String a)
    {
        address=a;
        
    }
public String getAddress()
{
    return address;
    
}
public void setGender(String g)
{
    gender=g;
}

public String getGender()
{
    return gender;
}
public void setSalary(int  s)
{
    salary=s;
}
public int getSalary()
{
    return salary;
}
public void setGametype(String gt)
{
    gametype=gt;
}

public String getGametype()
{
    return gametype;
}
public void setGame(String ga)
{
    game=ga;
}

public String getGame()
{
    return game;
}

}