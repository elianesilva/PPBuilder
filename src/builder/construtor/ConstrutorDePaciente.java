/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.construtor;

import builder.sistema.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alunos
 */
public class ConstrutorDePaciente {
    private Paciente paciente = new Paciente();
    
    public void buildNome(String nome){
        paciente.setNome(nome);
    }
    public void buildCpf(String cpf){
        paciente.setCpf(cpf);
    }
     public void buildEndereco(String endereco){
        paciente.setEndereco(endereco);
    }
      public void buildDataNasc(String dataNasc){
         // DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        paciente.setDataNasc(data);
    }
       public void buildPeso(double peso){
        paciente.setPeso(peso);
    }
       public void buildAltura(double altura){
        paciente.setAltura(altura);
    }
      /* O atributo idade foi removido da classe.
       public void buildIdade(){
        //   LocalDate dataAtual =LocalDate.now();
           Period periode = Period.between(LocalDate.now(), paciente.getDataNasc());
        paciente.setIdade(periodo.getYears());
    }*/
        public void buildSexo(String sexo){
        paciente.setSexo(sexo);
    }
         public void buildTipoSanguineo(String tipoSanguineo){
        paciente.setTipoSanguineo(tipoSanguineo);
    }
         public Paciente getPaciente(){
             return this.paciente;
         }
}
