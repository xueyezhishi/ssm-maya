package com.MS.queue;
/**
 * 循环顺序队列
 * @author 焦焱-16060211104
 *循环队列的基本操作
 */
public class A{
/**
 * 队头
 */
private int front;
/**
 * 队尾
 */
private int rear;
/**
 * 数据
 */
private Object[] a;
/**
 * 最大元素数
 */
private int max;
/**
 * 当前元素数
 */
private int num;
public A(int n) {
    a = new Object[n];
    front=0;
    rear=0;
    num=0;
    max = n;
}
/**
 * 入队
 * @param data 数据
 */
public void add(Object data)
{
     if (num > 0 && front == rear) {
         System.out.println("队列已满");         
    }else {
          a[rear] = data;
          rear=(rear+1)%max;
          num++;
    }
}
/**
 * 出队
 * @return 数据
 */
public Object delete()
{
    if(num==0)
    {
        System.out.println("队列为空");
        return null;
    }else
    {
        Object o = a[front];
        front=(front+1)%max;
        num--;
        return o;
    }
}
/**
 * 返回队列是否为空
 * @return 如果为空返回true
 */
public boolean isEmpty()
{
    if(num==0)
        return true;
    else
        return false;
}
}