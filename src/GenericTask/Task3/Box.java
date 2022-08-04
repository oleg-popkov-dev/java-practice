package GenericTask.Task3;

public class Box<K, T extends Fruit> {
    private K key;
    private T obj;

    public Box(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}