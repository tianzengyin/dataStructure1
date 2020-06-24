package jikeTime.Test.Array;

/**
 * @Auther:田增印
 * @Date: 2019/4/30
 * @Description: jikeTime.Test.Array 封装自己的数组类
 * @VERSION:1.0
 */
public class MyArray {
    private int[] data;
    private int size;

    /**
     * 构造函数，传入的数组容量capacity构造Array
     * @param capacity
     */
    public MyArray(int capacity){
        data = new int[capacity];
        size=0;
    }

    /**
     * 无参构造函数，默认容量为10
     */
    public MyArray(){
        this(10);
    }

    /**
     *获取数组的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     *获取数组的容量大小
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向所有元素后添加一个新元素
     * @param e
     */
    public void addLast(int e) throws IllegalAccessException {
        if(size == data.length) {
            throw new IllegalAccessException("添加失败，数组长度与容量相等");
        }
        data[size] = e;
        size++;
    }
    public void add(int index,int e){
        if(size == data.length) {
            try {
                throw new IllegalAccessException("添加失败，数组长度与容量相等");
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }
        if(index < 0 || index >size){
            try {
                throw new IllegalAccessException("添加失败，数组索引小于0或大于实际数据元素个数");
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }
        for(int i = size-1;i>=index;i--){
            data[i+1] = data[i];
        }
    }
}
