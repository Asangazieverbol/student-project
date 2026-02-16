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
                    continue;
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
        return CityRegisterValidator.checkCityRegister(so);
    }

    static AnswerWedding checkWedding(StudentOrder so){
        return WeddingValidator.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so){
        return ChildrenValidator.checkChildren(so);
    }


    static AnswerStudent checkStudent(StudentOrder so){
       return StudentValidator.checkStudent(so);
    }

    static void sendMail(StudentOrder so){
        System.out.println("Сообщение отправлено");
    }
}
