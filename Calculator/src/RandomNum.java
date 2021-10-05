import java.util.Random;
public class RandomNum {
	 static Random randG = new Random();

	public int easyRandomNum() {
		int easyint = randG.nextInt(10);
		return easyint;
	}

	public int medRandomNum() {
		int medint = randG.nextInt(100);
		return medint;
	}

	public int hardRandomNum() {
		int hardint = randG.nextInt(1000);
		randG.nextInt();
		return hardint;
	}
}
