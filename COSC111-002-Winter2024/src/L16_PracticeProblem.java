
public class L16_PracticeProblem {
	
	public static double calculateExamTotal(double[] questionScores)
	{
		double examTotal = 0;
		for (int question = 0; question < questionScores.length; question++)
		{
			examTotal += questionScores[question];
		}
		return examTotal;
	}


	public static double calculateTotalScore(double [][] examScores)
	// the takes in the reference to the 2D that is stored in the first dim of our 3D
	{
		double totalScore = 0;
		for (int exam = 0; exam < examScores.length; exam ++)
		{
			totalScore += calculateExamTotal(examScores[exam]);
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
		
		// Calculate and display total score for each student 
		
		for (int student = 0; student < scores.length; student++) // this will allow access to a student
		{
			double totalScore = 0;
			for (int exam = 0; exam < scores[student].length; exam ++)
			{
				for (int question = 0; question < scores[student][exam].length; question++)
				{
					totalScore += scores[student][exam][question];
				}
			}
			System.out.println("The total score for student " + student + " is " + totalScore);
		}
		
		for (int student = 0; student < scores.length; student++) // this will allow access to a student
		{
			double totalScore = calculateTotalScore(scores[student]);
			System.out.println("The total score for student " + student + " is " + totalScore);
		}
		
		

	}

}
