public class MathMagic {
	public static void main(String[] args) {
int myNumber = 6;
int stepOne = myNumber * myNumber;
int stepTwo = stepOne + myNumber;
int stepThree = stepTwo / myNumber;
int stepFour = stepThree + 17;
int stepFive = stepFour - myNumber;
int stepSix = stepFive / 6;
System.out.println(stepSix);
/* If you change myNumber to any other integer. 
Run the program again. 
Is the output the same? 
It’s math magic */
	}
}
