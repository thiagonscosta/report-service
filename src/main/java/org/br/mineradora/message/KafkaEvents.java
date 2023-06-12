package org.br.mineradora.message;

import org.br.mineradora.dto.OpportunityDTO;
import org.br.mineradora.dto.ProposalDTO;
import org.br.mineradora.dto.QuotationDTO;
import org.br.mineradora.service.OpportunityService;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import com.oracle.svm.core.annotate.Inject;

import io.smallrye.common.annotation.Blocking;
import jakarta.transaction.Transactional;

public class KafkaEvents {
 
    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Inject
    OpportunityService opportunityService;

    @Incoming("proposal")
    @Transactional
    public void receiveProposal(ProposalDTO proposal) {
        LOG.info("-- Recebendo nova proposta do Tópico Kafka ---");
        opportunityService.buildOpportunity(proposal);
    }

    @Incoming("quotation")
    @Blocking
    public void receiveQuotation(QuotationDTO quotation) {
        LOG.info("--- Recebendo Nova Cotação de Moeda do Tópico Kafka ---");
        opportunityService.saveQuotation(quotation);
    }
}
