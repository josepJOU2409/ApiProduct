/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ApiProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ApiProduct.entity.Product;

/**
 *
 * @author DOCENTE
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
