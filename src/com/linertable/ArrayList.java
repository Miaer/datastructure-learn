package com.linertable;

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
     * 返回线性表的大小，即数据元素的个数。
     */
    @Override
    public int size() {
        return elementData.length;
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
        return elementData.length == 0 ? false : true;
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
     * 返回数据元素 e 在线性表中的序号
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

    }

    /**
     * 将数据元素 e 插入到线性表末尾
     *
     * @param e
     */
    @Override
    public void add(Object e) {

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
     * @param i
     */
    @Override
    public Object remove(int i) {
        return null;
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
        return null;
    }
}
