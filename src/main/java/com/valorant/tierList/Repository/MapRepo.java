package com.valorant.tierList.Repository;

import com.valorant.tierList.Entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapRepo extends JpaRepository<Map, Long> {

    Map findById(long id);
    Map findByName(String name);
    List<Map> findAllMapsByName(String name);
}
