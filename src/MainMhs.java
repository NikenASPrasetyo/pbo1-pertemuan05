public class MainMhs {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();

        m.setnpm("18630675");
        m.setNama("Niken AS Prasetyo");
        m.setjurusan("Teknik Informatika");
        m.setsemester("4");
        m.setnilai("95");

        System.out.println("NPM : " + m.getnpm());
        System.out.println("Nama : " + m.getNama());
        System.out.println("Jurusan : " + m.getjurusan());
        System.out.println("Semester : " + m.getsemester());
        System.out.println("Nilai : " +m.getnilai());
    }
}