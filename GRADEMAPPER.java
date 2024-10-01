import java.util.*;
public class GradesMapV2
{
    private TreeMap<Student, String> students;
    private TreeMap<Integer, Student> ids;
    
    public GradesMapV2() {
       students = new TreeMap<>();
       ids = new TreeMap<>();  
   }
   public void addStudent(Student stu, String grade)
   {
      students.put(stu, grade);
      ids.put(stu.getID(), stu);
   }     
   public void removeStudent(Integer id)
   {
      Student s = ids.get(id);
      if(s == null)
        System.out.println("Student #" + id + " is not found.\n");
      else
         students.remove(s);
      
   }
   public void modifyStudent(Integer id, String grade)
   {
      Student s = ids.get(id);
      if(s == null)
        System.out.println("Student #" + id + " is not found.\n");
      else
         students.replace(s, grade);
  
   }
   public void printAllGrades()
   {
      for(Student x : students.keySet())
      {
         System.out.println(x +": " +students.get(x));
      }
      System.out.println();
   }

}
        