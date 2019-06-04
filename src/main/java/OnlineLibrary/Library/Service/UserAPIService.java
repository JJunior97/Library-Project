package OnlineLibrary.Library.Service;

import OnlineLibrary.Library.Domain.Loan;
import OnlineLibrary.Library.Domain.User;

import java.util.List;

public interface UserAPIService {

    User createUser();

    User getUserDetails();

    User editUser();

    void deleteUser();

    Loan createLoan();

    List<Loan> getLoansList();

}
