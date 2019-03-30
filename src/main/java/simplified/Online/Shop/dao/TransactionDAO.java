package simplified.Online.Shop.dao;

import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public interface TransactionDAO {
    List<Transaction> getAllTransaction();
    void createTransaction(Transaction transaction);
    void createDetailTransaction(int id, List<Product> items);
}
