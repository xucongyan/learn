package recursion;

/**
 * @author xucongyan
 * 汉诺塔的问题，采用递归的思想进行解决
 * 有多少个盘子，我们都将其看做只有两个盘子。假设有 N 个盘子在塔座A上，我们将其看为两个盘子，其中(N-1)~1个盘子看成是一个盘子，最下面第N个盘子看成是一个盘子，那么解决办法为：
 * ①、先将A塔座的第(N-1)~1个盘子看成是一个盘子，放到中介塔座B上，然后将第N个盘子放到目标塔座C上。
 * ②、然后A塔座为空，看成是中介塔座，B塔座这时候有N-1个盘子，将第(N-2)~1个盘子看成是一个盘子，放到中介塔座A上，然后将B塔座的第(N-1)号盘子放到目标塔座C上。
 * ③、这时候A塔座上有(N-2)个盘子，B塔座为空，又将B塔座视为中介塔座，重复①，②步骤，直到所有盘子都放到目标塔座C上结束。
 */
public class HanNuoTa {

    /**
     * 汉诺塔问题的解决方案
     *
     * @param dish 盘子的个数
     * @param from 初始塔座
     * @param temp 中间塔座
     * @param to   目标塔座
     */
    public static void move(int dish, String from, String temp, String to) {
        if (dish == 1) {
            System.out.println("将盘子" + dish + "从塔座" + from + "移动到目标塔座" + to);
        } else {
            move(dish - 1, from, to, temp);//A为初始塔座，B为目标塔座，C为中介塔座
            System.out.println("将盘子" + dish + "从塔座" + from + "移动到目标塔座" + to);
            move(dish - 1, temp, from, to);//B为初始塔座，C为目标塔座，A为中介塔座
        }
    }
}


