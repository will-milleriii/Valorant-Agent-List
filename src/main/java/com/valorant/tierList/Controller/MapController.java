package com.valorant.tierList.Controller;

import com.valorant.tierList.Entity.Map;
import com.valorant.tierList.Service.MapService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/valorant/maps")
public class MapController {

    private MapService mapService;

    public MapController(MapService mapService){
        this.mapService = mapService;
    }

    @PostMapping
    public ResponseEntity<Map> createMap(@RequestBody Map map){
        Map newMap = mapService.createMap(map);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map> readById(@PathVariable long id) throws Exception {
        if (new ResponseEntity<>(mapService.readMapById(id), HttpStatus.OK) == null)throw new Exception("Sorry! Cannot find that Map by the given ID");
        else{
            return new ResponseEntity<>(mapService.readMapById(id), HttpStatus.OK);
        }
    }
}
