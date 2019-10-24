
public class CurrentTime {

	private static final int MILLI_CONVERSION = 1000;
	private long milliSeconds;
	
	public CurrentTime(){
		milliSeconds = System.currentTimeMillis();
	}
	
	
	
	public CurrentTime(long input) {
		milliSeconds = input;
	}



	@Override
	public String toString(){
		return "time: " + getCurrentHours() + ":" + getCurrentMinutes() + ":" + getCurrentSeconds();
	}



	public long getSeconds() {
		// TODO Auto-generated method stub
		return milliSeconds / MILLI_CONVERSION;
	}
	
	public long getCurrentSeconds(){
		long x = getSeconds() % 60;
		return x;
	}



	public long getMinutes() {
		
		return getSeconds() / 60;
	}



	public long getCurrentMinutes() {
		// TODO Auto-generated method stub
		return getMinutes() % 60;
	}



	public long getHours() {
		return getMinutes() / 60;
	}



	public long getCurrentHours() {
		return getHours() % 24;
	}
	
	
}
