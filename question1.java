/***********QUESTION*****************\


In an institute there are five types of courses:
Undergraduate (UG): Associated with a department only. A student will have a duration of registration (e.g. 4 years), a CGPA and number of credits earned.
Postgraduate (PG): Associated with a department (e.g. IT) and a specialization (e.g. robotics). A student
will have a duration of registration (e.g. 4 years), a CGPA, number of credits earned and a thesis area.
Dual degree undergraduate and postgraduate (UG+PG): Associated with a department (e.g. IT) and specialization (e.g. robotics). A student will have a duration of registration (e.g. 4 years), a CGPA, number of credits earned, a thesis area, and year of conformation to postgraduation (e.g. 4th year).
Doctoral (PhD): Associated with just a thesis area, number of credits earned and a period of residency (e.g. 4 years)
Dual degree postgraduate and doctoral (PG+PhD): Associated with a department (e.g. IT) and a specialization (e.g. robotics). A student will have a duration of registration (e.g. 4 years), a CGPA, number of credits earned a thesis area and a year of migration to doctoral program (e.g. 2nd year).
The minimum and maximum period of registration and credit requirements is given as follows:
Note: Refer to the pdf mailed for the table. 
Input Format:
The first input is T, the number of test cases. Thereafter, for every test case the first input is n, the number of students. The input format is different for students of different types of courses.
1. UG: The first input is the string UG, followed by roll number, name, department, period of registration, CGPA (integer) and credits earned.
2. PG: The first input is the string PG, followed by roll number, name, department, specialization, period of registration, CGPA (integer), credits earned and thesis area (string).
3. UG+PG: The first input is the string UG+PG, followed by roll number, name, department, specialization, period of registration, CGPA (integer), credits earned, thesis area (string) and year of conformation to postgraduation.
4. PhD: The first input is the string PhD, followed by roll number, name, period of registration, credits earned and thesis area (string).
5. PG+PhD: The first input is the string PG+PhD, followed by roll number, name, period of registration, CGPA (integer), credits earned, thesis area (string) and year of migration to doctoral program.
Output Format:
For every test case, first print the number of graduating students and then a variable number of lines, each line printing the roll number, name, course of study, department (if applicable), specialization (if applicable) and CGPA of a student eligible for convocation.


Input::
1
9
PhD RSI2016001 Vaibhav 2 40 Tracking
UG IIT2013037 Shiv IT 4 9 185
PG IRO2015001 Himanshu IT Robotics 2 9 70 Simulation
PhD RS113 Anup 4 90 Humanoids
PG+PhD PRO2014002 Venkat 4 8 75 Planning 2
UG IIT2014141 Abhishek IT 3 9 166
UG+PG IRM2013002 Utkarsh IT Robotics 4 10 195 robotics 4
PG IRO2015004 Naveen IT Robotics 2 8 80 RL
UG+PG IRM2013015 Shubham IT Robotics 4 9 195 SLAM 4


output::
3
IIT2013037 Shiv UG IT 9
RS113 Anup PhD
IRO2015004 Naveen PG IT Robotics 8


/**************SOLUTION*********************\







import java.util.*;//importing utilities for scanner etc.
abstract class convocation{
    /*this is the class which contains all common attributes of other classes like undergraduate ,postgraduate ,dual degree etc
		this class we are using to inherit in other classes */
		String roll;
			 String name;
			 String course;
			
		    	 convocation( String course,String roll,String name){//constructor of convocation class
				       this.roll=roll;
				       this.name=name;
				       this.course=course;
				    }
				    /*getters and setters for convocation class*/
			  public String getroll(){
			         return roll;	   
			   }
			  public String getname(){
				   return name;
			   }
		      public String getcourse(){
				  return course;
			  }
			  //abstract methods to be implemented in all inherited classes
		      abstract String getdepartment();
		      abstract String getspecialisation();
		      abstract int getcgpa();
		}
		class UG extends convocation{
		    /*this is the class containing attributes of undergraduate class 
		    all attributes are kept private and we are accessing them outside this class 
		    using getters and setters*/
		   private String department;
		   private int duration;
		   private int cgpa;
		   private int credits;
		
		   UG( String course,String roll,String name,String department,int duration,int cgpa,int credits){
			//constructor for students of undergraduate category
				super(course,roll,name);
				
				this.department=department;
				this.duration=duration;
				this.cgpa=cgpa;
				this.credits=credits;
				}
			 public String getdepartment(){//to get department
				   return department;
			   }
			   public int getduration(){//to get duration
				   return duration;
			   }
			   public int getcgpa(){//to get cgpa of student
				   return cgpa;
			   }
			   public int getcredits(){//to get credits  
				   return credits;
			   }
			  public String getspecialisation(){//to get specialisation
				  String s="";
				  return s;
			  }
		}
	  class PG extends convocation{
	       /*this is the class containing attributes of postgraduate class 
		    all attributes are kept private and we are accessing them outside this class 
		    using getters and setters*/
			private String department;
			private int duration;
			private  int cgpa;
			private int credits;
			private String specialisation;
			private String thesis;
		
			 PG ( String course,String roll, String name, String department,String specialisation,int duration,int cgpa,int credits,String thesis){
 
				super(course,roll,name);
				this.department=department;
				this.cgpa=cgpa;
				this.duration=duration;
				this.specialisation=specialisation;
				this.credits=credits;
				this.thesis=thesis;
				}
		 public String getdepartment(){
			   return department;
		   }
		   public int getduration(){
			   return duration;
		   }
		   public int getcgpa(){
			   return cgpa;
		   }
		   public int getcredits(){
			   return credits;
		   }
		public String getspecialisation(){
				return specialisation;
			}
			public String getthesis(){
				return thesis;
			}
	}
	   class UG_PG extends convocation{
	       /*this is the class containing attributes of UG+PG class 
		    all attributes are kept private and we are accessing them outside this class 
		    using getters and setters*/
			private String department;
			private int duration;
			private  int cgpa;
			private int credits;
			private String specialisation;
			private String thesis;
			private int year;
			
		 UG_PG( String course,String roll, String name, String department,String specialisation, int duration, int cgpa, int credits,String thesis,int year){
				super(course,roll,name);
				this.department=department;
				this.cgpa=cgpa;
				this.duration=duration;
				this.specialisation=specialisation;
				this.credits=credits;
				this.thesis=thesis;
				this.year=year;
				}
			 public String getdepartment(){
				   return department;
			   }
			   public int getduration(){
				   return duration;
			   }
			   public int getcgpa(){
				   return cgpa;
			   }
			   public int getcredits(){
				   return credits;
			   }
			public String getspecialisation(){
					return specialisation;
				}
				public String getthesis(){
					return thesis;
				}
				public int getyear(){
					return year;
				}
		}
	   class PhD extends convocation{
	       /*this is the class containing attributes of PhD class 
		    all attributes are kept private and we are accessing them outside this class 
		    using getters and setters*/
			private String course;
			private   String roll;
			private String name;
			private  int period;
			private  int credits;
			private String thesis;
			
			 PhD(String course,String roll,String name,int period,int credits,String thesis){//constructor
				super(course,roll,name);
				  this.period=period;
				  this.credits=credits;
				  this.thesis=thesis;
			   }
			   
			   //getter and setter
			 public String getspecialisation(){
				  String s="";
				  return s;
			  }
			public int getcgpa(){
				 return 0;
			 }
			   public int getperiod(){
				   return period;
			   }
			   public int getcredits(){
				   return credits;
			   }
			   public String getthesis(){
				   return thesis;
			 	}
			   public String getdepartment(){
				   String sr="";
				   return sr;
			   }
	   }
	   class PG_PhD extends convocation{ /*this is the class containing attributes of PG+PhD class 
		    all attributes are kept private and we are accessing them outside this class 
		    using getters and setters*/
			private String course;
			private   String roll;
			private String name;
			private  int period;
			private  int credits;
			private String thesis;
			private int cgpa;
			private int year;
			
		PG_PhD(String course,String roll, String name, int period,int cgpa, int credits, String thesis,int year) {
				super(course,roll,name);
				this.period=period;
				  this.credits=credits;
				  this.thesis=thesis;
				this.cgpa=cgpa;
				this.year=year;
				}
				
				/*getters and setters for PG_PhD class*/
		public String getspecialisation(){
			  String s="";
			  return s;
		  }
			   public int getperiod(){
				   return period;
			   }
			   public int getcredits(){
				   return credits;
			   }
			   public String getthesis(){
				   return thesis;
			   }
			   public int getyear(){
		    		return year;
		    	}
		    	public int getcgpa(){
		    		return cgpa;
		    	}
		    	public String getdepartment(){
					   String sr="";
					   return sr;
				   }
	   }
	   public class TestClass {
	  public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			 int t=s.nextInt();//testcases
 
	       for(int i=0;i<t;i++){
	    	   convocation c[]=new convocation[300];
	    	    convocation d[]=new convocation[300];
	       	 int ct=0;
	        	 int n=s.nextInt();
	       	 for(int j=0;j<n;j++){
	       		String str=s.next();
	   		 if(str.equals("UG")){
	   			 String roll=s.next();
	   			 String name=s.next();
	   			 String department=s.next();
	   			 int duration=s.nextInt();
	   			 int cgpa=s.nextInt();
	   			 int credits=s.nextInt();
	   			 String ss="UG";
	   			 d[j]=new UG(ss,roll, name,department,duration,cgpa,credits);//all students are stored in array 'd' of convocation type
	   			if(duration>=4 && duration<=7 && credits>=185){
	   			 c[ct]=new UG(ss,roll, name,department,duration,cgpa,credits);//only eliguble students are stored in array 'c' of convocation type
	   			 ct++;
	   			}
	   		 }
	   		 
	   		 if(str.equals("PG")){
				 String roll=s.next();
				 String name=s.next();
				 String department=s.next();
				 String specialisation=s.next();
				 int duration=s.nextInt();
				 int cgpa=s.nextInt();
				 int credits=s.nextInt();
				 String thesis=s.next();
				 String ss="PG";
				 d[j]=new PG(ss,roll, name,department,specialisation,duration,cgpa,credits,thesis);//all students are stored in array 'd' of convocation type
			if(duration >=2 && duration<=4 && credits >= 80){
				c[ct]=new PG(ss,roll, name,department,specialisation,duration,cgpa,credits,thesis);//only eliguble students are stored in array 'c' of convocation type
                ct++;
				 }
			 }
	       	 if(str.equals("UG+PG")){
			     String roll=s.next();
			     String name=s.next();
			     String department=s.next();
			      String specialisation=s.next();
				 int period=s.nextInt();
				 int cgpa=s.nextInt();
				 int credits=s.nextInt();
				 String thesis=s.next();
				 int year=s.nextInt();
				  String ss="UG+PG";
				  d[j]=new UG_PG(ss,roll, name,department,specialisation,period,cgpa,credits,thesis,year);//all students are stored in array 'd' of convocation type
				  if(period>=5 && period<=8 && credits >= 265){
				   c[ct]=new UG_PG(ss,roll, name,department,specialisation,period,cgpa,credits,thesis,year);//only eliguble students are stored in array 'c' of convocation type
				  ct++;
			     }
	       	 } 
	   		if(str.equals("PhD")){
			     String roll=s.next();
			     String name=s.next();
				 int period=s.nextInt();
				 int credits=s.nextInt();
				 String thesis=s.next();
				 String ss="PhD";
				 d[j]=new PhD(ss,roll,name,period,credits,thesis);
				 if(period>=2 && period<=6 && credits >= 64){
				c[ct]=new PhD(ss,roll,name,period,credits,thesis);
				ct++;
			    }
	   		}
	   	 if(str.equals("PG+PhD")){
		     String roll=s.next();
		     String name=s.next();
			 int period=s.nextInt();
			 int cgpa=s.nextInt();
			 int credits=s.nextInt();
			 String thesis=s.next();
			 int year=s.nextInt();
			 String ss="PG+PhD";
			d[j]=new PG_PhD(ss,roll,name,period,cgpa,credits,thesis,year);
			 if(period >=4 && period<=7 && credits >= 138 ){
				 c[ct]=new PG_PhD(ss,roll,name,period,cgpa,credits,thesis,year);
					ct++;
		      }
	       }
	    }
	    
	    //print as specified in question 
	   	 System.out.println(ct); 
	   	 for(int ji=0;ji<ct;ji++){
	   		System.out.print(c[ji].getroll()+" "+c[ji].getname()+" "+c[ji].getcourse());
	   		if(c[ji].getdepartment().equals(""));
            else System.out.print(" "+c[ji].getdepartment());
	   	  if(c[ji].getspecialisation().equals(""));
          else  System.out.print(" "+c[ji].getspecialisation());
   if(c[ji].getcgpa() != 0 )
        System.out.print(" "+c[ji].getcgpa());
	System.out.println();
	      	 
	      }
		}
 
	      
	  }
 
}
