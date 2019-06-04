package OnlineLibrary.Library.DAO.Loan;

import OnlineLibrary.Library.Domain.Loan;

import java.util.List;

public interface LoanDao {

    void addLoan(Loan loan);

    void deleteLoan(long id);

    Loan findLoanById(long id);

    List<Loan> findAllLoans();
}
