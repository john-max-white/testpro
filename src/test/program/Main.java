package test.program;

public class Main {
	public static void main(String[] args) {
		System.out.println("Проба.");
		System.out.println("Проба.");
		System.out.println("Проба.");
		
		// Это будет в третьем релизе
		System.out.println("Пауза.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
