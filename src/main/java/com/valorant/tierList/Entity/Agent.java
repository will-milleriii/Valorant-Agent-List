package com.valorant.tierList.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Agent {
    @Id
    @GeneratedValue
    private long agentId;
    private String name;
    private String role;
    private String origin;
    private String ultimate;
    private boolean isRadiant;
    private char tier;

    public Agent(){}



    public Agent(long agentId, String name, String role, String origin, String ultimate, boolean isRadiant, char tier) {
        this.agentId = agentId;
        this.name = name;
        this.role = role;
        this.origin = origin;
        this.ultimate = ultimate;
        this.isRadiant = isRadiant;
        this.tier = tier;
    }

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    public boolean isRadiant() {
        return isRadiant;
    }

    public void setRadiant(boolean radiant) {
        isRadiant = radiant;
    }

    public char getTier() {
        return tier;
    }

    public void setTier(char tier) {
        this.tier = tier;
    }
}
