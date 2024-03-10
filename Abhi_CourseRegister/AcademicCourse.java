
/**
 * class AcademicCourse
 * @author (Abhishek Basnet)
 * @version (2.0)
 */
public class AcademicCourse extends Course
{
    // Attributes of Academic Course
 private String lecturername;
private String level;
private String credit;
private String startingdate;
private String completiondate;
private int numberofassessments;
private boolean isregistered;

public AcademicCourse (String courseid,String coursename,int duration,String level,String credit,int numberofassessments)
{
super(courseid,coursename, duration); 
this.level = level;
this.credit = credit;
this.numberofassessments = numberofassessments;
this.lecturername ="";
this.startingdate = "";
this.completiondate = "";
isregistered = false;
}

public String getlevel()
{
return this.level;
}
public String getcredit()
{
return this.credit;
}
public int getnumberofassessments()
{
return this.numberofassessments;
}
public String getlecturername()
{
return this.lecturername;
}
public String getstartingdate()
{
return this.startingdate;
}
public String getcompletiondate()
{
return this.completiondate;
}
public Boolean getisregistered()
{
return this.isregistered;
}

public void setlecturername(String newlecturername)
{
this.lecturername = newlecturername;
}

public void setnumberofassesments(int newnumberofassessments)
{
this.numberofassessments = newnumberofassessments;
}

public void register(String courseleader, String lecturername, String startingdate, String completiondate)
{
if(isregistered == true) 
{
System.out.println("Name of the lecturer is "+ lecturername + ".");
System.out.println("Course starts from " + startingdate + ".");
System.out.println("Course ends at " + completiondate+ ".");
}
else
{
super.setcourseleader(courseleader);
this.startingdate = startingdate;
this.completiondate = completiondate;
this.lecturername = lecturername;
this.isregistered = true;
}
}

public void display()
{
super.display(); 
if (isregistered == true)
{
System.out.println("Name of the lecturer is " + lecturername + ".");
System.out.println("Course will starts from" + startingdate + ".");
System.out.println("Course will end in " + completiondate + ".");
System.out.println("Your level  is " + level + ".");
System.out.println("Credit is " + credit + ".");
System.out.println("Total number of assessment are" + numberofassessments + ".");
}
else
{
System.out.println("The course has not been registered");
}
}
}