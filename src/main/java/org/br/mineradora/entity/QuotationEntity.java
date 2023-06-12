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
@Table(name = "quotation")
@Data 
@NoArgsConstructor
public class QuotationEntity {
    
    @Id 
    @GeneratedValue
    private UUID id;

    private Date date;

    @Column(name = "currency_price")
    private BigDecimal currencyPrice;
}
