/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import beans.BaseDatos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ElyyzZ BaRruEtA
 */
public class llenarBD {

    public List<BaseDatos> llenaPromedio() {
        List<BaseDatos> promedio = new ArrayList<>();
        BaseDatos b;
        b = new BaseDatos();
        b.setClave("--");
        b.setNombre("--Seleccione--");
        promedio.add(b);
        for (int i = 70; i < 100; i++) {
            b = new BaseDatos();
            b.setClave(String.valueOf(i));
            b.setNombre(String.valueOf(i));
            promedio.add(b);
        }
        return promedio;
    }

    public List<BaseDatos> llenaSangre() {
        List<BaseDatos> Sangre = new ArrayList<>();
        BaseDatos b;
        b = new BaseDatos();
        b.setClave("--");
        b.setNombre("--Seleccione--");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("A+");
        b.setNombre("A+");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("A-");
        b.setNombre("A-");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("B+");
        b.setNombre("B+");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("B-");
        b.setNombre("B-");
        Sangre.add(b);
         Sangre.add(b);
        b = new BaseDatos();
        b.setClave("AB+");
        b.setNombre("AB+");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("AB-");
        b.setNombre("AB-");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("O+");
        b.setNombre("+");
        Sangre.add(b);
        b = new BaseDatos();
        b.setClave("O-");
        b.setNombre("O-");
        Sangre.add(b);
        return Sangre;
    }

    public List<BaseDatos> llenaNumero() {
        List<BaseDatos> num = new ArrayList<>();
        BaseDatos b;
        b = new BaseDatos();
        b.setClave("--");
        b.setNombre("--Seleccione--");
        num.add(b);
        for (int i = 1; i < 10; i++) {
            b = new BaseDatos();
            b.setClave(String.valueOf(i));
            b.setNombre(String.valueOf(i));
            num.add(b);
        }
        return num;
    }

    public List<BaseDatos> llenaIngresos() {
        List<BaseDatos> num = new ArrayList<>();
        BaseDatos b;
        b = new BaseDatos();
        b.setClave("--");
        b.setNombre("--Seleccione--");
        num.add(b);
        b = new BaseDatos();
        b.setClave("Menos 3000");
        b.setNombre("Menos 3000");
        num.add(b);
        b = new BaseDatos();
        b.setClave("3001-5000");
        b.setNombre("3001-5000");
        num.add(b);
        b = new BaseDatos();
        b.setClave("5001-7000");
        b.setNombre("5001-7000");
        num.add(b);
        b = new BaseDatos();
        b.setClave("7001-9000");
        b.setNombre("7001-9000");
        num.add(b);
        b = new BaseDatos();
        b.setClave("9001-11000");
        b.setNombre("9001-11000");
        num.add(b);
        b = new BaseDatos();
        b.setClave("Mas de 11000");
        b.setNombre("Mas de 11000");
        num.add(b);
        return num;
    }
    
      public List<BaseDatos> llenaEdoCivil() {
        List<BaseDatos> Civil = new ArrayList<>();
        BaseDatos b;
        b = new BaseDatos();
        b.setClave("--");
        b.setNombre("--Seleccione--");
        Civil.add(b);
        b = new BaseDatos();
        b.setClave("Soltero");
        b.setNombre("Soltero");
        Civil.add(b);
        b = new BaseDatos();
        b.setClave("Casado");
        b.setNombre("Casado");
        Civil.add(b);
        b = new BaseDatos();
        b.setClave("Divorciado");
        b.setNombre("Divorciado");
        Civil.add(b);
        b = new BaseDatos();
        b.setClave("Unión Libre");
        b.setNombre("Unión Libre");
        Civil.add(b);
        b = new BaseDatos();
        b.setClave("Viudo");
        b.setNombre("Viudo");
        Civil.add(b);
        return Civil;
    }

       public List<BaseDatos> llenaDiscapacidad() {
        List<BaseDatos> lista = new ArrayList<>();
        BaseDatos b;
        b = new BaseDatos();
        b.setClave("--");
        b.setNombre("--Seleccione--");
        lista.add(b);
        b = new BaseDatos();
        b.setClave("Discapacidad Visual");
        b.setNombre("Discapacidad Visual");
        lista.add(b);
        b = new BaseDatos();
        b.setClave("Discapacidad Motriz");
        b.setNombre("Discapacidad Motriz");
        lista.add(b);
        b = new BaseDatos();
        b.setClave("Discapacidad Auditiva");
        b.setNombre("Discapacidad Auditiva");
        lista.add(b);
        b = new BaseDatos();
        b.setClave("Ninguna");
        b.setNombre("Ninguna");
        lista.add(b);
        return lista;
    }
}
