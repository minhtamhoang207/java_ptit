//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class J05006 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 1;
//        ArrayList<Staff> st = new ArrayList<>();
//        String temp = sc.nextLine();
//        while(n>0){
//            String name, gender, birthday, address, taxId, contractId;
//            name = sc.nextLine();
//            gender = sc.nextLine();
//            birthday = sc.nextLine();
//            address = sc.nextLine();
//            taxId = sc.nextLine();
//            contractId = sc.nextLine();
//            st.add(new Staff(count, name, gender, birthday, address, taxId, contractId));
//            count++;
//            n--;
//        }
//        for(Staff s : st){
//            System.out.println(s.toString());
//        }
//    }
//}
//
//class Staff{
//    int id;
//    String name;
//    String gender;
//    String birthday;
//    String address;
//    String taxId;
//    String contractId;
//
//    public Staff(int id, String name, String gender, String birthday, String address, String taxId, String contractId) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.birthday = birthday;
//        this.address = address;
//        this.taxId = taxId;
//        this.contractId = contractId;
//    }
//
//    private String genId(){
//        String realId = "";
//        int so0 = 5 - (Integer.toString(id)).length();
//        for(int i=0; i < so0; i++){
//            realId += "0";
//        }
//        return realId + id;
//    }
//    @Override
//    public String toString(){
//        return genId() + " " +
//                name + " " +
//                gender + " " +
//                birthday + " " +
//                address + " " +
//                taxId + " " +
//                contractId;
//    }
//
//}
