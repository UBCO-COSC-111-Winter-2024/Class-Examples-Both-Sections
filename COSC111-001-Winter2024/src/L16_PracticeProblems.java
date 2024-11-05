
public class L16_PracticeProblems {
	
	//I want this method to sum up all the scores for a student
	public static double totalScoreForStudent(double [][] allExams)
	{
		double totalScore = 0;
		for (int exam = 0; exam < allExams.length; exam ++)
			totalScore += examScore(allExams[exam]);
		
		return totalScore;
	}
			
	//I want this method to total the score for a single exam....
	public static double examScore(double [] exam)
	{
		double totalScore = 0;
		for (int question = 0; question < exam.length; question++)
		{
			totalScore += exam[question];
		}
		return totalScore;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][][] scores = {
				
				{ 					//student 0
					{10.4, 11.6},	// exam 0
					{9.0, 44.3}, 	// exam 1
					{11.5, 22.2}	// exam 2
				},
				
				{ 					// student 1
					{22.4, 21.6},	// exam 0 
					{14.0, 24.3}, 	// exam 1
					{10.5, 22.2}	//exam 2
				}	
				
		};
		
		//for each student, we want to access the exam add up the scores
		
		
		
		for (int student = 0; student < scores.length; student++)
		{
			
			double totalScore=0;
			totalScore = totalScoreForStudent(scores[student]);
//			for (int exam = 0; exam < scores[student].length; exam++)
//			{
//				
////				for (int question = 0; question < scores[student][exam].length; question++)
////				{
////					totalScore += scores[student][exam][question];
////				}
//				
//				totalScore += examScore(scores[student][exam]);
//			}
			System.out.println("The total score for student " + student + " is " + totalScore);
		}
		

	}

}
