/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ApiProduct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author DOCENTE
 */
@Entity
    @Table (name="Productos")
    @Data
public class Product {
    @Id
    @GeneratedValue
    @Column(name="idProducto")
    private Long id;
    @Column(name="nombreProducto")
    private String name;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="precioUnitario")
    private BigDecimal uniPrice;
    @Column(name="imagenUrl")
    private String imagenUrl;
}
