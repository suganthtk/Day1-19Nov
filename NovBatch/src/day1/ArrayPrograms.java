package day1;

public class ArrayPrograms {
	
	
	public static void  removeElement() {
		
		int a []= {5,10,15,20,25};
		int size = a.length;
		System.out.println("Array size:"+size);
		
		for (int array : a) {
			System.out.print(array+" ");
			
		}

		
		int newArray[]= new int[size-1];
		
		for (int i = 0; i <size-1; i++) {
			newArray[i]= a[i];
			
		}
		System.out.println();
		
		for (int arr : newArray) {
			System.out.print(arr+" ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeElement();

	}

}
