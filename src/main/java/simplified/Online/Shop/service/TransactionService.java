package simplified.Online.Shop.service;

import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransaction();
    void createTransaction(Transaction transaction);
}
