package linkedlist;

public class Student {
    private long nim; 
    private String name;
    private int grade;
    public Student next; // Pointer ke node berikutnya

    public Student(long nim, String name, int grade) {
        this.nim = nim;
        this.name = name;
        this.grade = grade;
        this.next = null;
    }

    // Getter dan Setter 
    public long getNim() { return nim; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }
}