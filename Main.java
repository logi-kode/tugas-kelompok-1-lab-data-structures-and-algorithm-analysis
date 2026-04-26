import java.util.Scanner;
import linkedlist.StudentLinkedList;
import queue.CustomerQueue;
import stack.TextEditor;

public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Objek untuk semua struktur data (Modular)
        StudentLinkedList list = new StudentLinkedList();
        CustomerQueue custQueue = new CustomerQueue();
        TextEditor editor = new TextEditor();
        Scanner input = new Scanner(System.in); 
        boolean running = true;

        // --- BAGIAN 1: LINKED LIST (MANAJEMEN MAHASISWA - INTERAKTIF) ---
        // Sesuai instruksi untuk mengelola data akademik mahasiswa [4, 5]
        System.out.println("=== Sistem Manajemen Akademik Student ===");

        while (running) {
            System.out.println("\nMenu Linked List:");
            System.out.println("1. Tambah Student");
            System.out.println("2. Hapus Student (by NIM)");
            System.out.println("3. Update Nilai");
            System.out.println("4. Tampilkan Daftar");
            System.out.println("5. Keluar & Lanjut ke Simulasi Lain");
            System.out.print("Pilih opsi: ");
            
            int pilihan = input.nextInt();

            // Mulai hitung waktu eksekusi untuk analisis efisiensi [3]
            long start = System.nanoTime();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM (Long): ");
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
                System.out.println("[Analisis] Waktu eksekusi Linked List: " + (end - start) + " ns");
            }
        }

        // --- BAGIAN 2: QUEUE (SIMULASI ANTREAN - OTOMATIS) ---
        // Sesuai instruksi simulasi antrean layanan [6, 7]
        System.out.println("\n============= QUEUE (Simulasi Antrean CS) =============");
        long startQueue = System.nanoTime();
        
        custQueue.addCustomer("Prabu"); 
        custQueue.addCustomer("Ivan");
        custQueue.displayQueue();
        custQueue.serveCustomer();
        custQueue.displayQueue();
        
        long endQueue = System.nanoTime();
        System.out.println("[Analisis] Waktu eksekusi Queue: " + (endQueue - startQueue) + " ns");

        // --- BAGIAN 3: STACK (UNDO/REDO EDITOR TEKS - OTOMATIS) ---
        // Sesuai instruksi fitur undo/redo [6, 8]
        System.out.println("\n============= STACK (Undo/Redo Histori) =============");
        long startStack = System.nanoTime();

        editor.addText("Selamat");
        editor.addText(" datang");
        editor.showText();
        editor.undo();
        editor.redo();

        long endStack = System.nanoTime();
        System.out.println("[Analisis] Waktu eksekusi Stack: " + (endStack - startStack) + " ns");

        input.close();
        System.out.println("\nProgram Berhenti.");
    }
}