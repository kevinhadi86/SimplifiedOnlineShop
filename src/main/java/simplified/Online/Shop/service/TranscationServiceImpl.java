package simplified.Online.Shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import simplified.Online.Shop.dao.TransactionDAO;
import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public class TranscationServiceImpl implements TransactionService {
    @Autowired
    TransactionDAO transactionDAO;

    /**
     * Getter method for property transactionDAO.
     *
     * @return property value of transactionDAO
     **/
    public TransactionDAO getTransactionDAO() {
        return transactionDAO;
    }

    /**
     * Setter method for property transactionDAO.
     *
     * @param transactionDAO value to be assigned to property transactionDAO
     */
    public void setTransactionDAO(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @Override
    public List<Transaction> getAllTransactionByBuyerId(int id) {
        return transactionDAO.getAllTransactionByBuyerId(id);
    }

    @Override
    public void createTransaction(Transaction transaction) {
        transactionDAO.createTransaction(transaction);
        Transaction lastTransaction = getLastTransaction();
        transactionDAO.createDetailTransaction(lastTransaction.getId(),transaction.getItems());
    }

    @Override
    public Transaction getLastTransaction() {
        return transactionDAO.getLastTransaction();
    }
}
