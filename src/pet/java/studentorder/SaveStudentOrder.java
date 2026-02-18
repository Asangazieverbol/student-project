package pet.java.studentorder;

import domain.Adult;
import domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {

        buildStudentOrder();
        /*StudentOrder so = new StudentOrder();
        long ans = savesStudentOrder(so);
        System.out.println(ans);*/
    }

    static long savesStudentOrder(StudentOrder studentOrder){
        long answer;
        answer = 199;
        System.out.println("savesStudentOrder");
        return answer;
    }

    static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();

        Adult husband = new Adult();

//        husband.setGivenName("Azim");
//        husband.setSurName("Asangaziev");
//        husband.setPassportNumber("54321");
//        so.setHusbend(husband);
//
//        String ans = husband.getPersonString();
//        System.out.println(ans);


        return so;
    }

}
