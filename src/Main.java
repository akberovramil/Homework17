import java.util.*;

public class Main {
    public static void main(String[] args) {
        Products bananas = new Products("������", 12.0, 3.0);
        Products potatoes = new Products("������", 2.0, 8.0);
        HashSet<Products> products = new HashSet<>();
        products.add(bananas);
        products.add(potatoes);
        products.add(potatoes);
        System.out.println(products.toString());
        Recipes saladOfHell = new Recipes(products, 14.0, "������ �����");
        System.out.println(saladOfHell.toString());
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(16);
        integers.add(17);
        integers.add(18);
        integers.add(19);
        integers.add(20);
        integers.add(21);

        integers.removeIf(n ->(n % 2 == 0));
        System.out.println(integers);
        System.out.println("������ ��� ������� ���������");

        HashSet<String> tasks = new HashSet<>(15);
        tasks.add("8 * 7");
        tasks.add("8 * 5");
        tasks.add("1 * 5");
        tasks.add("4 * 9");
        tasks.add("9 * 9");
        tasks.add("8 * 6");
        tasks.add("8 * 3");
        tasks.add("4 * 7");
        tasks.add("4 * 5");
        tasks.add("1 * 4");
        tasks.add("8 * 9");
        tasks.add("8 * 8");
        tasks.add("5 * 8");
        tasks.add("3 * 7");
        tasks.add("5 * 7");
        tasks.add("5 * 5");





    }







}
