package com.gustavoTBett.Loans.controller;

import com.gustavoTBett.Loans.dto.EntityPost;
import com.gustavoTBett.Loans.dto.EntityResponse;
import com.gustavoTBett.Loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gustavo
 */
@RestController
@RequestMapping("")
public class LoanController {
    
    @Autowired
    private LoanService loanService;
    
    @PostMapping
    public ResponseEntity post(@RequestBody EntityPost entityPost) {
        if (entityPost == null || entityPost.getAge() == null || entityPost.getCpf().isBlank() || entityPost.getName().isBlank() || entityPost.getIncome() == null || entityPost.getLocation() == null) {
            return ResponseEntity.status(400).body("Algo ou algum item do corpo da requisição está faltando");
        } else {
            EntityResponse entityResponse = loanService.verifyWhichLoanType(entityPost);
            return ResponseEntity.ok(entityResponse);
        }
    }
        
}
