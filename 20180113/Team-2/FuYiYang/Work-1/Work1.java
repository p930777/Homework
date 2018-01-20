public class Work1{
    private final String LINE1= "\t\t购物清单";
    private final String LINE2= "商品名称\t购买数量\t商品单价\t金额";
    private final String LINE3= "鳄鱼夹克\t1\t\t1900\t\t1900";
    private final String LINE4= "ipodMP4\t\t2\t\t400\t\t800";

    public static void main(String[] args){
        Work1 worker = new Work1();
        worker.printText();
    }

    public void printText(){
        System.out.println(LINE1);
        System.out.println(LINE2);
        System.out.println(LINE3);
        System.out.println(LINE4);
    }
}
