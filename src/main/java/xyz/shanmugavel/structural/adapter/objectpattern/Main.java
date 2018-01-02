package xyz.shanmugavel.structural.adapter.objectpattern;

import xyz.shanmugavel.structural.adapter.CardAdapter;

public class Main {
    public static void main(String args[]) {
        String cardNo = "111122223333444";

        CardAdapter provA = new ProviderAImpl();
        provA.getBalance(cardNo);
        provA.getHolderName(cardNo);

        CardAdapter provB = new ProviderBImpl();
        provB.getBalance(cardNo);
        provB.getHolderName(cardNo);

    }
}
