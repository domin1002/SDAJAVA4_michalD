package sda;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(101, "ABC", "ABC University");
		Student student2 = new Student(102, "LMN", "LMN University");
		Student student3 = new Student(103, "PQR", "PQR University");
		Student student4 = new Student(104, "UVW", "UVW University");
		Student student5 = new Student(105, "XYZ", "ZYZ University");
		Student studentArray[] = { student1, student2, student3, student4, student5 };

		Result result1 = new Result(111, 101, 70, "A");
		Result result2 = new Result(222, 102, 30, "D");
		Result result3 = new Result(333, 103, 90, "A+");
		Result result4 = new Result(444, 104, 55, "B");
		Result result5 = new Result(555, 105, 45, "C");
		Result resultArray[] = { result1, result2, result3, result4, result5 };

		String topStudentName = getTopStudentName(studentArray, resultArray);
		System.out.println("Najlepszy student: " + topStudentName);
	}

	static String getTopStudentName(Student studentArray[], Result resultArray[]) {
		String topStudentName = "";
		Result najlepszyResult = resultArray[0];

		//wyszukoanie obiektu result z najwiekszym score
		for(Result result : resultArray){
			if(result.score > najlepszyResult.score){
				najlepszyResult = result;
			}
		}
		System.out.println(najlepszyResult.score);

		int studId = najlepszyResult.studentId;
		for(Student s :studentArray){
			if(s.studentId == studId){
				topStudentName = s.name;
				break;
			}
		}
		return topStudentName;
	}
}
