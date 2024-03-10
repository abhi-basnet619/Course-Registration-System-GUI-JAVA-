
/**
 * class INGCollege 
 * @author (Abhishek Basnet)
 * @version (2.0)
 */
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import java.util.*; 
import javax.swing.BorderFactory;
import javax.swing.border.Border;



public class INGCollege implements ActionListener
{
    // instance variables 
    private JFrame frame;
    private JPanel panelContainer,academicPanel,nonAcademicPanel;
    private JLabel acaTitleLbl,courseIdLbl1,courseIdLbl2,courseNameLbl,courseLeaderLbl,durationLbl,lecturerNameLbl1,lecturerNameLbl2,levelLbl,creditLbl,startingDateLbl,completionDateLbl,noOfAssesmentLbl,noOfAssesmentLbl2,
                  nonAcaTitleLbl,nonCourseIdLbl1,nonCourseIdLbl2,nonCourseNameLbl,nonDurationLbl,nonStartingDateLbl,nonCompletionDateLbl,nonExamDateLbl,nonPrerequisiteLbl,nonInstructorNameLbl,nonInstructorNameLbl2,nonCourseLeaderLbl;
    private Border line;
    private JMenu menu;
    private JMenuBar mb;
    private JMenuItem item1,item2;
    private CardLayout cl;
    private JTextField courseIdField1,courseIdField2,courseNameField,courseLeaderField,durationField,lecturerNameField,levelField,creditField,startingDateField,completionDateField,noOfAssesmentField,
                      nonCourseIdField1,nonCourseIdField2,nonCourseNameField,nonDurationField,nonStartingDateField,nonCompletionDateField,nonExamDateField,nonPrerequisiteField,nonInstructorNameField,nonCourseLeaderField;
    private JButton addBtn,registerBtn,displayBtn,clearBtn,
                   nonAddBtn,nonRegisterBtn,nonDisplayBtn,nonClearBtn,removeBtn;
    // declaration of arraylist of Course class
     public ArrayList<Course> list=new ArrayList<Course>();  
    
    
    
      //Constructor for objects of class INGCollege
    public INGCollege()
    {
         
        //For frame
        frame = new JFrame("Course Registration"); // Creating instance of JFrame
        frame.setVisible(true); // setting frame visible as true
        frame.setSize(900,700); // setting width and height
        frame.setLocation(350,80); // setting location x axis,y axis
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting to close after tapping x 
        frame.setResizable(false);  // setting resizable as false.
        frame.setBackground( new Color(245, 222, 179) ); // setting frame color.
        
        
         //For menu
        mb = new JMenuBar();
        menu = new JMenu("Option");
        menu.setForeground(new Color(128,0,128)); // setting color to menu Text select
        item1 = new JMenuItem("Non-Academic Course");
        item1.setForeground(Color.BLACK); // setting item 1 color
        item1.addActionListener(this); // adding action listener in MenuIteam1
        item2 = new JMenuItem("Academic Course");
        item2.setForeground(Color.BLUE);
        item2.addActionListener(this); // adding action  listener in menuIteam2
        
        
    
        cl = new CardLayout(); // Creating instance of Card layout 
        panelContainer = new JPanel(); //for both panels
        panelContainer.setLayout(cl); // setting layout as Cardlayout
        cl.show(panelContainer, "1"); 
        
        academicPanel= new JPanel(); // panel for academic course
        Border blackline = BorderFactory.createLineBorder(Color.orange);  // for border
        academicPanel.setBorder(blackline);  //Setting border line in its Panel
        academicPanel.setSize(900,650);
        academicPanel.setLocation(300,100);
        academicPanel.setLayout(null);
        academicPanel.setBackground( new Color(215, 218, 222) );
        
        nonAcademicPanel = new JPanel(); // panel for Non academic course
        nonAcademicPanel.setSize(900,650);
        nonAcademicPanel.setLocation(300,100);
        nonAcademicPanel.setLayout(null);
        nonAcademicPanel.setBackground( new Color(215, 218, 222) );
        nonAcademicPanel.setBorder(blackline);
        
        
         //For AcaTitleLabel(Academic Course)
        acaTitleLbl = new JLabel("Academic Course");
        acaTitleLbl.setBounds(355,0,200,100);
        acaTitleLbl.setFont(new Font("Times New Roman", Font.BOLD, 20)); // Setting label 1 font and size
        acaTitleLbl.setForeground(Color.GRAY); //setting label 1(academic Course) text color
        
        /**
         * nonAcaTitleLabel(Non-Academic Course)
         */
        nonAcaTitleLbl = new JLabel("Non-Academic Course");
        nonAcaTitleLbl.setBounds(350,0,250,100);
        nonAcaTitleLbl.setFont(new Font("Times New Roman", Font.BOLD, 20)); // Setting label 1 font and size
        nonAcaTitleLbl.setForeground(new Color(128,0,128)); //setting nonAcaTitleLbl color 
        
        
        /**
         * CourseId1(Academic Course) 
         */
        courseIdLbl1 = new JLabel("CourseId:");
        courseIdLbl1.setBounds(60,65,200,100); // x axis,y axis, width,height
        courseIdLbl1.setFont(new Font("Consolas", Font.BOLD, 15)); // font and size
        
        courseIdField1 = new JTextField();
        courseIdField1.setBounds(170,100,155,30);
        courseIdField1.setForeground(Color.BLUE);
        courseIdField1.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * CourseId2(AcademicCourse)
         */
        courseIdLbl2 = new JLabel("CourseId:");
        courseIdLbl2.setBounds(60,300,200,100);
        courseIdLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        
        courseIdField2 = new JTextField();
        courseIdField2.setBounds(170,335,155,30);
        courseIdField2.setForeground(Color.BLUE);
        courseIdField2.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * nonCourseId1(Non-Academic Course)
         */
        nonCourseIdLbl1 = new JLabel("CourseId:");
        nonCourseIdLbl1.setBounds(60,65,200,100); // x axis,y axis, width,height
        nonCourseIdLbl1.setFont(new Font("Consolas", Font.BOLD, 15)); // font and size
        
        nonCourseIdField1 = new JTextField();
        nonCourseIdField1.setBounds(170,100,155,30);
        nonCourseIdField1.setForeground(new Color(128,0,128));
        nonCourseIdField1.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * nonCourseId2(non-AcademicCourse)
         */
        nonCourseIdLbl2 = new JLabel("CourseId:");
        nonCourseIdLbl2.setBounds(60,250,200,100);
        nonCourseIdLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        
        nonCourseIdField2 = new JTextField();
        nonCourseIdField2.setBounds(170,285,155,30);
        nonCourseIdField2.setForeground(Color.BLUE);
        nonCourseIdField2.setFont(new Font("Consolas", Font.BOLD, 15));
        /**
         * CourseName(Academic Course)
         */
        courseNameLbl = new JLabel("CourseName:");
        courseNameLbl.setBounds(500,65,200,100);
        courseNameLbl.setFont(new Font("Consolas", Font.BOLD, 15));  // font and size
        
        courseNameField = new JTextField();
        courseNameField.setBounds(620,100,155,30);
        courseNameField.setForeground(Color.BLUE);
        courseNameField.setFont(new Font("Consolas", Font.BOLD, 15));
        
         /**
         * nonCourseName(non Academic Course)
         */
        nonCourseNameLbl = new JLabel("CourseName:");
        nonCourseNameLbl.setBounds(500,65,200,100);
        nonCourseNameLbl.setFont(new Font("Consolas", Font.BOLD, 15));  // font and size
        
        nonCourseNameField = new JTextField();
        nonCourseNameField.setBounds(620,100,155,30);
        nonCourseNameField.setForeground(new Color(128,0,128));
        nonCourseNameField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * CourseLeader(Academic Course)
         */
        courseLeaderLbl = new JLabel("CourseLeader:");
        courseLeaderLbl.setBounds(60,420,200,100);
        courseLeaderLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        courseLeaderField = new JTextField();
        courseLeaderField.setBounds(170,460,155,30);
        courseLeaderField.setForeground(Color.BLUE);
        courseLeaderField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * nonCourseLeader(nonAcademic Course)
         */
        nonCourseLeaderLbl = new JLabel("CourseLeader:");
        nonCourseLeaderLbl.setBounds(60,300,200,100);
        nonCourseLeaderLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        nonCourseLeaderField = new JTextField();
        nonCourseLeaderField.setBounds(170,335,155,30);
        nonCourseLeaderField.setForeground(new Color(128,0,128));
        nonCourseLeaderField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * duration(Academic Course)
         */
        durationLbl = new JLabel("Duration:");
        durationLbl.setBounds(500,120,200,100);
        durationLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        durationField = new JTextField();
        durationField.setBounds(620,155,155,30);
        durationField.setForeground(Color.BLUE);
        durationField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * duration(non Academic Course)
         */
        nonDurationLbl = new JLabel("Duration:");
        nonDurationLbl.setBounds(500,120,200,100);
        nonDurationLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        nonDurationField = new JTextField();
        nonDurationField.setBounds(620,155,155,30);
        nonDurationField.setForeground(new Color(128,0,128));
        nonDurationField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        
        /**
         * lecturerName(Academic Course) 
         */
        lecturerNameLbl1 = new JLabel("Lecturer");
        lecturerNameLbl1.setBounds(60,355,200,100);
        lecturerNameLbl1.setFont(new Font("Consolas", Font.BOLD, 14));
        lecturerNameLbl2 = new JLabel("Name:");
        lecturerNameLbl2.setBounds(60,370,200,100);
        lecturerNameLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        
        lecturerNameField = new JTextField();
        lecturerNameField.setBounds(620,400,155,30);
        lecturerNameField.setForeground(Color.BLUE);
        lecturerNameField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * instructorName(non-Academic Course) 
         */
        nonInstructorNameLbl = new JLabel("Instructor");
        nonInstructorNameLbl.setBounds(60,355,200,100);
        nonInstructorNameLbl.setFont(new Font("Consolas", Font.BOLD, 14));
        nonInstructorNameLbl2 = new JLabel("Name:");
        nonInstructorNameLbl2.setBounds(60,370,200,100);
        nonInstructorNameLbl2.setFont(new Font("Consolas", Font.BOLD, 14));
        
        nonInstructorNameField = new JTextField();
        nonInstructorNameField.setBounds(620,395,155,30);
        nonInstructorNameField.setForeground(new Color(128,0,128));
        nonInstructorNameField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * level(Academic Course)
         */
        levelLbl = new JLabel("Level:");
        levelLbl.setBounds(500,190,200,100);
        levelLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        levelField = new JTextField();
        levelField.setBounds(620,228,155,30);
        levelField.setForeground(Color.BLUE);
        levelField.setFont(new Font("Consolas", Font.BOLD, 15));
        

        
        /**
         * examDate(non Academic Course)
         */
        nonExamDateLbl = new JLabel("ExamDate:");
        nonExamDateLbl.setBounds(500,250,200,100);
        nonExamDateLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        nonExamDateField = new JTextField();
        nonExamDateField.setBounds(620,285,155,30);
        nonExamDateField.setForeground(new Color(128,0,128));
        nonExamDateField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * Credit(AcademicCourse)
         */
        creditLbl = new JLabel("Credit:");
        creditLbl.setBounds(60,120,200,100);
        creditLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        creditField = new JTextField();
        creditField.setBounds(170,155,155,30);
        creditField.setForeground(Color.BLUE);
        creditField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * Prerequisite(nonAcademicCourse)
         */
        nonPrerequisiteLbl = new JLabel("Prerequisite:");
        nonPrerequisiteLbl.setBounds(60,120,200,100);
        nonPrerequisiteLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        nonPrerequisiteField = new JTextField();
        nonPrerequisiteField.setBounds(170,155,155,30);
        nonPrerequisiteField.setForeground(new Color(128,0,128));
        nonPrerequisiteField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * StartingDate(Academic Course)
         */
        startingDateLbl = new JLabel("StartingDate:");
        startingDateLbl.setBounds(500,300,200,100);
        startingDateLbl.setFont(new Font("Consolas", Font.BOLD, 14));
        
        startingDateField = new JTextField();
        startingDateField.setBounds(620,335,155,30);
        startingDateField.setForeground(Color.BLUE);
        startingDateField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * StartingDate(non-Academic Course)
         */
        nonStartingDateLbl = new JLabel("StartingDate:");
        nonStartingDateLbl.setBounds(500,300,200,100);
        nonStartingDateLbl.setFont(new Font("Consolas", Font.BOLD, 14));
        
        nonStartingDateField = new JTextField();
        nonStartingDateField.setBounds(620,335,155,30);
        nonStartingDateField.setForeground(new Color(128,0,128));
        nonStartingDateField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * CompletionDate(Academic Course)
         */
        completionDateLbl = new JLabel("CompletionDate:");
        completionDateLbl.setBounds(500,365,200,100);
        completionDateLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        
        
        completionDateField = new JTextField();
        completionDateField.setBounds(170,400,155,30);
        completionDateField.setForeground(Color.BLUE);
        completionDateField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        /**
         * CompletionDate(non Academic Course)
         */
        nonCompletionDateLbl = new JLabel("CompletionDate:");
        nonCompletionDateLbl.setBounds(500,360,200,100);
        nonCompletionDateLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        
        
        
        nonCompletionDateField = new JTextField();
        nonCompletionDateField.setBounds(170,400,155,30);
        nonCompletionDateField.setForeground(new Color(128,0,128));
        nonCompletionDateField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        
        /**
         * NumberOfAssesment(Academic Course)
         */
        noOfAssesmentLbl = new JLabel("NumberOf");
        noOfAssesmentLbl.setBounds(60,180,200,100);
        noOfAssesmentLbl.setFont(new Font("Consolas", Font.BOLD, 15));
        
        noOfAssesmentLbl2 = new JLabel("Assesments:");
        noOfAssesmentLbl2.setBounds(60,200,200,100);
        noOfAssesmentLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        
        noOfAssesmentField = new JTextField();
        noOfAssesmentField.setBounds(170,229,155,30);
        noOfAssesmentField.setForeground(Color.BLUE);
        noOfAssesmentField.setFont(new Font("Consolas", Font.BOLD, 15));
        
        
        
        /**
         *  Buttons(Academic Course) 
         **/
        addBtn = new JButton("Add Course for Academic Course");
        addBtn.addActionListener(this); // adding actionlistener in addBtn
        addBtn.setBounds(330,280,220,30);
        addBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        addBtn.setForeground(Color.GRAY); 
     
        
        registerBtn = new JButton("Register for Academic Course");
        registerBtn.addActionListener(this);
        registerBtn.setBounds(340,530,200,30);
        registerBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));    
        registerBtn.setForeground(Color.GRAY);

        
        displayBtn = new JButton("Display");
        displayBtn.addActionListener(this);
        displayBtn.setBounds(90,545,155,30);     
        displayBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        displayBtn.setForeground(Color.GRAY);
        
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);
        clearBtn.setBounds(635,545,155,30);
        clearBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        clearBtn.setForeground(Color.GRAY);
        
        /**
         * Buttons(non Academic Course)
         */
        nonAddBtn = new JButton("Add Course for Non-Academic Course");
        nonAddBtn.addActionListener(this);
        nonAddBtn.setBounds(320,220,250,30);
        nonAddBtn.setFont(new Font("Times New Roman",Font.BOLD, 13));
        nonAddBtn.setForeground(new Color(128,0,128)); 
     
        
        nonRegisterBtn = new JButton("Register for Non-Academic Course");
        nonRegisterBtn.addActionListener(this);
        nonRegisterBtn.setBounds(320,460,250,30);
        nonRegisterBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        nonRegisterBtn.setForeground(new Color(128,0,128));

        
        nonDisplayBtn = new JButton("Display");
        nonDisplayBtn.addActionListener(this);
        nonDisplayBtn.setBounds(150,545,155,30);
        nonDisplayBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        nonDisplayBtn.setForeground(new Color(128,0,128));
        
        nonClearBtn = new JButton("Clear");
        nonClearBtn.addActionListener(this);
        nonClearBtn.setBounds(580,545,155,30);
        nonClearBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        nonClearBtn.setForeground(new Color(128,0,128));
        
        removeBtn = new JButton("Remove");
        removeBtn.addActionListener(this);
        removeBtn.setBounds(400,540,90,45);
        removeBtn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        removeBtn.setForeground(new Color(128,0,128));
        
        
        /**
         * Adding
         */
        // adding For menubar,menu and menuItem
        frame.setJMenuBar(mb); // adding menubar on frame
        mb.add(menu);   // adding menu on  menubar
        menu.add(item1);  // adding menuItem 1 on menu
        menu.add(item2); // adding menuItem 2 on menu
        
        
        frame.add(panelContainer);     // adding panel container in frame
        panelContainer.add(academicPanel, "1");  // adding Academicpanel and assigning this panel 1 as index 1
        panelContainer.add(nonAcademicPanel, "2");  // adding NonAcademicpanel and assigning this panel 2 as index 2
        
        // adding labels in panel(Academic Course)
        academicPanel.add(acaTitleLbl); 
        academicPanel.add(courseIdLbl1);
        academicPanel.add(courseIdLbl2);
        academicPanel.add(courseNameLbl); 
        academicPanel.add(courseLeaderLbl); 
        academicPanel.add(durationLbl); 
        academicPanel.add(lecturerNameLbl1);
        academicPanel.add(lecturerNameLbl2);
        academicPanel.add(levelLbl); 
        academicPanel.add(creditLbl); 
        academicPanel.add(startingDateLbl); 
        academicPanel.add(completionDateLbl); 
        
        academicPanel.add(noOfAssesmentLbl); 
        academicPanel.add(noOfAssesmentLbl2);
        
        //adding labels in panel(non-Academic Course)
        nonAcademicPanel.add(nonAcaTitleLbl);
        nonAcademicPanel.add(nonCourseNameLbl);
        nonAcademicPanel.add(nonCourseNameLbl);
        nonAcademicPanel.add(nonDurationLbl);
        nonAcademicPanel.add(nonStartingDateLbl);
        nonAcademicPanel.add(nonCompletionDateLbl);
        nonAcademicPanel.add(nonExamDateLbl);
        nonAcademicPanel.add(nonPrerequisiteLbl);
        nonAcademicPanel.add(nonInstructorNameLbl);
        nonAcademicPanel.add(nonInstructorNameLbl2);
        nonAcademicPanel.add(nonCourseLeaderLbl);
        nonAcademicPanel.add(nonCourseIdLbl1);
        nonAcademicPanel.add(nonCourseIdLbl2);
        
        
        //adding textFields in panel for Academic Course
        academicPanel.add(courseIdField1);  
        academicPanel.add(courseIdField2); 
        academicPanel.add(courseNameField);  
        academicPanel.add(courseLeaderField); 
        academicPanel.add(durationField); 
        academicPanel.add(lecturerNameField); 
        academicPanel.add(levelField); 
        academicPanel.add(creditField); 
        academicPanel.add(startingDateField); 
        academicPanel.add(completionDateField); 
        academicPanel.add(noOfAssesmentField);
        
        //adding textfields in panel for Non Academic Course
        nonAcademicPanel.add(nonCourseNameField);
        nonAcademicPanel.add(nonDurationField);
        nonAcademicPanel.add(nonStartingDateField);
        nonAcademicPanel.add(nonCompletionDateField);
        nonAcademicPanel.add(nonExamDateField);
        nonAcademicPanel.add(nonPrerequisiteField);
        nonAcademicPanel.add(nonInstructorNameField);
        nonAcademicPanel.add(nonCourseLeaderField);
        nonAcademicPanel.add(nonCourseIdField1);
        nonAcademicPanel.add(nonCourseIdField2);

        // adding buttons in panel for Academic Course
        academicPanel.add(addBtn);
        academicPanel.add(registerBtn);
        academicPanel.add(displayBtn);
        academicPanel.add(clearBtn);
        
        // adding buttons in panel for Non Academic Course
        nonAcademicPanel.add(nonAddBtn);
        nonAcademicPanel.add(nonRegisterBtn);
        nonAcademicPanel.add(nonDisplayBtn);
        nonAcademicPanel.add(nonClearBtn);
        nonAcademicPanel.add(removeBtn);
        
        
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        // For item1
         if(e.getSource() == item1){       
            cl.show(panelContainer, "2"); 
        }
        
        
         //For item2
        if(e.getSource() == item2){
            cl.show(panelContainer, "1");
        }
        
        
         //addButton for Academic Course
           if(e.getSource() == addBtn){
            String id = courseIdField1.getText();
            String name = courseNameField.getText();
            String time = durationField.getText();
            String lvl = levelField.getText();
            String crdt = creditField.getText();
            String assesment = noOfAssesmentField.getText();
                
            boolean checkId = false;
            for(Course ac:list){
                if(ac.getcourseid().equals(id)){
                    
                    checkId = true;
                    break;
                }
            }
            boolean notNull = true;
            if(id.isEmpty()||name.isEmpty()||lvl.isEmpty()||time.isEmpty()||crdt.isEmpty()||assesment.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please,Do not leave any text field empty!");
                notNull = false;
            }
            
            if(checkId == false && notNull == true){
                try{
                    int t = Integer.parseInt(durationField.getText());
                    String c = creditField.getText();
                    int a = Integer.parseInt(noOfAssesmentField.getText());
                    
                    AcademicCourse academic = new AcademicCourse(id,name,t,lvl,c,a);   
                    list.add(academic);
                    
                    for(Course var:list){
                        if(var instanceof AcademicCourse){
                            AcademicCourse ac =(AcademicCourse)var;   // downcasting as to call the method which is in AcademicCourse class
                            Integer.parseInt(ac.getcredit());
                        }
                    }
                    JOptionPane.showMessageDialog(frame,"Academic Course is added successfully"+list.size());
                }
                
                catch(NumberFormatException c){
                    JOptionPane.showMessageDialog(frame,"The input inserted is invalid");
                }
            }
            else if(checkId== true)
            {
                JOptionPane.showMessageDialog(frame,"The entered Course is already added!");
            }
            }
        
        
        
         //add button for non Academic Course
         
        if(e.getSource() == nonAddBtn){
            String cId = nonCourseIdField1.getText();
            String cName = nonCourseNameField.getText();
            String sNt = nonDurationField.getText();
            String pQ = nonPrerequisiteField.getText();
            
            boolean notEmpty = true;
            if(cId.isEmpty()||cName.isEmpty()||sNt.isEmpty()||pQ.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please do not leave any text field empty!");
                notEmpty = false;
            }
            
            boolean checkId = false;
            for(Course var:list){
                if(var.getcourseid().equals(cId)){
                    JOptionPane.showMessageDialog(frame,"The entered Course is already added!");
                    checkId = true;
                }
            }
            
            if(notEmpty == true && checkId == false ){
                try{
                    String nonTime = nonDurationField.getText();
                    int nt = Integer.parseInt(nonTime);
            
                    NonAcademicCourse nonAcademic = new NonAcademicCourse(cId,cName,nt,pQ); 
                    list.add(nonAcademic);
                    JOptionPane.showMessageDialog(frame,"Course is added successfully"+list.size());
            
            }
            catch(NumberFormatException c){
                JOptionPane.showMessageDialog(frame,"The input inserted is invalid");
            }
        }
              
    }
       
        
         //Register Button for Academic Course
           
        if(e.getSource() == registerBtn){
            String rId = courseIdField2.getText();
            String leader = courseLeaderField.getText();//String leader = courseLeaderField.getText();
            String lecturer = completionDateField.getText(); 
            String sDate = startingDateField.getText();
            String cDate = lecturerNameField.getText(); 
            
        
            
            
            AcademicCourse ac; //  ac as Reference of Academic Course class
            for(Course rAc:list){
                if(rAc.getcourseid().equals(rId)){
                    if(rAc instanceof AcademicCourse){  
                        ac = (AcademicCourse)rAc;  // downCasting as to call the method from Academic Course class
                        if(ac.getisregistered() == true){
                            JOptionPane.showMessageDialog(frame,"The entered Course is already registered!");
                        }
                        else{
                            ac.register(leader,lecturer,sDate,cDate);
                            JOptionPane.showMessageDialog(frame,"Course is registered successfully");
                            }
                    }
                }else{
                    JOptionPane.showMessageDialog(frame,"Invalid courseId");
                }
            
            }
                  
        }
        
        /**
         * Register Button for non Academic course
         */
        if(e.getSource() == nonRegisterBtn){
            String id = nonCourseIdField2.getText();
            String insName = nonInstructorNameField.getText();
            String eDate = nonExamDateField.getText();
            String cLeader = nonCourseLeaderField.getText();
            String sDate = nonStartingDateField.getText();
            String cDate = nonCompletionDateField.getText();
            
            NonAcademicCourse nAc; // nAc as reference of NonAcademicCourse class.
            for(Course nonAca:list){
                if(nonAca.getcourseid().equals(id)){
                    if(nonAca instanceof NonAcademicCourse){
                        nAc =(NonAcademicCourse)nonAca;  // Downcasting as to call the method of NonAcademicCourse class
                        if(nAc.getisRegistered()== true){
                            JOptionPane.showMessageDialog(frame,"The entered Course is already registered!");
                        }
                        else{
                            nAc.register(cLeader,insName,sDate,cDate,eDate);
                            JOptionPane.showMessageDialog(frame,"Course is registered successfully");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(frame,"Invalid courseId");
                }   
            }
        }
        
        
         //For Display button(Academic Course)
         
        if(e.getSource() == displayBtn){
            AcademicCourse ac;  // Creating reference of Academic Course as ac
            for(Course rAc: list){
                if(rAc instanceof AcademicCourse){  
                    ac = (AcademicCourse)rAc; //downcasting as to call the method of Academic Course class
                    ac.display();   
                }    
            }
            
        }
        
        /**
         * For Display button(NonAcademicCourse)
         */
        if(e.getSource() == nonDisplayBtn){
            NonAcademicCourse nAc; //reference of non Academic Course as nAc
            for(Course nonA: list){
                if(nonA instanceof NonAcademicCourse){
                    nAc = (NonAcademicCourse)nonA; // downcasting as to call the method of Non Academic Course class
                    nAc.display();
                }
                
            }
            
        }
        
        /**
         * Remove button for NonAcademicCourse
         */
        if(e.getSource() == removeBtn){
            NonAcademicCourse nAc; // reference of Non Academic Course as nAc
            for(Course nonA: list){
                if(nonA instanceof NonAcademicCourse){
                    nAc = (NonAcademicCourse)nonA; // downcasting as to call the method of Non Academic Course class
                    if(nAc.getisRemoved()==true){
                        JOptionPane.showMessageDialog(frame,"The entered Course is already removed!!");
                    }
                    else{
                        nAc.remove();
                        JOptionPane.showMessageDialog(frame,"Course is removed successfully");
                    }
                }
                
            }
        }
            
        
        
          //Clear Button for Academic Course
         
        if(e.getSource() == clearBtn){
            courseIdField1.setText("");   // setting textField as "" to clear the field
            courseIdField2.setText("");
            courseNameField.setText("");
            courseLeaderField.setText("");
            durationField.setText("");
            lecturerNameField.setText("");
            levelField.setText("");
            creditField.setText("");
            startingDateField.setText("");
            completionDateField.setText("");
            noOfAssesmentField.setText("");   
        }
        
        /**
         * For ClearBtn(NonAcademicCourse)
         */
        if(e.getSource() == nonClearBtn){
            nonCourseIdField1.setText("");
            nonCourseIdField2.setText("");
            nonCourseNameField.setText("");
            nonDurationField.setText("");
            nonStartingDateField.setText("");
            nonCompletionDateField.setText("");
            nonExamDateField.setText("");
            nonPrerequisiteField.setText("");
            nonInstructorNameField.setText("");
            nonCourseLeaderField.setText("");
        }
        
    }

    public static void main(String[] args) //Main method
    {
        new INGCollege();  
    }     
}

  
 
