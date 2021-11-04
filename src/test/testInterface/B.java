package test.testInterface;

/**
 * @Description:
 * @Date: 2021/10/21
 * @Author: Everglow
 */
public class B implements TestInterface{
    public static void main(String[] args) {
        new A(new B());
    }
    @Override
    public void systemStr(String str) {
        System.out.println(str);
    }
}
