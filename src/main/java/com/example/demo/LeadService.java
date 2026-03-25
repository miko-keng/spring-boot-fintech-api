package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Tells Spring: "This is a service"
public class LeadService {

    @Autowired // Tells Spring: "Inject the repository here"
    private LeadRepository leadRepository;

    public Lead processLead(Lead lead) {
        // Simple logic simulating Data Science models
        if (lead.getCreditScore() > 700) {
            lead.setStatus("Approved");
        } else {
            lead.setStatus("REJECTED");
        }
        // Save to H2 Database
        return leadRepository.save(lead);
    }

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

}
