package br.com.fiap.cervejaria.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class CervejaDTO {

    public CervejaDTO(){}

    public CervejaDTO(Integer id, String marca, Double teorAlcolico, Tipo tipo, BigDecimal preco, ZonedDateTime dataLancamento) {
        this.id = id;
        this.marca = marca;
        this.teorAlcolico = teorAlcolico;
        this.tipo = tipo;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
    }

    private Integer id;
    private String marca;
    private Double teorAlcolico;
    private Tipo tipo;
    private BigDecimal preco;
    private ZonedDateTime dataLancamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTeorAlcolico() {
        return teorAlcolico;
    }

    public void setTeorAlcolico(Double teorAlcolico) {
        this.teorAlcolico = teorAlcolico;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public ZonedDateTime getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(ZonedDateTime dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
