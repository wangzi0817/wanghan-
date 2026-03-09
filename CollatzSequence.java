/**
 * CollatzSequence.java
 * 实现Collatz猜想序列生成
 * 从数字n开始，序列中的下一个数字如果n是偶数，则为n/2；若n为奇数，则为3n+1
 * 序列在达到1时结束
 */
public class CollatzSequence {

    /**
     * 主方法，用于测试Collatz序列生成
     * 
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        // 导入Scanner类用于用户输入
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("请输入一个正整数作为Collatz序列的起始值：");

        // 读取用户输入
        int n = scanner.nextInt();

        // 生成并打印序列
        System.out.println("Collatz序列从 " + n + " 开始：");
        generateSequence(n);

        // 计算并打印序列长度
        int length = getSequenceLength(n);
        System.out.println("该序列的长度为：" + length);

        // 关闭scanner
        scanner.close();
    }

    /**
     * 生成并打印Collatz序列
     * 
     * @param n 初始数字
     */
    public static void generateSequence(int n) {
        // 检查输入值是否为正整数
        if (n <= 0) {
            System.out.println("错误：输入必须是正整数");
            return;
        }

        // 打印初始值
        System.out.print(n);

        // 生成序列直到达到1
        while (n != 1) {
            // 根据n的奇偶性计算下一个数字
            if (n % 2 == 0) {
                // 偶数：n/2
                n = n / 2;
            } else {
                // 奇数：3n+1
                n = 3 * n + 1;
            }
            // 打印下一个数字
            System.out.print(" -> " + n);
        }

        System.out.println(); // 换行
    }

    /**
     * 计算Collatz序列的长度
     * 
     * @param n 初始数字
     * @return 序列的长度（包含初始值和1）
     */
    public static int getSequenceLength(int n) {
        // 检查输入值是否为正整数
        if (n <= 0) {
            return 0;
        }

        int length = 1; // 初始值计入长度

        // 生成序列直到达到1
        while (n != 1) {
            // 根据n的奇偶性计算下一个数字
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }

        return length;
    }
}