package recursion;

/**
 * @author xucongyan
 * 计算阶乘的代码，体现递归的特性
 * 规定：
 * ①、0！=1
 * ②、1！=1
 * ③、负数没有阶乘
 */
public class Factorial {

    /**
     * 用传统的for循环的形式
     *
     * @param n 输入数字
     * @return 阶乘结果
     */
    public static int getFactorialFor(int n) {
        int temp = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                temp = temp * i;
            }
        } else {
            return -1;
        }
        return temp;
    }

    /**
     * 用递归的形式计算阶乘
     *
     * @param n 输入数字
     * @return 阶乘结果
     */
    public static int getFactorial(int n) {
        if (n >= 0) {
            if (n == 0) {
                System.out.println(n + "!=1");
                return 1;
            } else {
                System.out.println(n);
                int temp = n * getFactorial(n - 1);
                System.out.println(n + "!=" + temp);
                return temp;
            }
        } else {
            return -1;
        }
    }
}
