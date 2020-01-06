public class LinkedListReverse {

    public Node reverse(Node headNode) {
       Node currentnode= Objects.requireNonNull(headNode,"input cannnot be empty");
       Node nextNode = currentnode.getNext();
       Node prevNode = null;
       Node nextNode = null;

        while (nextNode ==null) {
            currentnode.setNext(prevNode);
            if(nextNode==null)
                return nextNode = currentnode;

            prevNode = currentnode;
           currentnode = nextNode;
           nextNode = currentnode.getNext();

        }

        return nextNode;
    }
}
