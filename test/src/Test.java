class A {
    static final String s = "s";
    static final int i = 10;
    static {
        System.out.println("In static init block");
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(A.s);
        System.out.println(A.i);
    }
}