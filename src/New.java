public class New extends Other{
    final String[] list = {"unused", "deprecated"};
    @SuppressWarnings("unused")
    @Override
    public int sum() {
        return number / 2;
    }

    @Deprecated
    public void oldMethod() {

    }
    @Deprecated(since = "5.3", forRemoval = true)
    public void printHello2() {
        System.out.println("Hello!");
    }


    @SuppressWarnings("unused")
    public void printHello() {
        System.out.println("Hello!");
    }

    @SuppressWarnings({"all", "unused"})
    public int divide() {
        return 2 / 0;
    }

}
