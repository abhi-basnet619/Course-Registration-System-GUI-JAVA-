
/**
 * class NonAcademicCourse
 * @author (Abhishek Basnet)
 * @version (2.0)
 */
public class NonAcademicCourse extends Course
{
    // instance variables of NonAcademicCourse.
    private String Instructorname;
private int duration;
private String Startingdate;
private String Completiondate;
private String Examdate;
private String prerequisite;
private boolean isRegistered;
private boolean isRemoved;

public NonAcademicCourse(String courseid, String coursename, int duration,String prerequisite)
{
super(courseid,coursename,duration);
this.prerequisite = prerequisite;
this.Startingdate = "";
this.Completiondate = "";
this.Examdate = "";
this.isRegistered = false;
this.isRemoved = false;
}

public String getInstructorname()
{
return this.Instructorname;
}
public int getDuration()
{
return this.duration;
}
public String getStartingdate()
{
return this.Startingdate;
}
public String getCompletiondate()
{
return this.Completiondate;
}
public String getExamdate()
{
return this.Examdate;
}
public String getprerequisite()
{
return prerequisite;
}
public boolean getisRegistered()
{
return this.isRegistered;
}
public boolean getisRemoved()
{
return this.isRemoved;
}
public void setInstructorname(String newInstructorname)
{
if (isRegistered == false)
{
this.Instructorname = newInstructorname;
}
else
{
System.out.println("It is not pssible to change the instructor name");
}
}

public void register (String courseleader,String Instructorname,String Startingdate,String completiondate,String examdate) 
{
if (isRegistered == false) 
{
super.setcourseleader(courseleader);
setInstructorname(Instructorname);
this.Startingdate = Startingdate;
this.Completiondate = completiondate;
this.Examdate = examdate;
isRegistered = true;
}
else
{
System.out.println("The course is already registered");
}
}

public void remove()
{
if(isRemoved == false)
{
super.setcourseleader(""); 
this.Instructorname = "";
this.Completiondate = "";
this.Examdate = "";
this.isRegistered = false;
this.isRemoved = true;
}
else
{
System.out.println("TheCourse is already removed");
}
}

public void display()
{
super.display(); 
if (isRegistered == true)
{
System.out.println("The name of instructor is" + Instructorname + ".");
System.out.println("The starting date is " + Startingdate + ".");
System.out.println("The Completion date is " + Completiondate + ".");
System.out.println("The exam is on " + Examdate + ".");
}
else
{
System.out.println("Non academic course has not been registered yet");
}
}
}
