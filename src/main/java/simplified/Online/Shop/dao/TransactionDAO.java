package simplified.Online.Shop.dao;

import simplified.Online.Shop.dto.CartItem;
import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public interface TransactionDAO {
    List<Transaction> getAllTransactionByBuyerId(int id);
    Transaction getLastTransaction();
    void createTransaction(Transaction transaction);
    void createDetailTransaction(int id, List<CartItem> items);
}
