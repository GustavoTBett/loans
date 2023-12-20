package com.gustavoTBett.Loans.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author gustavo
 */
@Getter
@AllArgsConstructor
public enum State {
    AM("Amazonas", "AM", "Manaus"),
    AL("Alagoas", "AL", "Maceió"),
    AC("Acre", "AC", "Rio Branco"),
    AP("Amapá", "AP", "Macapá"),
    BA("Bahia", "BA", "Salvador"),
    PA("Pará", "PA", "Belém"),
    MT("Mato Grosso", "MT", "Cuiabá"),
    MG("Minas Gerais", "MG", "Belo Horizonte"),
    MS("Mato Grosso do Sul", "MS", "Campo Grande"),
    GO("Goiás", "GO", "Goiânia"),
    MA("Maranhão", "MA", "São Luí­s"),
    RS("Rio Grande do Sul", "RS", "Porto Alegre"),
    TO("Tocantins", "TO", "Palmas"),
    PI("Piauí­", "PI", "Teresina"),
    SP("São Paulo", "SP", "São Paulo"),
    RO("Rondônia", "RO", "Porto Velho"),
    RR("Roraima", "RR", "Boa Vista"),
    PR("Paraná", "PR", "Curitiba"),
    CE("Ceará", "CE", "Fortaleza"),
    PE("Pernambuco", "PE", "Recife"),
    SC("Santa Catarina", "SC", "Florianópolis"),
    PB("Paraí­ba", "PB", "João Pessoa"),
    RN("Rio Grande do Norte", "RN", "Natal"),
    ES("Espí­rito Santo", "ES", "Vitória"),
    RJ("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    SE("Sergipe", "SE", "Aracaju"),
    DF("Distrito Federal", "DF", "Brasília");

    private final String nome;
    private final String sigla;
    private final String capital;
    
    public State valueOfState(String siglaEstado) {
        switch (siglaEstado) {
            case "AM":
                return State.AM;
            case "AL":
                return State.AL;
            case "AC":
                return State.AC;
            case "AP":
                return State.AP;
            case "BA":
                return State.BA;
            case "PA":
                return State.PA;
            case "MT":
                return State.MT;
            case "MG":
                return State.MG;
            case "MS":
                return State.MS;
            case "GO":
                return State.GO;
            case "MA":
                return State.MA;
            case "RS":
                return State.RS;
            case "TO":
                return State.TO;
            case "PI":
                return State.PI;
            case "SP":
                return State.SP;
            case "RO":
                return State.RO;
            case "RR":
                return State.RR;
            case "PR":
                return State.PR;
            case "CE":
                return State.CE;
            case "PE":
                return State.PE;
            case "SC":
                return State.SC;
            case "PB":
                return State.PB;
            case "RN":
                return State.RN;
            case "ES":
                return State.ES;
            case "RJ":
                return State.RJ;
            case "SE":
                return State.SE;
            case "DF":
                return State.DF;
            default:
                throw new RuntimeException("Invalid Audit Type ('" + siglaEstado + "').");
        }
    }
}

