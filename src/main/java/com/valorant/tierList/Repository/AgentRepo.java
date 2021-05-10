package com.valorant.tierList.Repository;

import com.valorant.tierList.Entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentRepo extends JpaRepository<Agent, Long> {
    Agent findById(long id);
    Agent findByName(String name);
    List<Agent> findAllByName(String name);
    List<Agent> findByRole(String role);
}
