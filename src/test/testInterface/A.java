package test.testInterface;

/**
 * @Description: 测试接口作为形参
 * @Date: 2021/10/21
 * @Author: Everglow
 */
public class A {
    private TestInterface test;

    public A(TestInterface test) {
        this.test = test;
        doSth();
    }
    public void doSth(){
        test.systemStr("This is a message!");
    }

}
