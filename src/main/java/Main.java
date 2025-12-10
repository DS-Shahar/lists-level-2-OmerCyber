class Main {
  
  public static Node<Integer> ex12_mergeSorted(Node<Integer> L1, Node<Integer> L2) 
  {
    Node<Integer> dummy = new Node<Integer>(0);
    Node<Integer> tail = dummy;

    while (L1 != null && L2 != null) 
    {
        if (L1.getValue() <= L2.getValue())
        {
            tail.setNext(L1);
            L1 = L1.getNext();
        } 
        else 
        {
            tail.setNext(L2);
            L2 = L2.getNext();
        }
        tail = tail.getNext();
    }

    if (L1 != null) 
    {
        tail.setNext(L1);
    }
    if (L2 != null) 
    {
        tail.setNext(L2);
    }

    return dummy.getNext();
}


  public static Node<Integer> ex13_selectionSort(Node<Integer> head)
  {
    Node<Integer> sortedHead = null;
    Node<Integer> sortedTail = null;

    while (head != null) 
    {
        Node<Integer> minNode = head;
        Node<Integer> minPrev = null;

        Node<Integer> prev = head;
        Node<Integer> curr = head.getNext();
        while (curr != null) {
            if (curr.getValue() < minNode.getValue()) 
            {
                minNode = curr;
                minPrev = prev;
            }
            prev = curr;
            curr = curr.getNext();
        }

        if (minPrev == null) 
        {
            head = head.getNext();
        } else {
            minPrev.setNext(minNode.getNext());
        }

        if (sortedHead == null)
        {
            sortedHead = minNode;
            sortedTail = minNode;
        } else 
        {
            sortedTail.setNext(minNode);
            sortedTail = sortedTail.getNext();
        }
        sortedTail.setNext(null);
    }

    return sortedHead;
}

}
