package com.valorant.tierList.Controller;

import com.valorant.tierList.Entity.Agent;
import com.valorant.tierList.Service.AgentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {

    private AgentService agentService;

    public AgentController(AgentService agentService){
        this.agentService = agentService;
    }

    @PostMapping
    public ResponseEntity<Agent> createAgent(@RequestBody Agent agent){
        Agent newAgent = agentService.createAgent(agent);
        return new ResponseEntity<>(newAgent, HttpStatus.CREATED);
    }

    @GetMapping("/agent/{id}")
    public ResponseEntity<Agent> readById(@PathVariable("id") long id) throws Exception{
        if (new ResponseEntity<>(agentService.readAgentById(id), HttpStatus.OK) == null) throw new Exception("Error! Cannot find Agent by given ID");
        else {
            return new ResponseEntity<Agent>(agentService.readAgentById(id), HttpStatus.OK);
        }
    }

    @GetMapping
    public ResponseEntity<List<Agent>> readAllAgents(){
        List<Agent> agentList = agentService.readAllAgents();
        return new ResponseEntity<>(agentList, HttpStatus.OK);
    }

    @DeleteMapping(path = "{id}")
    public void deleteAgentById(@PathVariable("id") long id){
        agentService.deleteAgentById(id);
    }
}
