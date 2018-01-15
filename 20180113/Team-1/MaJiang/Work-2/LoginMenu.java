/*
 *@author  马江
 *@Time 2018-1-15 21:06
 *类名 LoginMenu
 *说明 登录菜单
 */
public class LoginMenu {
	public static void main(String[] args) {
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
			while ((input = System.in.read()) != -1) {
				System.out.println((char) input);
			}
		} catch (Exception e) {
			// 异常处理
			System.out.println(e.toString());
		}
	}
}