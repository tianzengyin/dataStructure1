package com.mj.queue;

import com.mj.queue.list.LinkedList;
import com.mj.queue.list.List;

/**
 * 双端队列
 * @param <E>
 */
public class Deque<E> {
	private List<E> list = new LinkedList<>();
	
	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void clear() {
		list.clear();
	}
	//从队尾入队
	public void enQueueRear(E element) {
		list.add(element);
	}
	//从对头出队
	public E deQueueFront() {
		return list.remove(0);
	}
	//从对头入队
	public void enQueueFront(E element) {
		list.add(0, element);
	}
	//从队尾出队
	public E deQueueRear() {
		return list.remove(list.size() - 1);
	}
	//查看队头
	public E front() {
		return list.get(0);
	}
	//查看队尾
	public E rear() {
		return list.get(list.size() - 1);
	}
}
