/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc_project;

/**
 *
 * @author 41321863
 */
import imc_project.Ex2;
import javax.swing.JFrame;

//Main - Nome da classe
public class IMC_Project {

    //Comando principal para execução do programa

    public static void main(String[] args) {
        //Criação de um objeto ex da classe Ex2
        Ex2 ex = new Ex2();
        //posição da tela ao abri-la
        ex.setLocation(400, 200);
        //tornando a tela visível
        ex.setVisible(true);
    }
}

