public class Main{
    public static void main(String[]args){
        var card=ResidentCard.getResidentCard();
        System.out.println(card.hashCode());

        var card_new=ResidentCard.getResidentCard();
        System.out.println(card_new.hashCode());



    }
}