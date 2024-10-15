package sortingAlgorithm;

public class FindTheMissingNumberInArrayof1ToN {
	public static void main(String []args) {
		int nums[]= {1,3,2,4,2};
		int ans=sorted(nums);
		System.out.println(ans);
	}
	public static int sorted(int nums[]) {
		int i=0;
		while(i<nums.length) {
			int curr=nums[i]-1;
			if(nums[i]!=nums[curr]&&nums[i]<nums.length) {
				int temp=nums[i];
				nums[i]=nums[curr];
				nums[curr]=temp;
			}
			else {
				i++;
			}
		}
		return nums[nums.length-1];
	}
}
