/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.aplicacao;

import builder.construtor.ConstrutorDePaciente;
import builder.sistema.Paciente;

/**
 *
 * @author Alunos
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConstrutorDePaciente construtor = new ConstrutorDePaciente();
        construtor.buildNome("Lanne Rayksa");
        construtor.buildCpf("234.345.567-54");
        construtor.buildEndereco("rua 10, Açailândia");
        construtor.buildAltura(1.55);
        construtor.buildPeso(50.9);
        construtor.buildSexo("F");
        construtor.buildTipoSanguineo("O-");
        construtor.buildDataNasc("04/07/2000");
        
        Paciente paciente = construtor.getPaciente();
        paciente.MostrarDetalhes();
    }
    
}
