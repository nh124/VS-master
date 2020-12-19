class Node<T> {
    T data;
    Node<T> node;
    Node<T> next;
    Node<T> pre;

    public Node(T data){
        this.data = data;
        node = null;
    }
    public void setData(Node<T> node){
        this.node = node;
    }
    public Node<T> getNode(){
        return this.node;
    }
}
