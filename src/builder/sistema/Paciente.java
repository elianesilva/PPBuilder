/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.sistema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Eliane
 */
public class Paciente {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private String endereco;
    private double peso;
    private double altura;
    //private int idade;
    private String sexo;
    private String tipoSanguineo;

      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   /* public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }*/

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public void MostrarDetalhes(){
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() + "\nData de Nascimento: " 
                + getDataNasc().format( DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ "\nEndereço: " + getEndereco() + "\nCPF: " + getCpf() 
                + "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\nSexo: " 
                + getSexo()+ "\nTipo Sanguineo: " + getTipoSanguineo());
        
    }
    
}
