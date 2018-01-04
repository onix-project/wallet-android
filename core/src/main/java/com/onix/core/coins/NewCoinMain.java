package com.onix.core.coins;

import com.onix.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class NewCoinMain extends CoinType {
    private NewCoinMain() {
        id = "newcoin.main";

        addressHeader = 75;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        family = BitFamily.get();
        name = "ONIX";
        symbol = "ONIX";
        uriScheme = "ONIX";
        bip44Index = 99;
        unitExponent = 8;
        feePerKb = value(10000); // 0.0001 AUM
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 AUM
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("ONIX Signed Message:\n");
    }

    private static NewCoinMain instance = new NewCoinMain();
    public static synchronized NewCoinMain get() {
        return instance;
    }
}