import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoalQueue {
    public static void main(String[] args) {
        Queue<String> toDoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah pekerjaan");
            System.out.println("2. Tampilkan pekerjaan yang harus diselesaikan terlebih dahulu");
            System.out.println("3. Hapus pekerjaan yang sudah diselesaikan");
            System.out.println("4. Tampilkan seluruh isi to-do list");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan yang harus dilakukan: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Pekerjaan berhasil ditambahkan.");
                    break;
                case 2:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Pekerjaan yang harus diselesaikan terlebih dahulu: " + toDoList.peek());
                        System.out.println("Pekerjaan berikutnya dalam antrian:");
                        for (String item : toDoList) {
                            System.out.println("- " + item);
                        }
                    } else {
                        System.out.println("Tidak ada pekerjaan dalam to-do list.");
                    }
                    break;
                case 3:
                    if (!toDoList.isEmpty()) {
                        String completedTask = toDoList.poll();
                        System.out.println("Pekerjaan '" + completedTask + "' sudah selesai dan dihapus dari to-do list.");
                    } else {
                        System.out.println("Tidak ada pekerjaan dalam to-do list.");
                    }
                    break;
                case 4:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Isi to-do list:");
                        for (String item : toDoList) {
                            System.out.println("- " + item);
                        }
                    } else {
                        System.out.println("To-do list kosong.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}