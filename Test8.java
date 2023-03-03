//creating a single thread using Runnable interface
//Note Runnable creates a task,can be assigned to a Thread
class Task implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread() + "running");
		System.out.println("welcome");
	}
}
public class Test8 {
public static void main(String[] args) throws Exception {
	System.out.println("Hi");
	Task task = new Task();
	Thread t1 = new Thread(task);
	t1.setName("firstchild");
	t1.start();
	Thread.sleep(2000);
	System.out.println("bye");
}
}
