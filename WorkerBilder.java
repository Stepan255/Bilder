import java.util.ArrayList;
import java.util.Calendar;

public class WorkerBilder {
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
	 * @param arg0 (int)
	 * @param arg1 (String)
	 * @param arg2 (Boolean)
	 * @param arg3 (Foo)
	 * @param arg4 (String)
	 * @param arg5 (Calendar)
	 * @param arg6 (String)
	 * @param arg7 (int)
	 * @param arg8 (ArrayList<Integer>)
	 * @param arg9 (Character)
	 * @param arg10 (int)
	 * @param arg11 (int)
	 * @param arg12 (String)
	 * @param arg13 (int)
	 * @param arg14 (int)
	 * @param arg15 (int)
	 */
	public WorkerBilder() {
		super();
	}
	public WorkerBilder arg0(int arg0){
		this.arg0 = arg0;
		return this;
	}

	public WorkerBilder arg1(String arg1){
		this.arg1 = arg1;
		return this;
	}

	public WorkerBilder arg2(Boolean arg2){
		this.arg2 = arg2;
		return this;
	}

	public WorkerBilder arg3(Foo arg3){
		this.arg3 = arg3;
		return this;
	}

	public WorkerBilder arg4(String arg4){
		this.arg4 = arg4;
		return this;
	}

	public WorkerBilder arg5(Calendar arg5){
		this.arg5 = arg5;
		return this;
	}

	public WorkerBilder arg6(String arg6){
		this.arg6 = arg6;
		return this;
	}

	public WorkerBilder arg7(int arg7){
		this.arg7 = arg7;
		return this;
	}

	public WorkerBilder arg8(ArrayList<Integer> arg8){
		this.arg8 = arg8;
		return this;
	}

	public WorkerBilder arg9(Character arg9){
		this.arg9 = arg9;
		return this;
	}

	public WorkerBilder arg10(int arg10){
		this.arg10 = arg10;
		return this;
	}

	public WorkerBilder arg11(int arg11){
		this.arg11 = arg11;
		return this;
	}

	public WorkerBilder arg12(String arg12){
		this.arg12 = arg12;
		return this;
	}

	public WorkerBilder arg13(int arg13){
		this.arg13 = arg13;
		return this;
	}

	public WorkerBilder arg14(int arg14){
		this.arg14 = arg14;
		return this;
	}

	public WorkerBilder arg15(int arg15){
		this.arg15 = arg15;
		return this;
	}

	public Worker build() {
		return new Worker(this);
	}
}
