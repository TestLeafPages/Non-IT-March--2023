package week4day1;

import java.util.ArrayList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,3,5,2,6};
		
		List<Integer> nums=new ArrayList<Integer>();		
		System.out.println(nums);
		for(int i=0;i<arr.length;i++) {
			nums.add(arr[i]);//arr[0]=2-->nums[0]
		}		
		System.out.println(nums);
		
		List<Integer> dupnums=new ArrayList<Integer>();		
		for(int i=0;i<nums.size();i++) {
			for(int j=i+1;j<nums.size();j++) {
				if(nums.get(i)==nums.get(j)) {
					//System.out.println(nums.get(i));
					dupnums.add(nums.get(i));
				}
			}
		
		}		
		System.out.println(dupnums);

	}

}
