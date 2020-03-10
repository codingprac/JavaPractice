package d3.ctci.ds.linkedlist;

import d3.ctci.model.LinkedListNode;

public class KthToLastElement {

    private static LinkedListNode kthToLastElement(LinkedListNode head, int k) {
        Index idx = new Index();
        return kthToLastElement(head, k, idx);
    }

    private static LinkedListNode kthToLastElement(LinkedListNode head, int k, Index idx) {
        if(head == null) {
            return null;
        }

         LinkedListNode node = kthToLastElement(head.next, k, idx);
        idx.value = idx.value + 1;
        if(idx.value == k){
            return head;
        }
        return node;
    }


    public static void main(String[] args) {

        LinkedListNode head = new LinkedListNode(3);

        head.next = new LinkedListNode(16);
        head.next.next = new LinkedListNode(8);

        LinkedListNode kthToLastNode = kthToLastElement(head, 2);

        System.out.println("kthToLastNode = " + kthToLastNode.data);
    }
}

class Index {
    public int value = 0;
}