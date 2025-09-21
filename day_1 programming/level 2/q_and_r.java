package BridgeLabz;
public class q_and_r{
	public static void main(String[] args) {
		int total_pen=14;
		int students=3;
		int pen_per_student=total_pen/students;
		int non_distributed=total_pen%students;
		System.out.println("The Pen per Student is "+pen_per_student+" and the remaining pen not distributed is "+non_distributed);
	}
}