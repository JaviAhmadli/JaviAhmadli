public  class Transporter {
    private int price;
    private int speed;
    private String tension;

    public Transporter(int price, int speed, String tension) {
        this.price = price;
        this.speed = speed;
        this.tension = tension;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }
    public Transporter(){
        this(5,7,"vvv");
    }
    public int getCon(){
        return speed+price;
    }






}