package Array_2_1;

public class A_2_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,1,2,3,4,4};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int []nums){
		if(nums.length<=1)
			return nums.length;
		int index=0;
		for(int i=1;i<nums.length;i++){
			if(nums[index]!=nums[i])
				nums[++index]=nums[i];
		}
		return index+1;
	}
	
}
