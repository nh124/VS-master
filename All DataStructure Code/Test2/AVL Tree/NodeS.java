public class NodeS<T> {
    NodeS<T> right;
    NodeS<T> left;
    NodeS<T> next;
    StackImp<T> stack;
    int height;
    T data;
        

    public NodeS(T data, StackImp<T> stack) {
        this.data = data;
        left = null;
        right = null;
        next = null;
        this.stack = stack;
        height = 1;
    }
}
