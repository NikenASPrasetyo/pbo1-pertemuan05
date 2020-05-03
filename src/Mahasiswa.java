public class Mahasiswa {
    //atribut
    String npm;
    String nama;
    String jurusan;
    String semester;
    String nilai;


    //behaviour
    public String getNama() {                // method brp Fungsi
        return nama;
    }
    public void setNama(String nama) { // method brp procedure
        this.nama = nama;
    }


    public String getnpm() {                 // method brp Fungsi
        return npm;
    }
    public void setnpm(String npm) {         // method brp procedure
        this.npm = npm;
    }


    public String getjurusan() {                // method brp Fungsi
        return jurusan;
    }
    public void setjurusan(String jurusan) { // method brp procedure
        this.jurusan = jurusan;
    }


    public String getsemester() {                 // method brp Fungsi
        return semester;
    }
    public void setsemester(String semester) {         // method brp procedure
        this.semester = semester;
    }


    public String getnilai() {                 // method brp Fungsi
        return nilai;
    }
    public void setnilai(String nilai) {         // method brp procedure
        this.nilai = nilai;
    }
}