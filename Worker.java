import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 * Пример создания экземпляра без аргументов:
 * <blockquote>
 * 
 * <pre>
 *     {@code
 * Worker worker = new WorkerBilder().build();
 * }
 * </pre>
 * 
 * </blockquote>
 * Пример создания экземпляра с аргументом arg0 и arg7 аргументов:
 * <blockquote>
 * 
 * <pre>
 *     {@code
 * Worker worker = new WorkerBilder()
 * 		.arg1("Step")
 * 		.arg7(8)
 * 		.build();
 * }
 * </pre>
 * 
 * </blockquote>
 */
public class Worker {
	protected int arg0;
	protected String arg1;
	protected Boolean arg2;
	protected Foo arg3;
	protected String arg4;
	protected Calendar arg5;
	protected String arg6;
	protected int arg7;
	protected ArrayList<Integer> arg8;
	protected Character arg9;
	protected int arg10;
	protected int arg11;
	protected String arg12;
	protected int arg13;
	protected int arg14;
	protected int arg15;

	/**
	 * Экземпляр класса создается с помощью конструктора {@code WorkerBilder()}
	 */
	public Worker() {

	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("Worker [arg0=")
				.append(arg0)
				.append(", arg1=")
				.append(arg1)
				.append(", arg2=")
				.append(arg2)
				.append(", arg3=")
				.append(arg3)
				.append(", arg4=")
				.append(arg4)
				.append(", arg5=")
				.append(arg5)
				.append(", arg6=")
				.append(arg6)
				.append(", arg7=")
				.append(arg7)
				.append(", arg8=")
				.append(arg8)
				.append(", arg9=")
				.append(arg9)
				.append(", arg10=")
				.append(arg10)
				.append(", arg11=")
				.append(arg11)
				.append(", arg12=")
				.append(arg12)
				.append(", arg13=")
				.append(arg13)
				.append(", arg14=")
				.append(arg14)
				.append(", arg15=")
				.append(arg15)
				.append("]")
				.toString();
	}
}