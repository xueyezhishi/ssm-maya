package com.run;

class NumberArray implements Runnable {
	int count = 0;
	int numbers[] = new int[20];
	int n;

	NumberArray(int n) {
		this.n = n;
	}

	public void addnumber(int n) {

		synchronized (this) {

			numbers[count] = n;
			System.out.println("numbers[" + count + "]=" + numbers[count]);
			count++;

		}
	}

	public void run() {

		for (int i = 0; i < n; i++) {
			addnumber(i);

		}

	}
}

public class MutilThreadDeamo {
	public static void main(String args[]) {
		NumberArray num = new NumberArray(10);
		Thread t1 = new Thread(num);
		Thread t2 = new Thread(num);
		t1.start();
		t2.start();

	}
}