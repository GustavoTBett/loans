package com.gustavoTBett.Loans.service;

import com.gustavoTBett.Loans.dto.EntityPost;
import com.gustavoTBett.Loans.dto.EntityResponse;
import com.gustavoTBett.Loans.dto.Loan;
import com.gustavoTBett.Loans.dto.LoanType;
import com.gustavoTBett.Loans.dto.State;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gustavo
 */
@Service
public class LoanService {

    public EntityResponse verifyWhichLoanType(EntityPost entityPost) {
        EntityResponse entityResponse = new EntityResponse();
        entityResponse.setCustomer(entityPost.getName());
        List<Loan> loans = new ArrayList<>();
        if (entityPost.getIncome() <= 3000) {
            loans.add(new Loan(LoanType.PERSONAL, 4));
            loans.add(new Loan(LoanType.GUARANTEED, 3));
        } else if (entityPost.getIncome() <= 5000 && entityPost.getAge() <= 30 && entityPost.getLocation().equals(State.SP)) {
            loans.add(new Loan(LoanType.PERSONAL, 4));
            loans.add(new Loan(LoanType.GUARANTEED, 3));
        } else if (entityPost.getIncome() >= 5000) {
            loans.add(new Loan(LoanType.CONSIGNMENT, 2));
        }
        entityResponse.setLoans(loans);
        
        return entityResponse;
    }
}
