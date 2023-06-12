package org.br.mineradora.dto;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Builder
@Data
@AllArgsConstructor
@Jacksonized
public class ProposalDTO {
    
    private UUID proposalId;

    private String customer;

    private BigDecimal priceTonne;
}
