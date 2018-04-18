package Calculater;

public class Calculater {

	/* Constructor */
	public Calculater(){
		
	}
	
	/* Calculate the Euclid Similarity Score */
	public static double calcEuclidSimilarityScore(Users userA, Users userB){
		double euclidDistance = Calculater.calcEuclidDistance(userA, userB);
		return 1 / (euclidDistance + 1);
	}
	
	/* Calculate the Euclid distance */
	public static double calcEuclidDistance(Users userA, Users userB){
		// The number of books user evaluated
		int bookNum = userA.getNum();
		// If the number of books is different in these two users, out the error
		if(bookNum != userB.getNum()) System.err.println("The number of books is different in two users.");
		// Prepare a variable for calculating
		double tempSum = 0.0;
		// Process of calculation: Add the ([Evaluation for book i by user A] - [Evaluation for book i by user B])^2 to the variable tempSum
		for(int i = 0; i < bookNum; i++) tempSum += Math.pow(userA.getEval2(i) - userB.getEval2(i), 2);
		return Math.sqrt(tempSum);
	}
	
}
