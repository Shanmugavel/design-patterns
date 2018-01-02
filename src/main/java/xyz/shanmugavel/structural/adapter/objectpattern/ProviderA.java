package xyz.shanmugavel.structural.adapter.objectpattern;

import java.math.BigDecimal;

public class ProviderA {
    public BigDecimal getCardBalance(String cardNo) {
        return BigDecimal.TEN;
    }
    public String getNameByCardNo(String cardNo) {
        return "Shan";
    }
}
