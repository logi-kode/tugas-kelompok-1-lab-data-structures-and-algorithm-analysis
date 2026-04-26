package linkedlist;

public class StudentLinkedList {
    private Student head;

    // Menambahkan student baru (Enqueue-like operation pada Linked List) 
    public void addStudent(long nim, String name, int grade) {
        Student newNode = new Student(nim, name, grade);
        if (head == null) {
            head = newNode;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Data " + name + " berhasil ditambahkan.");
    }

    // Menghapus student berdasarkan NIM 
    public void removeStudent(long nim) {
        if (head == null) return;
        if (head.getNim() == nim) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.getNim() != nim) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Data NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Data NIM " + nim + " tidak ditemukan.");
        }
    }

    // Mengupdate nilai student 
    public void updateGrade(long nim, int newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.getNim() == nim) {
                temp.setGrade(newGrade);
                System.out.println("Nilai student " + temp.getName() + " berhasil diupdate.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data NIM " + nim + " tidak ditemukan.");
    }

    // Menampilkan seluruh daftar 
    public void displayStudents() {
        if (head == null) {
            System.out.println("Daftar Mahasiswa Kosong.");
            return;
        }
        System.out.println("\n--- Daftar Student ---");
        Student temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println(i++ + ". NIM: " + temp.getNim() + ", Nama: " + temp.getName() + ", Nilai: " + temp.getGrade());
            temp = temp.next;
        }
    }
}