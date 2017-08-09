package Tareajava;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Byron G
 */
public class menu {

    public boolean flag = true;
    public int opcion, opcion1;

    String[] usuario;

    public menu() {
        usuario = new String[5];
    }

    public void menu1() {

        while (flag) {

            System.out.println("      TAREA 3");
            System.out.println("     201602511");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palindromas");
            System.out.println("3. Salir");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            

            switch (opcion) {

                case 1:
                    System.out.println("MENU DE USUARIOS");
                    System.out.println("1. Ingresar Usuarios");
                    System.out.println("2. Mostrar Todos Los Usuarios");
                    System.out.println("3. Mostrar Un Usuraio Personalizado");
                    System.out.println("4. Menu Principal");
                    System.out.println("5. Salir");
                    Scanner sc1 = new Scanner(System.in);
                    opcion1 = sc1.nextInt();
                    switch (opcion1) {

                        case 1:

                            for (int i = 0; i < 5; i++) {
                                System.out.println("Ingresar Usuario");
                                Scanner sc2 = new Scanner(System.in);
                                usuario[i] = sc2.nextLine();
                            }
                            break;
                        case 2:
                            System.out.println("Mostrar Todos los usuarios");
                            for (int i = 0; i < 5; i++) {
                                System.out.println(usuario[i]);

                            }
                            break;
                        case 3:
                            upersonalizado();
                            break;
                       
                        case 5:
                            System.exit(0);
                            break;
                
                    }

                    break;

                case 2:
                    
                    System.out.println("PALABRAS PALINDROMAS");
                    System.out.println("Ingresar Palabra");
                    
                    break;

                case 3:
                    flag = false;
                    break;
                

            }
        }
        

    }

    public void upersonalizado() {

        System.out.println("Mostrar un Usuario Personalizado");
        boolean encontrado = false;
        Scanner S = new Scanner(System.in);
        String nombreingresado = S.nextLine();
        int z = 0;
        while (z < usuario.length && !encontrado) {
            if (nombreingresado.equals(usuario[z])) {
                System.out.println(usuario[z]);
                encontrado = true;
            }
            z++;
        }
        if (!encontrado) {
            System.out.println("Usuario no encontrado");
        }
    }
    
         
         }
    
      
                    

