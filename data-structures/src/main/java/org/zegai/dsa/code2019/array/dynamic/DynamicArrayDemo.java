package org.zegai.dsa.code2019.array.dynamic;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> data = new DynamicArray();
        data.add(10);
        data.add(20);
        System.out.println("Size: " + data.size() + ", length: " + data.length());
        data.add(3);
        data.add(7);
        System.out.println("Size: " + data.size() + ", length: " + data.length());

        for(int i = 0; i < data.size(); i++)
            System.out.print(data.get(i) + "\t");
        System.out.println();

        data.remove(0);
        data.remove(0);
        data.remove(0);
        data.remove(0);
        System.out.println("Size: " + data.size() + ", length: " + data.length());

        data.add(5);
        System.out.println("Size: " + data.size() + ", length: " + data.length());

        data.remove(0);
        System.out.println("Size: " + data.size() + ", length: " + data.length());

        data.add(5);
        data.add(5);
        System.out.println("Size: " + data.size() + ", length: " + data.length());
    }
}
