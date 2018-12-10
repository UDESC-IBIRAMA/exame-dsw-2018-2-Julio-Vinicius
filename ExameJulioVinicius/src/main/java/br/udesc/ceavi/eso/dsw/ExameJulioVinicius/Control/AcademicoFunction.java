/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.ExameJulioVinicius.Control;

import br.udesc.ceavi.eso.dsw.ExameJulioVinicius.Model.Academico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author user
 */

public class AcademicoFunction {
    
    @Autowired
        AcademicoRepositorio repositorio;
    
 
    @GetMapping("/alunos/")
    public List<Academico> GetAlunos(){
        return repositorio.findAll();
    }
    
    
    
}
