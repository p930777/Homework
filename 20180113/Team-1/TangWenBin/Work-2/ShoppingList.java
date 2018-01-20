import java.util.Scanner;
public class ShoppingList
{
	public static void main(String[] args) 
	{
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\n\t\t\t1.登录系统");
		System.out.println("\n\t\t\t2.退出");
		System.out.println("\n*************************************************************************");

		Scanner sc = new Scanner(System.in);

		System.out.println("\n请选择，输入数字：");
		int x = sc.nextInt();

        if(x == 1)
        {
		    System.out.println("\n\t\t欢迎使用我行我素购物管理系统");
		    System.out.println("\n*************************************************************************");
		    System.out.println("\n\t\t\t1.客户信息管理");
		    System.out.println("\n\t\t\t2.购物结算");
		    System.out.println("\n\t\t\t3.真情回馈");
		    System.out.println("\n\t\t\t4.注销");
		    System.out.println("\n*************************************************************************");
		    System.out.println("\n请选择，输入数字：");	

		    int y = sc.nextInt();

		    if(y == 1)
		    {
		    	System.out.println("客户信息管理");		    
		    }
		    else if(y == 2)
		    {
		    	System.out.println("购物结算");
		    }
		    else if(y == 3)
		    {
		    	System.out.println("真情回馈");		    	
		    }
		    else if(y == 4)
		    {
		    	System.out.println("注销");
		    }
		    else
		    {
		    	System.out.println("输入无效");

		    }

        }
       else if(x == 2)
        {
        	System.out.println("退出");
        }
        else
        {
        	System.out.println("输入无效");
        }
	}
}