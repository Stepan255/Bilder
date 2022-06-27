public class Program {
	public static void main(String[] args) {
		Worker worker = new WorkerBilder().arg1("Step").build();
		System.out.println(worker);
	}
}