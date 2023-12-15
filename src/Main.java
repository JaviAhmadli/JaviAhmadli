public class Main{
    public static void main(String[]args){
        System.out.println("main");
        var a= Transporter.getTransporter();
        System.out.println(a);
        var b= Transporter.getTransporter();
        System.out.println(b);
        var c= Transporter.getTransporter();
        System.out.println(c);

    }
}