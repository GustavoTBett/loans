package com.gustavoTBett.Loans.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gustavo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    private LoanType type;
    private int interestRate;
}
