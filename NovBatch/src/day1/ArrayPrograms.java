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

	
	public static void FindDuplicate() {
		 int[] arr = {1, 5, 2, 3, 5, 1, 7, 2, 9};
		 System.out.print("Duplicate ELement is:" );
		 for (int i = 0; i < arr.length; i++) {
			 for (int k = i+1; k < arr.length; k++) {
				 if (arr[i]==arr[k]) {
					 
					 System.out.print(arr[i] +", ");
					 
			}	
				
			 }
		 }
	}
		 public static void m1(String name) 
		 {
			 int size=name.length()-1;
			 for(int i=size;i>=0;i--)
			 {
				 System.out.println(name.charAt(i));
			 }
		 
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeElement();
		FindDuplicate();
		System.out.println("Hello World");

	}

}
