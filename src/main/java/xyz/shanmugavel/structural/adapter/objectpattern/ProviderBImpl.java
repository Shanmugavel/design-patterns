package xyz.shanmugavel.structural.adapter.objectpattern;

import xyz.shanmugavel.structural.adapter.CardAdapter;

import java.math.BigDecimal;

public class ProviderBImpl implements CardAdapter {


    private ProviderB provider;

    public ProviderBImpl() {
        this.provider = new ProviderB();
    }

    @Override
    public BigDecimal getBalance(String cardNo) {
        return provider.getCurrentBalanceByCardNo(cardNo);
    }

    @Override
    public String getHolderName(String cardNo) {
        return provider.getCardHolderFullName(cardNo);
    }
}
