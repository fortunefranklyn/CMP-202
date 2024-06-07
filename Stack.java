public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }
    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow!!!");
        } else {
            array[top + 1] = item;
            top++;
        }
    }
    int pop() {
        int previousTop = top;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
        return array[previousTop];
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(85);        
        myStack.push(612);        
        myStack.push(35);
        myStack.pop();
        System.out.println(myStack.size);
        myStack.printItems();
    }
}
