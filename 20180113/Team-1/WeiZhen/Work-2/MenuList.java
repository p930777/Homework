/**
 * 
 * @author tdsales-10
 *
 */
import java.util.Scanner;
//@SuppressWarnings("unused")
public class MenuList {
	private static Scanner sc;
	public static void main(String[] args) {
		MenuList.showMenu();
		sc = extracted();
		int choice = sc.nextInt();
		if(choice != 1) {
			System.out.println("您选择的不对，程序推出");
		} else {
			String name = "admin";
			String pwd = "admin";
			boolean b = MenuList.loginOk(name, pwd);
	         if(b == true) {
	        	 MenuList.showMenu1();
	         }
		}
		 
		//MenuList.showMenu();
	}
	/**
	 *@登陆画面
	 * @param userName 用户名
	 * @param password 密码
	 * @return 是否登陆成功  true:成功。 false: 失败 
	 */
    public static boolean loginOk(String userName, String password) {
        boolean b = false;
        for (int i = 0; i <3; i++) {
            System.out.println("请输入用户名");
            String name = extracted().nextLine();
            System.out.println("请输入密码");
            String pwd = extracted().nextLine();
            if (name.equals(userName) && pwd.equals(password)) {
                System.out.println("登陆成功");
                b=true;
                break;
            } else {
                System.out.println("登陆失败，您还有 " + (2-i) + "次机会");
               	b = false;
            }
        }
        return b;
    }
    /**
     * 输入流
     * @return
     */
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	/**
	 * show LOGIN MENU
	 */
	public static void showMenu() {
		System.out.println("\t欢迎使用我行我素管理收银系统"+'\n');
		int i = 0;
		while(i <38) {
			i++;
			System.out.print("*");
		}
		System.out.println();
		System.out.println('\t' + "1.登陆系统"+'\n');
		System.out.println('\t' + "2.退出"+'\n');
		for(int j = 38;j > 0; j-- ) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("请选择输入数字：");
	}
	/**
	 * show 欢迎使用我行我素管理收银系统
	 */
	public static void showMenu1() {
		System.out.println("\t欢迎使用我行我素管理收银系统"+'\n');
		int i = 0;
		while(i <38) {
			i++;
			System.out.print("*");
		}
		System.out.println();
		System.out.println('\t' + "1.客户信息管理"+'\n');
		System.out.println('\t' + "2.购物结算"+'\n');
		System.out.println('\t' + "3.真情回馈"+'\n');
		System.out.println('\t' + "4.注销"+'\n');
		for(int j = 0;j < 38; j++ ) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("请选择输入数字：");
	}
}
