public class Program {
	public static void main(String[] args) {
		Worker worker1 = new WorkerBilder().arg1("Step").arg0(1).build();
		System.out.println(worker1);
	}
}