package xyz.shanmugavel.structural.adapter.objectpattern;

import java.math.BigDecimal;

public class ProviderB {

    public BigDecimal getCurrentBalanceByCardNo(String cardNo) {
        return BigDecimal.ONE;
    }
    public String getCardHolderFullName(String cardNo) {
        return "Vel";
    }
}
