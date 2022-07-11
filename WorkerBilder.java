import java.util.ArrayList;
import java.util.Calendar;

public class WorkerBilder {
	

	Worker worker;
	public WorkerBilder() {
		worker = new Worker();
	}
	public WorkerBilder arg0(int arg0){
		worker.arg0 = arg0;
		return this;
	}

	public WorkerBilder arg1(String arg1){
		worker.arg1 = arg1;
		return this;
	}

	public WorkerBilder arg2(Boolean arg2){
		worker.arg2 = arg2;
		return this;
	}

	public WorkerBilder arg3(Foo arg3){
		worker.arg3 = arg3;
		return this;
	}

	public WorkerBilder arg4(String arg4){
		worker.arg4 = arg4;
		return this;
	}

	public WorkerBilder arg5(Calendar arg5){
		worker.arg5 = arg5;
		return this;
	}

	public WorkerBilder arg6(String arg6){
		worker.arg6 = arg6;
		return this;
	}

	public WorkerBilder arg7(int arg7){
		worker.arg7 = arg7;
		return this;
	}

	public WorkerBilder arg8(ArrayList<Integer> arg8){
		worker.arg8 = arg8;
		return this;
	}

	public WorkerBilder arg9(Character arg9){
		worker.arg9 = arg9;
		return this;
	}

	public WorkerBilder arg10(int arg10){
		worker.arg10 = arg10;
		return this;
	}

	public WorkerBilder arg11(int arg11){
		worker.arg11 = arg11;
		return this;
	}

	public WorkerBilder arg12(String arg12){
		worker.arg12 = arg12;
		return this;
	}

	public WorkerBilder arg13(int arg13){
		worker.arg13 = arg13;
		return this;
	}

	public WorkerBilder arg14(int arg14){
		worker.arg14 = arg14;
		return this;
	}

	public WorkerBilder arg15(int arg15){
		worker.arg15 = arg15;
		return this;
	}

	public Worker build() {
		return worker;
	}
}
