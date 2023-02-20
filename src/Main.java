import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        System.out.println("value = " + value);
        changeValue(value);
        System.out.println("value = " + value);
        String str = "abc";
        System.out.println("str = " + str);
        doSmth(str);
        System.out.println("str = " + str);
        Book nameBook = new Book("Quran");
        System.out.println("nameBook.getName() = " + nameBook.getName());
        changeName(nameBook);
        System.out.println("nameBook.getName() = " + nameBook.getName());
        Integer[] b = {3, 4};
        System.out.println(Arrays.toString(b));
        changeVal(b);
        System.out.println(Arrays.toString(b));
        changeV(b);
        System.out.println(Arrays.toString(b));
    }

    public static void changeValue(int v) {
        v = 22;
        System.out.println("v = " + v);
    }
    public static void doSmth(String s2) {
        s2 = "bcd";
        System.out.println("s2 = " + s2);
    }

    public static void changeName(Book b2) {
        b2.setName("Book2");
    }

    public static void changeVal(Integer[] c) {
        Integer[] v = {1, 2};
    }
    public static void changeV(Integer[] c) {
        Integer[] v = new Integer[2];
        v[1] = 99;
    }

}