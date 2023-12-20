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
public class EntityPost {
    private Long age;
    private String cpf;
    private String name;
    private Long income;
    private State location;
}
