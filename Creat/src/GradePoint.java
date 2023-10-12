
public class GradePoint {

	public static void main(String[] args) {
			Student kim=new Student();
			Student lee=new Student();
			kim.name="김민국";
			kim.point[0]=90;
			lee.name="이대한";
			lee.point[0]=80;
			System.out.println(kim.name+"의 첫번째 점수는 "+kim.point[0]);
			System.out.println(lee.name+"의 첫번째 점수는 "+lee.point[0]);
	}

}
