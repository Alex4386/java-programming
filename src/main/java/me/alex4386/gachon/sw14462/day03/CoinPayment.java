package me.alex4386.gachon.sw14462.day03;

import me.alex4386.gachon.sw14462.day03.coins.CoinImpl;
import me.alex4386.gachon.sw14462.day03.coins.Quarter;
import me.alex4386.gachon.sw14462.day03.coins.Dime;
import me.alex4386.gachon.sw14462.day03.coins.Nickel;

import java.util.List;
import java.util.ArrayList;

public class CoinPayment {
    public static CoinImpl[] coins = new CoinImpl[] {
        new Quarter(),
        new Dime(),
        new Nickel()
    };

    int amount;

    public CoinPayment(int amount) {
        if (amount % 5 != 0) {
            throw new IllegalArgumentException("Amount must be a multiple of 5");
        }

        this.amount = amount;
    }

    public List<CoinImpl> pay() {
        List<CoinImpl> paidCoins = new ArrayList<>();

        for (CoinImpl coin : coins) {
            while (coin.isPayable(this.amount)) {
                this.amount = coin.reduceFrom(this.amount);
                paidCoins.add(coin);
            }
        }

        return paidCoins;
    }
}
