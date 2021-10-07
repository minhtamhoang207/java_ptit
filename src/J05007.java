import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        ArrayList<Staff2> st = new ArrayList<>();
        String temp = sc.nextLine();
        while(n>0){
            String name, gender, birthday, address, taxId, contractId;
            name = sc.nextLine();
            gender = sc.nextLine();
            birthday = sc.nextLine();
            address = sc.nextLine();
            taxId = sc.nextLine();
            contractId = sc.nextLine();
            st.add(new Staff2(count, name, gender, birthday, address, taxId, contractId));
            count++;
            n--;
        }
        st.sort(Comparator.comparing((Staff2 staff2) -> {
            try {
                return staff2.getBirthday();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }));

        for(Staff2 s : st){
            System.out.println(s.toString());
        }
    }
}

class Staff2{
    int id;
    String name;
    String gender;
    String birthday;
    String address;
    String taxId;
    String contractId;

    public Staff2(int id, String name, String gender, String birthday, String address, String taxId, String contractId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.taxId = taxId;
        this.contractId = contractId;
    }

    public Date getBirthday() throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
    }

    private String genId(){
        String realId = "";
        int so0 = 5 - (Integer.toString(id)).length();
        for(int i=0; i < so0; i++){
            realId += "0";
        }
        return realId + id;
    }
    @Override
    public String toString(){
        return genId() + " " +
                name + " " +
                gender + " " +
                birthday + " " +
                address + " " +
                taxId + " " +
                contractId;
    }

}
