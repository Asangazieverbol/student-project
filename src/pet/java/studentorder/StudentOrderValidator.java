package pet.java.studentorder;


import domain.*;
import mail.MailSender;
import validator.ChildrenValidator;
import validator.CityRegisterValidator;
import validator.StudentValidator;
import validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            } else {
                AnswerChildren childAnswer = checkChildren(so);
                AnswerCityRegister cityAnswer = checkCityRegister(so);
                if(!cityAnswer.success){
                    break;
                }
                AnswerStudent studAnswer = checkStudent(so);

                AnswerWedding wedAnswer = checkWedding(so);

                sendMail(so);
            }

        }
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "login1";
        crv1.password = "password1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";
        crv2.login = "login2";
        crv2.password = "password2";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        AnswerCityRegister ans2 = crv2.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }


    static AnswerStudent checkStudent(StudentOrder so){
       StudentValidator st = new StudentValidator();
        return st.checkStudent(so);
    }

    static void sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }
}
