import java.util.Scanner;
import linkedlist.StudentLinkedList;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner input = new Scanner(System.in); 
        boolean running = true;

        System.out.println("=== Sistem Manajemen Akademik Student ===");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Student");
            System.out.println("2. Hapus Student (by NIM)");
            System.out.println("3. Update Nilai");
            System.out.println("4. Tampilkan Daftar");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = input.nextInt();

            // Mulai hitung waktu eksekusi 
            long start = System.nanoTime();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    long nim = input.nextLong(); 
                    input.nextLine(); // membersihkan buffer enter
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    int nilai = input.nextInt();
                    list.addStudent(nim, nama, nilai);
                    break;
                case 2:
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    long nimHapus = input.nextLong();
                    list.removeStudent(nimHapus);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    long nimUpdate = input.nextLong();
                    System.out.print("Masukkan Nilai Baru: ");
                    int nilaiBaru = input.nextInt();
                    list.updateGrade(nimUpdate, nilaiBaru);
                    break;
                case 4:
                    list.displayStudents();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }

            long end = System.nanoTime();
            if (pilihan >= 1 && pilihan <= 4) {
                System.out.println("[Analisis] Waktu eksekusi operasi: " + (end - start) + " ns");
            }
        }
        input.close();
        System.out.println("Program Berhenti.");
    }
}