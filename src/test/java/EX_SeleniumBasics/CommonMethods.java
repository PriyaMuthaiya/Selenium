package EX_SeleniumBasics;

public class CommonMethods {
    public static void JVMwait(int sec){
        try{
        Thread.sleep(sec);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
