/**
 * 
 * @author 532847
 *
 */
public class Student 
{
	private int total;
	private String name;
	private int tests;
	
	public Student()
	{
		total = 0;
		tests = 0;
		name = "";
	}
	
	public String setName(String n)
	{
		return name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addQuiz(int score)
	{
		total += score;
		tests += 1;
	}
	
	public int getTotalScore()
	{
		return total;
	}
	
	public int getAverageScore()
	{
		int average = total / tests;
		return average;
	}
}
