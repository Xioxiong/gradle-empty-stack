/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
        
        Mobile m = new Mobile("iphone","white","apple");
        m.call("message","移动电话");
        
        IPhone iphone = new IPhone("iphone","white","apple");
        iphone.call("iPhone","iphone消息");
        
        AndriodMobile andriod = new AndriodMobile("andriod","white","安卓");
        andriod.call("andriod","安卓消息");
    }
}
