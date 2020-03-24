import java.util.LinkedList;
import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new LinkedList<Integer>();

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}


	public double getAverage() {
		int suma = 0;
		int counter = 0;
		for(int x: labPoints){
			suma += x;
			counter++;
		}
		return (double)suma/counter;
	}

	public boolean hasSignature() {
		int counter = 0;
		for(int x: labPoints){
			counter++;
		}
		return counter > 8;
	}

}