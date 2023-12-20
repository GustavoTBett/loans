package com.gustavoTBett.Loans.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author gustavo
 */
@Getter
@AllArgsConstructor
public enum LoanType {
    PERSONAL('P', "Empréstimo pessoal", "Taxa de juros de 4%"),
    GUARANTEED('G', "Empréstimo consignado" ,"Taxa de juros de 2%"),
    CONSIGNMENT('C', "Empréstimo com garantia", "Taxa de juros de 3%");
    
    private final char id;
    private final String name;
    private final String description;
}
