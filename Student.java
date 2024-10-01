public class Student implements Comparable
{
	private String myFirst;
	private String myLast;
	private Integer myID;
	
	public Student(String first, String last)
	{
		myFirst = first;
		myLast = last;
		myID = (int)(Math.random() * 90000) + 10000;
	}
	
	public int compareTo(Object other)
	{
      Student temp = (Student)other;
      if(myLast.equals(temp.myLast))
         return myFirst.compareTo(temp.myFirst);
      else 
         return myLast.compareTo(temp.myLast);
   }
	
	public Integer getID()
	{
		return myID;
	}
	
	public String toString()
	{
		return myLast + ", " + myFirst + " #" + myID;
	}
	
}