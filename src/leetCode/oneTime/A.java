package leetCode.oneTime;

public class A {

    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    //输入: [4,1,2,1,2]
    //输出: 4
    public static void main(String[] args) {
        int [] arg = {1,2,3,4,3,2,1};
        System.out.println(singleNumber(arg));
    }

    private static int singleNumber(int[] nums) {

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;

    }
}
