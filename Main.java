import java.util.Scanner;

class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode(int x) {
        val = x;
        next = null;
    }
}

class LinkedListInsertBeforeHead {
    public ListNode insertBeforeHead(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListInsertBeforeHead solution = new LinkedListInsertBeforeHead();
        ListNode head = null;
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values inserted before the head: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            head = solution.insertBeforeHead(head, arr[i]);
        }
        ListNode current = head;
        System.out.println("\nThe final linked list is:");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        scanner.close();
    }
}
