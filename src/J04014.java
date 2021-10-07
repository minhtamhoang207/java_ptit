import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            PhanSo p = new PhanSo(a,b);
            PhanSo q = new PhanSo(c,d);
            PhanSo cto = PhanSo.multiply(PhanSo.add(p,q), PhanSo.add(p,q));
            PhanSo temp = PhanSo.multiply(p,q);
            PhanSo dto = PhanSo.multiply(temp, cto);
            System.out.println(cto + " " + dto);
        }
    }
    static class PhanSo{
        Scanner in = new Scanner(System.in);
        private long tuSo;
        private long mauSo;

        public PhanSo(){
            this.tuSo = 0;
            this.mauSo = 1;
        }
        public PhanSo(long tuSo, long mauSo){
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

        public static PhanSo add(PhanSo a, PhanSo b){
            PhanSo c = new PhanSo(a.tuSo* b.mauSo + b.tuSo*a.mauSo , a.mauSo*b.mauSo);
            c.rutGon();
            return c;
        }

        public static PhanSo multiply(PhanSo a, PhanSo b){
            PhanSo c = new PhanSo(a.tuSo*b.tuSo , a.mauSo*b.mauSo);
            c.rutGon();
            return c;
        }

        public String toString(){
            return this.tuSo + "/" + this.mauSo;
        }
    }
}