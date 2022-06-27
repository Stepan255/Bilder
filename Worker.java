import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 * Пример создания экземпляра без аргументов:
 * <blockquote><pre>
 *     {@code Worker worker = new Worker();}
 * </pre></blockquote>
 *  Пример создания экземпляра с аргументом arg0 и arg7 аргументов:
 * <blockquote><pre>
 *     {@code Worker worker = new Worker()
		.arg1("Step")
		.arg7(8);}
 * </pre></blockquote>
 */
public class Worker {
	private int arg0;
	private String arg1;
	private Boolean arg2;
	private Foo arg3;
	private String arg4;
	private Calendar arg5;
	private String arg6;
	private int arg7;
	private ArrayList<Integer> arg8;
	private Character arg9;
	private int arg10;
	private int arg11;
	private String arg12;
	private int arg13;
	private int arg14;
	private int arg15;

	/**
	 * Экземпляр класса создается с помощью конструктора {@code new WorkerBilder()}
	 */
	public Worker(WorkerBilder workerBilder) {
		if (workerBilder == null) {
			throw new IllegalArgumentException("Please provide worker builder to build worker object.");
		}
		this.arg0 = workerBilder.arg0;
		this.arg1 = workerBilder.arg1;
		this.arg2 = workerBilder.arg2;
		this.arg3 = workerBilder.arg3;
		this.arg4 = workerBilder.arg4;
		this.arg5 = workerBilder.arg5;
		this.arg6 = workerBilder.arg6;
		this.arg7 = workerBilder.arg7;
		this.arg8 = workerBilder.arg8;
		this.arg9 = workerBilder.arg9;
		this.arg10 = workerBilder.arg10;
		this.arg11 = workerBilder.arg11;
		this.arg12 = workerBilder.arg12;
		this.arg13 = workerBilder.arg13;
		this.arg14 = workerBilder.arg14;
		this.arg15 = workerBilder.arg15;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Worker [arg0=").append(arg0).append(", arg1=").append(arg1).append(", arg2=")
				.append(arg2).append(", arg3=").append(arg3).append(", arg4=").append(arg4)
				.append(", arg5=").append(arg5).append(", arg6=").append(arg6)
				.append(", arg7=").append(arg7).append(", arg8=").append(arg8)
				.append(", arg9=").append(arg9).append(", arg10=").append(arg10)
				.append(", arg11=").append(arg11).append(", arg12=").append(arg12)
				.append(", arg13=").append(arg13).append(", arg14=").append(arg14)
				.append(", arg15=").append(arg15).append("]");
		return builder.toString();
	}
}