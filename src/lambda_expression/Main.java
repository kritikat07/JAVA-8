package lambda_expression;

public class Main {
    // without lambda;
//    static void main(String[] args) {
//        software_engineering s1=new software_engineering();
//        System.out.println(s1.getname());
//    }

// with lambda
    static void main(String[] args) {
        employee s1=()-> "kritika";
        System.out.println(s1.getname());
    }
}
