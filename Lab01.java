// Your name here: Taranveer Singh

package Main;

public class Lab01{
	public static void main(String[] args){
		// TESTER: DO NOT MODIFY!!!
		int[] a = {2,5,3,4,9,8,6,7,1,0};
		int[] b = {5,4,6,3,7,2,8,-1,1,9};
		Lab01 lab = new Lab01(a);			// Declare and initialize class object
		p(lab.getSize());					// Should return 10
		p(lab.getElement(0));				// Should return 2
		p(lab.getMax());					// Should return 9
		p(lab.getSum());					// Should return 45
		p(Lab01.getStaticMin(b));			// Should return -1
		// END OF TEST!!!
	}
	// HELPER METHOD FOR TEST: DO NOT MODIFY!!!
	public static <E> void p(E item){
		System.out.println(item);
	}

	// Fields below here...
	private int[] data;

	// Constructor below here...
	public Lab01(int[] array){
		if (array == null) {
			this.data = new int[0];
		} else{
			this.data = array;
		}
	}

	// Methods below here...
	public int getSize(){
		return data.length;
	}

	public int getElement(int index){
		return data[index];
	}

	public int getMax(){
		if (data.length == 0) return -1;
		int max = data[0];
		for (int i : data) if (i > max) max = i;
		return max;
	}

	public int getSum(){
		int sum = 0;
		for (int value : data){
			sum += value;
		}
		return sum;
	}

	public static int getStaticMin(int[] arr){
		if(arr == null || arr.length == 0){
			return -1;
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++){
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
