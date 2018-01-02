package xyz.shanmugavel.structural.adapter.objectpattern;

import xyz.shanmugavel.structural.adapter.CardAdapter;

import java.math.BigDecimal;

public class ProviderAImpl implements CardAdapter {

    private ProviderA provider;

    public ProviderAImpl() {
        this.provider = new ProviderA();
    }

    @Override
    public BigDecimal getBalance(String cardNo) {
        return provider.getCardBalance(cardNo);
    }

    @Override
    public String getHolderName(String cardNo) {
        return provider.getNameByCardNo(cardNo);
    }
}
