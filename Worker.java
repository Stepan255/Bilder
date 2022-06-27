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
	 * @param arg0(int)
	 * @param arg1(String)
	 * @param arg2(Boolean)
	 * @param arg3(Foo)
	 * @param arg4(String)
	 * @param arg5(Calendar)
	 * @param arg6(String)
	 * @param arg7(int)
	 * @param arg8(ArrayList<Integer>)
	 * @param arg9(Character)
	 * @param arg10(int)
	 * @param arg11(int)
	 * @param arg12(String)
	 * @param arg13(int)
	 * @param arg14(int)
	 * @param arg15(int)
	 */
	public Worker() {
		super();
	}

	public Worker arg0(int arg0){
		this.arg0 = arg0;
		return this;
	}

	public Worker arg1(String arg1){
		this.arg1 = arg1;
		return this;
	}

	public Worker arg2(Boolean arg2){
		this.arg2 = arg2;
		return this;
	}

	public Worker arg3(Foo arg3){
		this.arg3 = arg3;
		return this;
	}

	public Worker arg4(String arg4){
		this.arg4 = arg4;
		return this;
	}

	public Worker arg5(Calendar arg5){
		this.arg5 = arg5;
		return this;
	}

	public Worker arg6(String arg6){
		this.arg6 = arg6;
		return this;
	}

	public Worker arg7(int arg7){
		this.arg7 = arg7;
		return this;
	}

	public Worker arg8(ArrayList<Integer> arg8){
		this.arg8 = arg8;
		return this;
	}

	public Worker arg9(Character arg9){
		this.arg9 = arg9;
		return this;
	}

	public Worker arg10(int arg10){
		this.arg10 = arg10;
		return this;
	}

	public Worker arg11(int arg11){
		this.arg11 = arg11;
		return this;
	}

	public Worker arg12(String arg12){
		this.arg12 = arg12;
		return this;
	}

	public Worker arg13(int arg13){
		this.arg13 = arg13;
		return this;
	}

	public Worker arg14(int arg14){
		this.arg14 = arg14;
		return this;
	}

	public Worker arg15(int arg15){
		this.arg15 = arg15;
		return this;
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