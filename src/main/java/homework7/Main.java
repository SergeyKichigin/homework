package homework7;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        try {
            ClassTester.start(Methods.class);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
