public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String studentName, int studentAge, int studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    public void introduce() {
        System.out.print("Hello my name is " + name + ". I am " + age + " years old and I am in the " + grade + "th grade. ");
        if (grade >= 11) {
            System.out.println("I am an upperclassman.");
        }
    }

}
