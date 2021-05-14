package com.valorant.tierList.Service;

import com.valorant.tierList.Entity.Map;
import com.valorant.tierList.Repository.MapRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MapService {
    @Autowired
    private MapRepo mapRepo;

    public MapService(MapRepo mapRepo){
        this.mapRepo = mapRepo;
    }

    public Map createMap(Map map){
        if (mapRepo.existsById(map.getMapId())){
            throw new IllegalStateException("Sorry tha Map is already in the System!");
        } else {
            return mapRepo.save(map);
        }
    }

    public Map readMapById(long id){
        return mapRepo.findById(id);
    }

    public Map readMapByName(String name){
        return mapRepo.findByName(name);
    }

    public List<Map> readAllMaps(){
        List<Map> mapList = mapRepo.findAll();
        if (mapList.size() == 0){
            return null;
        } else {
            return mapList;
        }
    }

}
