package homework7;

public class Methods {

    @Test(priority = 1)
    public static void method1() {
        System.out.println("Method 1");
    }

    public static void method2() {
        System.out.println("Method 2");
    }

    @Test(priority = 3)
    public static void method3() {
        System.out.println("Method 3");
    }

    @AfterSuite
    public static void method4() {
        System.out.println("AfterSuite");
    }

    @Test(priority = 5)
    public static void method5() {
        System.out.println("Method 5");
    }

    public static void method6() {
        System.out.println("Method 6");
    }

    @Test(priority = 7)
    public static void method7() {
        System.out.println("Method 7");
    }

    @Test(priority = 8)
    public static void method8() {
        System.out.println("Method 8");
    }

    @BeforeSuite
    public static void method9() {
        System.out.println("BeforeSuite");
    }

    public static void method10() {
        System.out.println("Method 10");
    }
}
