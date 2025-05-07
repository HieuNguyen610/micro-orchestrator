package hieu.inventoryservice.controller;

import hieu.commondto.dto.InventoryRequestDTO;
import hieu.commondto.dto.InventoryResponseDTO;
import hieu.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("/deduct")
    public InventoryResponseDTO deduct(@RequestBody final InventoryRequestDTO requestDTO){
        return this.inventoryService.deductInventory(requestDTO);
    }

    @PostMapping("/add")
    public void add(@RequestBody final InventoryRequestDTO requestDTO){
        this.inventoryService.addInventory(requestDTO);
    }

}
