package bai7;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;
    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isfull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isEmpty(){
        if(index == 0) {
            return true;
        }
        return false;
    }
    public boolean isfull(){
        if (index == size) {
            return true;
        }
        return false;
    }
}
