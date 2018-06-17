public class CreatGreatestNumber {
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if(nums1.length == 0)
            return nums2;
        if(nums2.length == 0)
            return nums1;
        int[] result = new int[k];
        if(nums1.length + nums2.length<k)
            return result;
        for(int i=0;i<=nums1.length;i++) {
            if(i<=nums1.length && k-i<=nums2.length)
                result = compareMax(maxMesh(maxListNumber(nums1,i),maxListNumber(nums2,k-i)),result);
        }
        return result;
    }

    public static int[] maxListNumber(int[] nums, int t) {
        if(nums.length <= t) return nums;
        int result[] = new int[t];
        if(t == 0) return result;
        else {
            int last_index = -1;
            int max_digit = 0;
            int k = t;
            while(k!=0) {
                for(int i = ++last_index ;i<=nums.length - k;i++) {
                    if(nums[i]>max_digit) {
                        max_digit = nums[i];
                        last_index = i;
                    }
                }
                result[t-k] = max_digit;
                if(--k != 0)
                max_digit = nums[last_index+1];
            }
            return result;
        }
    }

    public static int[] maxMesh(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1+len2];

        int i = 0;
        int j = 0;
        int i_temp = 0;
        int j_temp = 0;
        for(int s = len1+len2; s>0; s--) {
            if(i == len1) {
                result[i+j] = nums2[j];
                j++;
            }
            else if(j == len2) {
                result[i+j] = nums1[i];
                i++;
            }
            else {
                if(nums1[i]>nums2[j]) {
                    result[i+j] = nums1[i];
                    i++;
                }
                else if(nums1[i]<nums2[j]){
                    result[i+j] = nums2[j];
                    j++;
                }
                else{
                    i_temp = i+1;
                    j_temp = j+1;
                    if(i_temp == len1) {
                        result[i+j] = nums2[j];
                        j++;

                    }
                    else if(j_temp == len2) {
                        result[i+j] = nums1[i];
                        i++;
                    }
                    else {
                        while(i_temp<len1 && j_temp<len2) {
                            if(nums1[i_temp]<nums2[j_temp]) {
                                result[i+j] = nums2[j];
                                j++;
                                break;
                            }
                            else if(nums1[i_temp]>nums2[j_temp]) {
                                result[i+j] = nums1[i];
                                i++;
                                break;
                            }
                            else {
                                i_temp++;
                                j_temp++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static int[] compareMax(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int i = 0;
        while(i<len) {

            if(nums1[i]>nums2[i]) {
                return nums1;
            }
            else if(nums2[i]>nums1[i]) {
                return nums2;
            }
            else
                i++;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] test1 = {4,6,9,1,0,6,3,1,5,2,8,3,8,8,4,7,2,0,7,1,9,9,0,1,5,9,3,9,3,9,7,3,0,8,1,0,9,1,6,8,8,4,4,5,7,5,2,8,2,7,7,7,4,8,5,0,9,6,9,2};
        int[] test3 = {6,7};
        int[] test5 = {6,0,4};
        int[] test4 = {9,9,4,5,1,2,9,3,4,6,3,0,9,2,8,8,2,4,8,6,5,4,4,2,9,5,0,7,3,7,5,9,6,6,8,8,0,2,4,2,2,1,6,6,5,3,6,2,9,6,4,5,9,7,8,0,7,2,3};
        int[] test2 = {9,9,4,5,1,2,0,9,3,4,6,3,0,9,2,8,8,2,4,8,6,5,4,4,2,9,5,0,7,3,7,5,9,6,6,8,8,0,2,4,2,2,1,6,6,5,3,6,2,9,6,4,5,9,7,8,0,7,2,3};
        System.out.println(test1.length);
        System.out.println(test2.length);

        int[] result = maxMesh(test3,test5);

        for(int i = 0;i <result.length;i++)
            System.out.println(result[i]);
    }
}
