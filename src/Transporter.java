public  class Transporter {
    private static Transporter transporter;
    public static Transporter getTransporter(){
        if (transporter==null) transporter= new Transporter();
        return transporter;

    }



    private Transporter(){

    }
}