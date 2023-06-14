package br.com.blackjackaltbank.domain;

public class Cheap {
    private Stack<Card> cheap;

    public Cheap() {
        this.cheap = new Stack<>();
    }

    public void startDeck(){
        if(cheap.empty()){
            createDeck();
        }
    }

    public void shuffle(){
        cheap.shuffle();
    }

    public int size(){
        return cheap.size();
    }

    public Card remove(){
        return (Card) this.cheap.remove();
    }

    public void showDeck(){
        for(int i=0; i < cheap.size(); i++){
            System.out.println(((Card) cheap.get(i)).getName() + " de " + ((Card) cheap.get(i)).getSuit());
        }
    }
    private void createDeck() {
        Card c1;


        //COPAS
        c1 = new Card("as","Copas",11);
        cheap.insert(c1);
        c1 = new Card("dois","Copas",2);
        cheap.insert(c1);
        c1 = new Card("tres","Copas",3);
        cheap.insert(c1);
        c1 = new Card("quatro","Copas",4);
        cheap.insert(c1);
        c1 = new Card("cinco","Copas",5);
        cheap.insert(c1);
        c1 = new Card("seis","Copas",6);
        cheap.insert(c1);
        c1 = new Card("sete","Copas",7);
        cheap.insert(c1);
        c1 = new Card("oito","Copas",8);
        cheap.insert(c1);
        c1 = new Card("nove","Copas",9);
        cheap.insert(c1);
        c1 = new Card("dez","Copas",10);
        cheap.insert(c1);
        c1 = new Card("valete","Copas",10);
        cheap.insert(c1);
        c1 = new Card("dama","Copas",10);
        cheap.insert(c1);
        c1 = new Card("rei","Copas",10);
        cheap.insert(c1);

        //PAUS
        c1 = new Card("as","Paus",11);
        cheap.insert(c1);
        c1 = new Card("dois","Paus",2);
        cheap.insert(c1);
        c1 = new Card("tres","Paus",3);
        cheap.insert(c1);
        c1 = new Card("quatro","Paus",4);
        cheap.insert(c1);
        c1 = new Card("cinco","Paus",5);
        cheap.insert(c1);
        c1 = new Card("seis","Paus",6);
        cheap.insert(c1);
        c1 = new Card("sete","Paus",7);
        cheap.insert(c1);
        c1 = new Card("oito","Paus",8);
        cheap.insert(c1);
        c1 = new Card("nove","Paus",9);
        cheap.insert(c1);
        c1 = new Card("dez","Paus",10);
        cheap.insert(c1);
        c1 = new Card("valete","Paus",10);
        cheap.insert(c1);
        c1 = new Card("dama","Paus",10);
        cheap.insert(c1);
        c1 = new Card("rei","Paus",10);
        cheap.insert(c1);

        //OURO
        c1 = new Card("as","Ouro",11);
        cheap.insert(c1);
        c1 = new Card("dois","Ouro",2);
        cheap.insert(c1);
        c1 = new Card("tres","Ouro",3);
        cheap.insert(c1);
        c1 = new Card("quatro","Ouro",4);
        cheap.insert(c1);
        c1 = new Card("cinco","Ouro",5);
        cheap.insert(c1);
        c1 = new Card("seis","Ouro",6);
        cheap.insert(c1);
        c1 = new Card("sete","Ouro",7);
        cheap.insert(c1);
        c1 = new Card("oito","Ouro",8);
        cheap.insert(c1);
        c1 = new Card("nove","Ouro",9);
        cheap.insert(c1);
        c1 = new Card("dez","Ouro",10);
        cheap.insert(c1);
        c1 = new Card("valete","Ouro",10);
        cheap.insert(c1);
        c1 = new Card("dama","Ouro",10);
        cheap.insert(c1);
        c1 = new Card("rei","Ouro",10);
        cheap.insert(c1);

        //ESPADAS
        c1 = new Card("as","Espadas",11);
        cheap.insert(c1);
        c1 = new Card("dois","Espadas",2);
        cheap.insert(c1);
        c1 = new Card("tres","Espadas",3);
        cheap.insert(c1);
        c1 = new Card("quatro","Espadas",4);
        cheap.insert(c1);
        c1 = new Card("cinco","Espadas",5);
        cheap.insert(c1);
        c1 = new Card("seis","Espadas",6);
        cheap.insert(c1);
        c1 = new Card("sete","Espadas",7);
        cheap.insert(c1);
        c1 = new Card("oito","Espadas",8);
        cheap.insert(c1);
        c1 = new Card("nove","Espadas",9);
        cheap.insert(c1);
        c1 = new Card("dez","Espadas",10);
        cheap.insert(c1);
        c1 = new Card("valete","Espadas",10);
        cheap.insert(c1);
        c1 = new Card("dama","Espadas",10);
        cheap.insert(c1);
        c1 = new Card("rei","Espadas",10);
        cheap.insert(c1);
    }
}
