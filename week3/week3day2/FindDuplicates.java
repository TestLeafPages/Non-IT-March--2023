package week3day2;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] nums= {2,7,3,3,5,2,5};
		//2==7
		//2==3
		//2==3
		//to find the duplicate in the array
		// compare the values using index
		//nums[0]-->num[6]
		for(int i=0;i<=nums.length-1;i++) {//i=0 ==>2
			
			for(int j=i+1;j<=nums.length-1;j++) {	//j=1==>7			
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
				}
			}
			
			
			
		}

	}

}
