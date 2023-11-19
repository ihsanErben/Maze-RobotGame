
public class Stack<T> {

    private Node<T> top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public void push(T n) {
        Node<T> newNode = new Node<>(n);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        Node<T> t = top;
        if (!isEmpty()) {
            top = top.next;
        }
        return t.data;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("--- THERE IS NO ACTION ---");
            // zaten ilk başta konumu 1,1 olduğu için hiçbir zaman çalışmayacak ama gene de yazdık.
            return;
        }else{
            int adim = 0;
            Node<T> x = top;
            while(x != null){
                adim++;
                x = x.next;
            }
            Node<T> tmp = top;
            while(tmp != null){
                System.out.println(adim + ". Movement: " + tmp.data);
                adim--;
                tmp = tmp.next;
            }
        }
    }

    private static class Node<T> {

        Node<T> next = null;
        T data;

        Node(T data) {
            this.data = data;
        }

    }
}
