import java.util.Scanner;
public class ShoppingSystemMenu
{
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t��ӭʹ���������ع������ϵͳ\n\n");
		System.out.print("\t\t\t\t1.��¼ϵͳ\n\n");
		System.out.print("\t\t\t\t2.�˳�\n\n");
		System.out.print("****************************************************************************\n\n");
		Scanner a = new Scanner(System.in);
		System.out.print("��ѡ���������֣�\n");
		int k = a.nextInt();
		if(k==1)
		{
		System.out.print("\t\t\t��ӭʹ���������ع������ϵͳ\n\n");
		System.out.print("****************************************************************************\n\n");
		System.out.print("\t\t\t1.�ͻ���Ϣ����\n\n");
		System.out.print("\t\t\t2.�������\n\n");
		System.out.print("\t\t\t3.�������\n\n");
		System.out.print("\t\t\t4.ע��\n\n");
		System.out.print("*****************************************************************************\n");
	    
		Scanner s = new Scanner(System.in);
		System.out.print("��ѡ���������֣�\n");
		int n = s.nextInt();
		  switch(n)
		  {
		  case 1:
		   System.out.print("�ͻ���Ϣ����\n");
		  break;
		  case 2:
		   System.out.print("�������\n");
		  break;
		  case 3:
		   System.out.print("�������\n");
	      break;
		  case 4:
		   System.out.print("ע��\n");
		  break;
		  default:
		   System.out.print("��������\n");
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
		   System.out.print("��������\n");
		}


	}
}