

public class Sorting {
	
	public static void  sortBubble(int[] list){
		// for each element in my list
		// compare it to all the others to the right (higher index)
		//if the line on the right is larger, swap values
		
		for( int i=0; i<list.length-1; i++)  /// first to next to last
			for (int j=i+1; j<list.length; j++)
				if (list[i] > list[j]) {
					int temp = list[i];
					list[i]=list[j];
					list[j] = temp;
					
				}
		return;
	}

	public static void sortSelection(int[] list) {
		// TODO Auto-generated method stub
		
	}

}