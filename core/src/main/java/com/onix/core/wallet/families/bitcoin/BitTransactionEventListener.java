package com.onix.core.wallet.families.bitcoin;

import com.onix.core.network.AddressStatus;
import com.onix.core.network.ServerClient.UnspentTx;
import com.onix.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
