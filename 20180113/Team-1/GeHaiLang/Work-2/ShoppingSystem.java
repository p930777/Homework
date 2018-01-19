import java.util.Scanner;
public class ShoppingSystem {
	public static void main(String[] args) throws Exception {

		System.out.print("\n\n");
		System.out.print("\t\t\t欢迎使用我行我素购物系统\n\n");
		System.out.print("\t\t\t   1. 登入系统\n");
		System.out.print("\t\t\t   2. 退出\n");
		System.out.print("\t\t\t 请出入：");
		Scanner sc = new Scanner(System.in); 
        int select = sc.nextInt();

		while(select != 1)
		{	
			if (select == 2) {
				System.exit(0);
			}
			System.out.print("\t\t\t 请出入：");
            select = sc.nextInt();
		}


		System.out.print("\n\n");
		System.out.print("\t\t\t欢迎使用我行我素购物系统\n\n");
		System.out.print("****************************************************\n");
		System.out.print("\t\t\t   1. 客户信息管理\n");
		System.out.print("\t\t\t   2. 购物结算\n");
		System.out.print("\t\t\t   3. 真情回馈\n");
		System.out.print("\t\t\t   4. 注销\n");
		System.out.print("****************************************************\n");

	}
}