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
        num.add(b);b = new BaseDatos();
        b.setClave("5001-7000");
        b.setNombre("5001-7000");
        num.add(b);b = new BaseDatos();
        b.setClave("7001-9000");
        b.setNombre("7001-9000");
        num.add(b);b = new BaseDatos();
        b.setClave("9001-11000");
        b.setNombre("9001-11000");
        num.add(b);b = new BaseDatos();
        b.setClave("Mas de 11000");
        b.setNombre("Mas de 11000");
        num.add(b);
        return num;
    }

}
