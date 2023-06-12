package org.br.mineradora.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name="oportunity")
@Data 
@NoArgsConstructor
public class OpportunityEntity {

    @Id
    @GeneratedValue 
    private UUID id;

    private Date date;

    @Column(name = "proposal_id")
    private UUID proposalId;

    private String customer;

    @Column(name = "price_tonne")
    private BigDecimal priceTonne;

    @Column(name = "last_currency_quotation")
    private BigDecimal lastCurrencyQuotation;
    
}
