public class Client2{
   public static void main(String[] args)
   {
      GradesMapV2 tooth = new GradesMapV2();
      
      Student joe = new Student("Joe", "Johnson");
      Student sarah = new Student("Sarah", "Smith");
      Student mary = new Student("Mary", "Smith");
      Student bob = new Student("Bob", "Lee");
      Student carl = new Student("Carl", "Jones");
      Student carl2 = new Student("Carl ", "Jones");
      
      tooth.addStudent(joe, "C");
      tooth.addStudent(sarah,"A");
      tooth.addStudent(carl, "B+");
      tooth.addStudent(mary,"C-");
      tooth.addStudent(bob,"B");
      tooth.addStudent(carl2, "D+");
      
      tooth.printAllGrades();
      
      tooth.modifyStudent(mary.getID(), "B-");
      tooth.modifyStudent(999999, "C");
      tooth.printAllGrades();
      tooth.removeStudent(sarah.getID());
      tooth.removeStudent(999999);
      tooth.printAllGrades();
        
   }
}