import java.util.Scanner;
public class hello
{
	public static void main(String args[])
	{
		System.out.println("Hello world!");
		System.out.println("张三，18岁，男");
		System.out.println("请按任意键继续");
		Scanner input = new Scanner(System.in);
        String val = null; //?记录输入的字符串
        do {
            System.out.print("请输入：");
            val = input.next();//?等待输入值
            System.out.println("您输入的是：" + val);
        } while (!val.equals("#"));//?如果输入的值不是#就继续输入
        System.out.println("你输入了\"#\"，程序已经退出！");
        input.close();//?关闭资源
	}
}