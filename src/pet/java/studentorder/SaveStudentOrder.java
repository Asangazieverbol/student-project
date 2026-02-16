package pet.java.studentorder;

import domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Elmar";
        so.hLastName = "Mederkanov";
        so.wFirstName = "Ildana";
        so.wLastName = "Saparbekova";

        long ans = savesStudentOrder(so);
        System.out.println(ans);
    }

    static long savesStudentOrder(StudentOrder studentOrder){
        long answer;
        answer = 199;
        System.out.println("savesStudentOrder" + studentOrder.hLastName);
        return answer;
    }

}
