
/**
 * class Course
 * @author (Abhishek Basnet)
 * @version (2.0)
 */
public class Course
{

    // Attributes of Course class.
private String courseid;
private String coursename;
private String courseleader;
private int duration;
public Course(String courseid , String coursename, int duration) 
{
this.courseid = courseid;
this.coursename = coursename;
this.duration = duration;
this.courseleader = "";
}

public String getcourseid()
{
return this.courseid;
}
public String getcoursename()
{
return this.coursename;
}
public String getcourseleader()
{
return this.courseleader;
}
public int getduration()
{
return this.duration;
}

public void setcourseleader(String courseleader)
{
this.courseleader = courseleader;
}

public void display()
{
System.out.println("Courseid is " + this.courseid);
System.out.println("Coursename is " + this.coursename);
System.out.println("Duration is " + this.duration);
if (this.courseleader.equals(""))
{
System.out.println("empty string");
}
else
{
System.out.println("courseleader is" + this.courseleader);
}
}
}