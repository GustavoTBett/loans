package com.gustavoTBett.Loans.dto;

import java.util.List;
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
public class EntityResponse {
    private String customer;
    private List<Loan> loans;
}
