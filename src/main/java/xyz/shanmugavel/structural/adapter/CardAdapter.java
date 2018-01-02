package xyz.shanmugavel.structural.adapter;

import java.math.BigDecimal;

public interface CardAdapter {
    BigDecimal getBalance(String cardNo);
    String getHolderName(String cardNo);
}
