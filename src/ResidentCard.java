public  class ResidentCard {
    private static ResidentCard residentCard;
    public static ResidentCard getResidentCard(){
        if (residentCard==null) residentCard= new ResidentCard();
        return residentCard;

    }



    private ResidentCard(){

    }
}