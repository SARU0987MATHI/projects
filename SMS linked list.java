class Student {
    int rollNo;
    String name;
    int marks;
    Student next;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}
class StudentList {
    Student head = null;
    public void addStudent(int rollNo, String name, int marks) {
        Student newStudent = new Student(rollNo, name, marks);

        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("No students found");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("RollNo: " + temp.rollNo +
                               ", Name: " + temp.name +
                               ", Marks: " + temp.marks);
            temp = temp.next;
        }
    }
    public void search(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Name: " + temp.name +
                                   ", Marks: " + temp.marks);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }
    public void delete(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            if (temp.next.rollNo == rollNo) {
                temp.next = temp.next.next;
                System.out.println("Student deleted");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
}
public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(1, "Ram", 80);
        list.addStudent(2, "Sita", 90);
        list.addStudent(3, "Ravi", 70);

        System.out.println("All Students:");
        list.display();

        System.out.println("\nSearch RollNo 2:");
        list.search(2);

        System.out.println("\nDelete RollNo 1:");
        list.delete(1);

        System.out.println("\nAfter Deletion:");
        list.display();
    }
}