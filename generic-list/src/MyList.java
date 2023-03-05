public class MyList <T> {
    private T[] array;
    private int capacity;
    public int index = 0;

    public MyList(){
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];

    }

    public int size(){
        int i = 0;
        for (T element:array) {
            if(element != null) {
                i++;
            }
        }
        return i;
    }

    public void increaseSize(){
        T[] temp = (T[]) new Object[size() + 1];

        if (size() >= 0) System.arraycopy(array, 0, temp, 0, size());
        array = temp;
    }

    public void add(T data){
        increaseSize();
        if (this.size() >= this.capacity) setCapacity(this.capacity * 2);

        this.array[index] = data;
        index++;

    }

    public T getIndex(int index){
        if(index > this.size() - 1){
            return null;
        }

        return array[index];
    }

    public void remove(int index){
        for (int i = index; i < size() - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void set(int index, T data){
        if(index > size() - 1){
            return;
        }
        array[index] = data;
    }

    public String toString(){
        StringBuilder str = new StringBuilder("[");
        if(!isEmpty()) {
            for (int i=0; i < size(); i++) {
                str.append(array[i]);
                if(i != size() -1) str.append(",");
            }
            return str + "]";
        }
        return str + "]";

    }


    public int indexOf(T data){
        for(int i = 0; i< size(); i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for(int i= 0; i < size(); i++){
            for(int j = i + 1; j < size(); j++){
                if(array[i] == array[j] && array[i] == data){
                    return j;
                }
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return size() == 0;
    }

    public T[] toArray(){
        return this.array;

    };

    public void clear(){
        this.array = (T[]) new Object[0];
    };

    public MyList<T> subList(int start, int finish){
        MyList<T> temp = new MyList<>();

        for(int i = start; i < finish; i++){
            temp.add(array[i]);
        }

        return temp;
    }

    public boolean contains(T data){
        for (T element:array) {
            if (element == data) {
                return true;
            }
        }
        return false;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
