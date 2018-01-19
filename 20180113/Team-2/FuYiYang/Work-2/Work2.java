import java.util.Scanner;


public class Work2{
    private final String LINEGAP = 
        "* * * * * * * * * * * * * * * * * * * * *\n";
    private final String WELCOME_LINE = 
        "\n\n\n\t欢迎使用我行我素购物管理系统\n";
    private final String LOGIN_1 = "\t1. 登 录 系 统\n";
    private final String LOGIN_2 = "\t2. 退 出\n";

    private final String OPTION_1 = "\t1. 客 户 信 息 管 理\n";
    private final String OPTION_2 = "\t2. 购 物 结 算\n";
    private final String OPTION_3 = "\t3. 真 情 回 馈\n";
    private final String OPTION_4 = "\t4. 注 销\n";

    private final String INPUT_TEXT = "请选择，输入数字：";

    private final String ERROR_MSG = "ERROR: Function not ready...";
    private final String EXIT_MSG = "Exiting...";

    public static void main(String[] args){
        Work2 worker = new Work2();
        worker.loginPage();

    }

    public void loginPage(){
        System.out.println(WELCOME_LINE);
        System.out.println(LOGIN_1);
        System.out.println(LOGIN_2);
        System.out.println(LINEGAP);
        int result = readNextInt();
        switch(result){
            case 1:
                option1Page();
                break;
            default:
                System.out.println(EXIT_MSG);
                System.exit(0);
        }

    }

    public void option1Page(){
        System.out.println(WELCOME_LINE);
        System.out.println(LINEGAP);
        System.out.println(OPTION_1);
        System.out.println(OPTION_2);
        System.out.println(OPTION_3);
        System.out.println(OPTION_4);
        System.out.println(LINEGAP);
        int result = readNextInt();
        switch(result){
            case 4:
                loginPage();
                break;
            default:
                System.out.println(ERROR_MSG);
                System.exit(0);
        }
    }

    private int readNextInt(){
        int selection = -1;
        System.out.print(INPUT_TEXT);
        Scanner scanner = new Scanner(System.in);
        selection = scanner.nextInt();
        return selection;
    }
}
