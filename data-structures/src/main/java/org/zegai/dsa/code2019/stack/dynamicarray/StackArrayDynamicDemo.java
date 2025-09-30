package org.zegai.dsa.code2019.stack.dynamicarray;

public class StackArrayDynamicDemo {
    public static void main(String[] args) {
        System.out.println("Stack array dynamic");

        StackArrayDynamic<Integer> stackArrayDynamic = new StackArrayDynamic<>();
        stackArrayDynamic.push(10);
        stackArrayDynamic.push(12);

        System.out.println(stackArrayDynamic.pop());
        System.out.println("size: " + stackArrayDynamic.size());
        stackArrayDynamic.push(7);

        System.out.println(stackArrayDynamic.pop());
        System.out.println(stackArrayDynamic.pop());
        System.out.println("size: " + stackArrayDynamic.size());
    }
}
