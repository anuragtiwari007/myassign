package MyMainClassClient;

import Addition.AdditionService;
import Division.DivisionService;
import EvenOdd.EvenOddService;
import Multiplication.MultiplicationService;
import Subtraction.SubtractionService;

public class MyClassClient {
	public static void main(String args[]) {
		// addition
		AdditionService addition = new AdditionService();
		int resultadd = addition.AddShow(12, 4);

		System.out.println("add  " + resultadd);

		// subtraction
		SubtractionService substraction = new SubtractionService();
		int resultsub = substraction.SubShow(12, 4);
		System.out.println("sub  " + resultsub);

		// division
		DivisionService division = new DivisionService();
		int resultdiv = division.DivShow(12, 4);

		// multiplication
		System.out.println("div  " + resultdiv);
		MultiplicationService multiplication = new MultiplicationService();
		int resultmul = multiplication.MulShow(12, 4);
		System.out.println("mul " + resultmul);

		// even odd
		EvenOddService evenOddService = new EvenOddService();
		evenOddService.evenoddshow(11);
	}

}
