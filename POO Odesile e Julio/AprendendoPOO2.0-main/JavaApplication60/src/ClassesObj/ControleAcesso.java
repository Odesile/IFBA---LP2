/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesObj;


import java.util.ArrayList;

public class ControleAcesso {
    
    private ArrayList<Funcionario> Lista = new ArrayList<>();
    
    // FUNÇÃO PARA SALVAR OS FUNCIONÁRIOS
    public boolean salvar(Funcionario f) {
        if (f != null) {
            Lista.add(f);
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Funcionario> exibirlista(){
        return Lista;
    }
}
