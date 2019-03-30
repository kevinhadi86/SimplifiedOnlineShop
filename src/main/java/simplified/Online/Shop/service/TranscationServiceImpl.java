package simplified.Online.Shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import simplified.Online.Shop.dao.TransactionDAO;
import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public class TranscationServiceImpl implements TransactionService {
    @Autowired
    TransactionDAO transactionDAO;

    @Override
    public List<Transaction> getAllTransaction() {
        return null;
    }

    @Override
    public void createTransaction(Transaction transaction) {
        transactionDAO.createTransaction(transaction);
        transactionDAO.createDetailTransaction(transaction.getId(),transaction.getItems());
    }
}
