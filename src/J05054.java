import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentRank> studentRanks = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(test-- > 0){
            String name = sc.nextLine();
            double point = Double.parseDouble(sc.nextLine());
            studentRanks.add(new StudentRank(name, point, count));
            count++;
        }
        studentRanks.sort(Comparator.comparing(StudentRank::getPoint).reversed());

        int rank = 1;
        for(int i=0; i<studentRanks.size()-1; i++){
            if(studentRanks.get(i).point == studentRanks.get(i+1).point){
                studentRanks.get(i).setRank(rank);
            } else{
                studentRanks.get(i).setRank(rank);
                rank = i+2;
            }
        }
        studentRanks.get(studentRanks.size()-1).setRank(rank);

        studentRanks.sort(Comparator.comparing(StudentRank::getCount));
        for(StudentRank s : studentRanks){
            System.out.println(s);
        }
    }
}

class StudentRank{
    String name;
    double point;
    String id;
    int count;
    String level;
    int rank;

    public StudentRank(String name, double point, int count) {
        this.name = name;
        this.point = point;
        this.count = count;
        this.id = getId();
        this.level = getLevel();
    }

    public double getPoint() {
        return point;
    }

    String getId(){
        if( count < 10){
            return "HS0" + count;
        } else{
            return "HS" + count;
        }
    }

    public int getCount() {
        return count;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    String getLevel(){
        if(point >= 9){
            return "Gioi";
        } else if (point >=7 ){
            return "Kha ";
        } else if (point >=5 ){
            return "Trung Binh";
        } else{
            return "Yeu";
        }
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                point + " " +
                level + " " + rank;
    }
}