import java.util.Scanner;//导入键盘包
public class ManagementSystem
{
	public static void main(String[] args) 
	{
		char a = '*';				
		System.out.println("\n\t\t欢迎使用我行我素购物管理系统\n");
		for(int b = 0;b<60;b++) //输出60个*
		{
			System.out.print(a); 			
		}
		System.out.println("\n\n\t\t\t1.登录系统");
		System.out.println("\n\t\t\t2.退出\n");
		for(int b = 0;b<60;b++) //输出60个*
		{
			System.out.print(a); 			
		}	
		//System.out.println("\n*************************************************************************");

		Scanner input = new Scanner(System.in);//创建键盘录入对象

		System.out.println("\n请选择，输入数字：");
		int x = input.nextInt();//键盘录入数据

        if(x == 1)
        {
		    System.out.println("\n\t\t欢迎使用我行我素购物管理系统\n");
		    for(int b = 0;b<60;b++) //输出60个*
		    {
		    	System.out.print(a); 			
		    }
		    //System.out.println("\n*************************************************************************");
		    System.out.println("\n\n\t\t\t1.客户信息管理");
		    System.out.println("\n\t\t\t2.购物结算");
		    System.out.println("\n\t\t\t3.真情回馈");
		    System.out.println("\n\t\t\t4.注销\n");
		    for(int b = 0;b<60;b++) //输出60个*
		    {
		    	System.out.print(a); 			
		    }
		    //System.out.println("\n*************************************************************************");
		    System.out.println("\n请选择，输入数字：");	

		    int y = input.nextInt();//键盘录入数据

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
		    	System.out.println("输入无效 ");
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