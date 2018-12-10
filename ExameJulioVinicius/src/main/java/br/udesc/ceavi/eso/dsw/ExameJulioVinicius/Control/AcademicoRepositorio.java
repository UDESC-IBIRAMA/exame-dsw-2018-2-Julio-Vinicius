/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.ExameJulioVinicius.Control;

import br.udesc.ceavi.eso.dsw.ExameJulioVinicius.Model.Academico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface AcademicoRepositorio extends JpaRepository<Academico, Long>{
    
}
