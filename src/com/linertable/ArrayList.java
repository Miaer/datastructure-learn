package com.linertable;

import java.util.Arrays;

/**
 * 顺序表实现
 * @author mrliz
 */
public class ArrayList implements List {


    /**
     * 底层采用数组
     */
    private Object[] elementData;

    private int size;

    /**
     * 默认数组长度
     */
    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    public ArrayList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public ArrayList() {
        elementData = new Object[]{};
    }

    /**
     * 返回线性表的大小，即数据元素的个数。
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 返回线性表中序号为 i 的数据元素
     *
     * @param i
     */
    @Override
    public Object get(int i) {
        return elementData[i];
    }

    /**
     * 如果线性表为空返回 true，否则返回 false。
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断线性表是否包含数据元素 e
     *
     * @param e
     */
    @Override
    public boolean contains(Object e) {
        return false;
    }

    /**
     * 返回数据元素 e 在线性表中的索引
     *
     * @param e
     */
    @Override
    public int indexOf(Object e) {
        return 0;
    }

    /**
     * 将数据元素 e 插入到线性表中 i 号位置
     *
     * @param i
     * @param e
     */
    @Override
    public void add(int i, Object e) {
        rangeCheckForAdd(i);
        elementData[i] = e;
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            throw  new MyArrayIndexOutOfBoundsException("数组下标越界异常" + index);
        }
    }

    /**
     * 将数据元素 e 插入到线性表末尾
     *
     * @param e
     */
    @Override
    public void add(Object e) {
        ensureCapacity();

        elementData[size] = e;
        size++;
    }

    private void ensureCapacity() {
        int OldCapacity = elementData.length;
        // 首次增加长度
        if (OldCapacity == 0 || elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            elementData = new Object[DEFAULT_CAPACITY];

            return;
        }

        // 数组动态扩容
        if (size >= OldCapacity){
            int newCapacity = OldCapacity + (OldCapacity >> 1);
            elementData = Arrays.copyOf(elementData,newCapacity);
        }
    }

    /**
     * 将数据元素 e 插入到元素 obj 之前
     *
     * @param obj
     * @param e
     */
    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    /**
     * 将数据元素 e 插入到元素 obj 之后
     *
     * @param obj
     * @param e
     */
    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    /**
     * 删除线性表中序号为 i 的元素,并返回之
     *
     * @param index
     */
    @Override
    public Object remove(int index) {
        rangeCheckForAdd(index);

        Object oldValue = elementData[index];

        for (int i = index; i < elementData.length - 1; i++) {
            elementData[index++] = elementData[i + 1];
        }

        Arrays.copyOf(elementData,elementData.length -1);
        return oldValue;
    }

    /**
     * 删除线性表中第一个与 e 相同的元素
     *
     * @param e
     */
    @Override
    public boolean remove(Object e) {
        return false;
    }

    /**
     * 替换线性表中序号为 i 的数据元素为 e，返回原数据元素
     *
     * @param i
     * @param e
     */
    @Override
    public Object replace(int i, Object e) {
        elementData[i] = e;
        return elementData[i];
    }
}
