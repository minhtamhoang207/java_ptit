import java.util.Scanner;

public class J04007{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String name;
        String gender;
        String birthday;
        String address;
        String taxID;
        String duntKnow;

        name = sc.nextLine();
        gender = sc.nextLine();
        birthday = sc.nextLine();
        address = sc.nextLine();
        taxID = sc.nextLine();
        duntKnow = sc.nextLine();

        NV nv = new NV(
                name,
                gender,
                birthday,
                address,
                taxID,
                duntKnow
        );
        System.out.println(nv);
    }
}

class NV{
    public NV(String name, String gender, String birthday, String address, String taxID, String duntKnow) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.taxID = taxID;
        this.duntKnow = duntKnow;
    }

    String name;
    String gender;
    String birthday;
    String address;
    String taxID;
    String duntKnow;

    @Override
    public String toString() {
        return "00001" + " "
                + name + " "
                + gender + " "
                + birthday + " "
                + address + " "
                + taxID + " "
                +duntKnow;
    }

}