package pet.java.studentorder;
import domain.*;
import mail.MailSender;
import validator.ChildrenValidator;
import validator.CityRegisterValidator;
import validator.StudentValidator;
import validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {

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

    public StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so){
        return weddingValidator.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenValidator.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so){
        return studentValidator.checkStudent(so);
    }

    public void sendMail(StudentOrder so){
        mailSender.sendMail(so);
    }
}
