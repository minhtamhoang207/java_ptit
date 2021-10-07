import java.util.Scanner;

public class TestFunctions {
    public static void main(String[] args) {
        PhanSo1 p = new PhanSo1(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
}
class PhanSo1{
    Scanner in = new Scanner(System.in);
    private long tuSo;
    private long mauSo;

    public PhanSo1(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void nhap(){
        this.tuSo = in.nextLong();
        this.mauSo = in.nextLong();
    }
    public long UCLN(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public void rutGon(){
        long ucln = UCLN(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}



