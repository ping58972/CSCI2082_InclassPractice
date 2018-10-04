package InClass10042018;

public class Sort {
	public static void main(String[] arges) {
		//int[] data = {3,2,5,8,9,1};
		String[] data = {"aslkd", "uhy", "wersd", "jhg", "bdr"		};
		selectionSort(data);
		print(data);
	}
	public static void print(Comparable [] data) {
		for (Comparable i : data)
			System.out.print(i+" ");
	}
	public static void selectionSort(Comparable [] list) {
		boolean notSorted = true;
		
		while(notSorted) {
			notSorted = false;
			for(int i=0; i<list.length-1; i++) {
				if(list[i].compareTo(list[i+1])>0) {
					
					Comparable tmp = list[i];
					list[i] = list[i+1];
					list[i+1] = tmp;
					notSorted = true;
				}
			}
		}
		
	}
}
