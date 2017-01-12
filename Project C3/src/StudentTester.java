
public class StudentTester 
{

	public static void main(String[] args) 
	{
		 Student Josh = new Student();
		 String user = Josh.setName("Josh");
		 String user1 = Josh.getName();
		 System.out.println("Student name set to: " + user1);
		 System.out.println("Student name: " + user);
		 Josh.addQuiz(85);
		 Josh.addQuiz(76);
		 Josh.addQuiz(90);
		 int score = Josh.getAverageScore();
		 System.out.println("Average Score is: " + score + "%");
		 int total = Josh.getTotalScore();
		 System.out.println("Total score: " + total);
		 
	}

}
