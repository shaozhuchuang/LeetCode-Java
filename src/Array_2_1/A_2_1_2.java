package Array_2_1;

public class A_2_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,1,1,2,2,3,4,4,4};
		System.out.println(removeDuplicates(nums));
		for(int i=0;i<removeDuplicates(nums);i++){
			System.out.print(nums[i]+",");
		}
		//System.out.println(removeDuplicates2(nums));
	}

	public static int removeDuplicates(int []nums){
		if(nums.length<=2)
			return nums.length;
		int index=2;
		for(int i=2;i<nums.length;i++){
			if(nums[i]!=nums[index-2])
				nums[index++]=nums[i];
		}
		return index;
	}
	
	public static int removeDuplicates2(int []nums){
		int n=nums.length;
		int index=0;
		for(int i=0;i<n;i++){
			if(i>0&&i<n-1&&nums[i]==nums[i-1]&&nums[i]==nums[i+1])//因为最多出现两次，所以选取第一次出现和最后一次出现，其余舍弃
				continue;
			nums[index++]=nums[i];
		}
		return index;
	}
}
