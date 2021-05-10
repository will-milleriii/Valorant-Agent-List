package com.valorant.tierList.Service;

import com.valorant.tierList.Entity.Agent;
import com.valorant.tierList.Repository.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
    @Autowired
    private AgentRepo agentRepo;

    public AgentService(AgentRepo agentRepo){
        this.agentRepo = agentRepo;
    }

    public Agent createAgent(Agent agent){
        return agentRepo.save(agent);
    }

    public Agent readAgentById(long id){
        return agentRepo.findById(id);
    }

    public void deleteAgentById(long id){
        boolean agentExists = agentRepo.existsById(id);

        if (!agentExists){
            throw new IllegalStateException(
                    "Agent with id " + id + " cannot be found in the database"
            );
        }

        agentRepo.deleteById(id);
    }
}
