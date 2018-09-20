package InClass09042018;

public class StairsDemo {
	public static void technique2(int numberOfStairs) {
		int down = 0;
		int up = 0;
		int marks = 0;
		int numberOfoperations = 0;
		
		for (int i = 1; i <= numberOfStairs; i++) {
			//down += i;
			for (int j= i; j>=1; j--) {
				up++;
				down ++;
			}
			
			marks++;
		}
		
		numberOfoperations = down + up + marks;
		System.out.println("Technique2\n\tNumber of operations: " + numberOfoperations);
	}
	public static void technique3(int numberOfStaris) {
//		int dow = 0;
//		int up = 0;
//		int marks = 0;
//		int numberOfoperations = 0;
//		int numberOfOp = (int)Math.f
	}
	public static void main(String[] args) {
		int numberOfStairs = 2689;
		technique2(numberOfStairs);
		technique3(numberOfStairs);
	}
}
