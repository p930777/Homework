import java.util.Scanner;

/*
 *@author  马江
 *@Time 2018-1-15 22:06
 *类名 ShoppingManagementSystem
 *说明 购物管理系统
 */
public class ShoppingManagementSystem {

	public static void main(String[] args) {
		// 登录菜单
		int login = LoginMenu();
		if (login == 1)// 登录系统
		{
			// 主菜单
			int select = MainMenu();
			switch (select) {
			case 1:
				System.out.println("客户信息管理");
				break;
			case 2:
				System.out.println("购物结算");
				break;
			case 3:				
				System.out.println("真情回馈");
			break;
			case 4:
				return;
			}

		} else if (login == 2)// 退出
		{
			return;
		}
	}

	public static int LoginMenu() {
		System.out.println("\n\t\t\t欢迎使用我行我素购物管理系统\t\n");
		System.out.println("\t\t\t\t1.登录系统\n");
		System.out.println("\t\t\t\t2.退出\n");
		// 打印* 号
		for (int i = 0; i < 38; i++) {
			if (i < 37)
				System.out.print("* ");
			else
				System.out.print("\n\n");
		}
		// 定义变量
		int input = -1;
		try {
			System.out.println("请选择，输入数字：");
			// 输入选项
			Scanner in = new Scanner(System.in);
			while ((input = in.nextInt()) != -1) {
				break;
			}
		} catch (Exception e) {
			// 异常处理
			System.out.println(e.toString());
		}
		return input;
	}

	public static int MainMenu() {
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
		int input = -1;
		try {
			System.out.println("请选择，输入数字：");
			// 输入选项
			Scanner in = new Scanner(System.in);
			while ((input = in.nextInt()) != -1) {
				break;
			}
		} catch (Exception e) {
			// 异常处理
			System.out.println(e.toString());
		}
		return input;

	}
}
