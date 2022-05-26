package ThirdTask;

public class ThirdTask {

	public static void main(String[] args) {
		int randomNum;
        randomNum = (int)(Math.random()*102);
        System.out.println("Generated number=" + randomNum);
        System.out.println("Number of digits=" + Integer.toString(randomNum).length());

	}

}
