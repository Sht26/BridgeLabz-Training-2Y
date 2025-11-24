package Collections;
class Buffer {
    int[] arr;
    int size, start = 0;

    Buffer(int s){ arr=new int[s]; size=s; }

    void add(int x){
        arr[start] = x;
        start = (start + 1) % size;
    }

    void print(){
        for(int i=0;i<size;i++)
            System.out.print(arr[i] + " ");
    }
}

public class CircularBuffer {
    public static void main(String[] args) {
        Buffer cb = new Buffer(3);
        cb.add(1); cb.add(2); cb.add(3);
        cb.add(4);
        cb.print();
    }
}
