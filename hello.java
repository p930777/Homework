import java.util.Scanner;
public class hello
{
	public static void main(String args[])
	{
		System.out.println("Hello world!");
		System.out.println("������18�꣬��");
		System.out.println("�밴���������");
		Scanner input = new Scanner(System.in);
        String val = null; //?��¼������ַ���
        do {
            System.out.print("�����룺");
            val = input.next();//?�ȴ�����ֵ
            System.out.println("��������ǣ�" + val);
        } while (!val.equals("#"));//?��������ֵ����#�ͼ�������
        System.out.println("��������\"#\"�������Ѿ��˳���");
        input.close();//?�ر���Դ
	}
}