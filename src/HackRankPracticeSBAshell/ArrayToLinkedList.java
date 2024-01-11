package HackRankPracticeSBAshell;

import java.util.LinkedList;

public class ArrayToLinkedList implements MyLinkList {


    LinkedList<String> ArrayToList;
    LinkedList<String> reverseList;

    @Override
    public void convert(String[] a) {
        // TODO Auto-generated method stub
        ArrayToList = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            ArrayToList.add(a[i]);
            System.out.printf("I have aded the String:%s at the node:%d\n", a[i], i);
        }
        System.out.println("Original Linked List Order");
        for (int i = 0; i < ArrayToList.size(); i++) {
            System.out.printf("%d element=%s\n", i, ArrayToList.get(i));
        }
    }


    @Override
    public void replace(int idx) {

        String str = ArrayToList.get(idx);
        ArrayToList.remove(idx);
        ArrayToList.add(idx, null);
        System.out.printf("I have replace the string: %s with the null String\n", str);

    }

    @Override
    public LinkedList<String> compact() {
        for (int i = 0; i < ArrayToList.size(); i++) {
            if (ArrayToList.get(i) == null) {
                ArrayToList.remove(i);
            }
        }
        return ArrayToList;
    }

    @Override
    public void displayList() {
        System.out.println("Reversed Linked List order");
        for (int i = 0; i < reverseList.size(); i++) {
            System.out.printf("%d element =%s\n", i, reverseList.get(i));
        }

    }

    @Override
    public void reverseLinkedList() {
        // TODO Auto-generated method stub
        reverseList = new LinkedList<>();
        for (int i = reverseList.size() - 1; i >= 0; i--) {
            reverseList.add(ArrayToList.get(i));
            System.out.printf("I have added the string:%s at the node:%s at the node:%d\n", ArrayToList.get(i), i);
        }
    }


}

