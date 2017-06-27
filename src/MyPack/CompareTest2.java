package MyPack;
import java.util.*;

class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	   
	   public String toString() {
		   return getFname();
	   }
	}

	//Complete the code
	public class CompareTest2
	{
	   public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      
	      Collections.sort(studentList, new Checker1());
	      
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	   }
	}
	
	class Checker1 implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			if(s1.getCgpa() == s2.getCgpa()) {
				System.out.println(s1.getFname() + ":" + s2.getFname());
				if(s1.getFname().equals(s2.getFname())) {
					System.out.println("not coing");
					if(s1.getId() == s2.getId()) {
						return 0;
					}
					if(s1.getId() > s2.getId()) {
						return 1;
					}
					if(s1.getId() < s2.getId()) {
						return -1;
					}
				}
				System.out.println("coming");
				return s1.getFname().compareTo(s2.getFname());
				
			}
			if(s1.getCgpa() > s2.getCgpa()) return -1;
			if(s1.getCgpa() < s2.getCgpa()) return 1;
			
			return 0;
		}
	}