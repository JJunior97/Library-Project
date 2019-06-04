package OnlineLibrary.Library.DAO.Loan;

import OnlineLibrary.Library.Domain.Loan;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("loanDao")
@Transactional
public class LoanDaoImpl implements LoanDao {

    private static final String DELETE_LOAN_BY_ID = "DELETE FROM User u WHERE u.id = :id";
    private static final String FIND_LOAN_BY_ID = "SELECT u FROM User u WHERE u.id = :id";
    private static final String FIND_ALL_LOANS = "SELECT u FROM User u";

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addLoan(Loan loan) {
        entityManager.persist(loan);
    }

    @Override
    public void deleteLoan(long id) {
        Query query = entityManager.createQuery(DELETE_LOAN_BY_ID);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Loan findLoanById(long id) {
        TypedQuery<Loan> query = entityManager.createQuery(FIND_LOAN_BY_ID, Loan.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Loan> findAllLoans() {
        TypedQuery<Loan> query = entityManager.createQuery(FIND_ALL_LOANS, Loan.class);
        return query.getResultList();
    }
}
