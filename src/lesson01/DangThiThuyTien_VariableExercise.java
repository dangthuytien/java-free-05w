package lesson01;

public class DangThiThuyTien_VariableExercise {
    public static void main(String[] args) {
        //Bài 01

        //Khai báo biến
        String name;
        int age;
        char sex;
        double gpa;
        boolean excellentRank;

        //Khởi tạo các biến
        name = "Nguyễn Văn A";
        age = 20;
        sex = 'M';
        gpa = 8.3;
        excellentRank = false;
        int a = 10;
        int b = 20;
        int c = 15;
        double d = 2.3;
        double e = 3.5;

        //Thực hiện các phép tính toán
        int add = a+b;
        int sub = b-c;
        double mul = d*e;
        double div = e/d;

        //In kết quả ra màn hình
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex);
        System.out.println("Điểm trung bình: " + gpa);
        System.out.println("Có phải là học sinh xuất sắc: " + excellentRank);
        System.out.println(a + "+" + b + " = " + add);
        System.out.println(b + "-" + c + " = " + sub);
        System.out.println(d + "*" + e + " = " + mul);
        System.out.println(e + "/" + d + " = " + div);

        //Bài 02
        //Khởi tạo biến
        int int_var1 = 17;
        int int_var2 = 11;
        double dou_var1 = 6.13;
        double dou_var2 = 13.6;
        boolean boo_var1 = true;
        boolean boo_var2 = false;
        String str_var1 = "Hello";
        String str_var2 = "World";

        //Phép toán so sánh
        boolean equal = (int_var1==int_var2);
        System.out.println(equal);
        boolean notEqual = (dou_var1!=dou_var2);
        System.out.println(notEqual);
        boolean greater = (dou_var1>dou_var2);
        System.out.println(greater);
        boolean less = (int_var2<int_var1);
        System.out.println(less);
        boolean greaterOrEqual = (int_var1>=int_var2);
        System.out.println(greaterOrEqual);
        boolean lessOrEqual = (dou_var1<=dou_var2);
        System.out.println(lessOrEqual);

        //Phép toán logic
        boolean and = (boo_var1 && boo_var2);
        System.out.println(and);
        boolean or = (boo_var2 || boo_var1);
        System.out.println(or);
        boolean not = !boo_var2;
        System.out.println(not);

        //Phép cộng chuỗi
        String str = str_var1 + str_var2;
        System.out.println(str);



    }
}
