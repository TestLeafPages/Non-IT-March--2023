package week3day2;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
		Arrays.sort(nums);
		
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
		}
		
		
		
	}

}
