package homework7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ClassTester {
    public static void start(Class<?> c) throws InvocationTargetException, IllegalAccessException {
        Method before = null;
        Method after = null;
        Method[] methods = c.getDeclaredMethods();
        List<Method> list = new ArrayList<>();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                int p = m.getAnnotation(Test.class).priority();
                if (p < 1 || p > 10) throw new RuntimeException("Priority must be in the range 1 to 10");
                list.add(m);
            } else if (m.isAnnotationPresent(BeforeSuite.class)) {
                if (before != null) throw new RuntimeException("BeforeSuite can be only one");
                before = m;
            } else if (m.isAnnotationPresent(AfterSuite.class)) {
                if (after != null) throw new RuntimeException("AfterSuite can be only one");
                after = m;
            }
        }
        list.sort((m1, m2) -> m2.getAnnotation(Test.class).priority() - m1.getAnnotation(Test.class).priority());
        if (before != null) list.add(0, before);
        if (after != null) list.add(after);
        for (Method m : list) {
            m.invoke(null);
        }
    }
}