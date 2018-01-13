/*
 *@author  马江
 *@Time 2018-1-13 16:36
 *类名 MainMenu
 *说明 主菜单
 */
public class MainMenu {

	public static void main(String[] args) {
		// 打印标题
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统\t\t\t\n");
		// 打印* 号
		for (int i = 0; i < 38; i++) {
			if (i < 37)
				System.out.print("* ");
			else
				System.out.print("\n\n");
		}
		// 打印菜单
		System.out.println("\t\t\t 1. 客户信息管理\t\t\t\n");
		System.out.println("\t\t\t 2. 购物结算\t\t\t\n");
		System.out.println("\t\t\t 3. 真情回馈\t\t\t\n");
		System.out.println("\t\t\t 4. 注销\t\t\t\n");
		// 打印* 号
		for (int i = 0; i < 38; i++) {
			if (i < 37)
				System.out.print("* ");
			else
				System.out.print("\n");
		}
		// 定义变量
		int input=-1;
		try {
			System.out.println("请选择，输入数字：");
			//输入选项
			while ((input = System.in.read()) != -1) {
				System.out.println((char) input);
			}
		} catch (Exception e) {
			//异常处理
			System.out.println(e.toString());
		}
	}
}