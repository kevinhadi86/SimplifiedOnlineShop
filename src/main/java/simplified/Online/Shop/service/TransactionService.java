package simplified.Online.Shop.service;

import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactionByBuyerId(int id);
    void createTransaction(Transaction transaction);
    Transaction getLastTransaction();
}
