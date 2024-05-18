import java.util.ArrayList;
import java.util.Scanner;

public class DaftarNamaMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan nama mahasiswa (ketik 'selesai' untuk berhenti): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("selesai")) {
                    break;
                }

                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }

                namaMahasiswa.add(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Daftar nama mahasiswa yang telah dimasukkan:");
        for (String nama : namaMahasiswa) {
            System.out.println(nama);
        }

        scanner.close();
    }
}