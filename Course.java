import java.util.List;

public class Course {
    List<Student> studenti;

    public void addStudent(Student s) {
        studenti.add(s);
    }

    public void deleteStudent(Student s) {
        studenti.remove(s);
    }

    public double prosekNaPoeni(Student s) {
        return s.getAverage();
    }

    public int brojNaPotpisi() {
        int counter = 0;
        for(Student s: studenti) {
            if(s.hasSignature()) {
                counter++;
            }
        }
        return counter;
    }
}
