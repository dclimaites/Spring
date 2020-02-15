package br.com.fiap.cervejaria.controller;

import br.com.fiap.cervejaria.dto.CervejaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static br.com.fiap.cervejaria.dto.Tipo.*;

@RestController
public class CervejaController {

    private List<CervejaDTO> cervejaDTOList;

    public CervejaController() {
        this.cervejaDTOList = new ArrayList<>();
        this.cervejaDTOList.add(new CervejaDTO(1, "Marca 1", 4.5, PILSEN, BigDecimal.valueOf(12.9), ZonedDateTime.now().minusYears(3)));
        this.cervejaDTOList.add(new CervejaDTO(2, "Marca 2", 3.5, WEIS, BigDecimal.valueOf(7.9), ZonedDateTime.now().minusYears(4)));
        this.cervejaDTOList.add(new CervejaDTO(3, "Marca 3", 7.5, ALE, BigDecimal.valueOf(15.9), ZonedDateTime.now().minusYears(1)));
    }

    @GetMapping
    public List<CervejaDTO> getAll() {
        return cervejaDTOList;
    }
}
