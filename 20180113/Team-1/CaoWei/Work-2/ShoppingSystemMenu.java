import java.util.Scanner;
public class ShoppingSystemMenu
{
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t欢迎使用我行我素购物管理系统\n\n");
		System.out.print("\t\t\t\t1.登录系统\n\n");
		System.out.print("\t\t\t\t2.退出\n\n");
		System.out.print("****************************************************************************\n\n");
		Scanner a = new Scanner(System.in);
		System.out.print("请选择，输入数字：\n");
		int k = a.nextInt();
		if(k==1)
		{
		System.out.print("\t\t\t欢迎使用我行我素购物管理系统\n\n");
		System.out.print("****************************************************************************\n\n");
		System.out.print("\t\t\t1.客户信息管理\n\n");
		System.out.print("\t\t\t2.购物结算\n\n");
		System.out.print("\t\t\t3.真情回馈\n\n");
		System.out.print("\t\t\t4.注销\n\n");
		System.out.print("*****************************************************************************\n");
	    
		Scanner s = new Scanner(System.in);
		System.out.print("请选择，输入数字：\n");
		int n = s.nextInt();
		  switch(n)
		  {
		  case 1:
		   System.out.print("客户信息管理\n");
		  break;
		  case 2:
		   System.out.print("购物结算\n");
		  break;
		  case 3:
		   System.out.print("真情回馈\n");
	      break;
		  case 4:
		   System.out.print("注销\n");
		  break;
		  default:
		   System.out.print("输入有误\n");
		  break;
		  }
		return;
	    } 
		if(k==2)
		{
			return;
		}
	    else 
	    {
		   System.out.print("输入有误\n");
		}


	}
}