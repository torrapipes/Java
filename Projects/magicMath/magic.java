public class magic {
	public static void main(String[] args) {
		
    int myNumber = 6;
    /* myNumber will be referenced to as the original number */
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    
    System.out.println(stepSix);
    
	}
}