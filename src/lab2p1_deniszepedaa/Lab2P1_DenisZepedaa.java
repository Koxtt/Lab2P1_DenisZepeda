/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_deniszepedaa;

import java.util.Scanner;

/**
 *
 * @author MARY
 */
public class Lab2P1_DenisZepedaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entry = new Scanner(System.in);
    
    int opc=0;
    double lado1=0;
    double lado2=0;
    double lado3=0;
    double ang1=0;
    double ang2=0;
    double ang3=0;
    double sumal1=0;
    double sumal2=0;
    double sumal3=0;
    double sumaa1=0;
    double sumaa2=0;
    double sumaa3=0;
    double sumta=0;
    int cantb=0;
    int cod=0;
    int cantp=0;
    int func3=0;
    double recargo3d=0;
    double subtotal=0;
    double subtotalb=0;
    double recargo=0;
    double desc=0;
    double totalp=0;
    double x=0;
    double y=0;
    double sumatoria=0;
    
        do {
            //Menu con validacion

            
                          
                System.out.println("Menu de tres opciones");
                System.out.println("Opcion 1-Triangulos Geometricos");
                System.out.println("Opcion 2-Sumatoria de Numeros");
                System.out.println("Opcion 3-Cinecito");
                System.out.println("Opcion 0-Salir");
                opc=entry.nextInt();
                
                //primera opcion
            

 
                if (opc==1) {
                    System.out.println("Usted a seleccionado Triangulos Geometricos");
                    System.out.println(" ");
                    System.out.println("Ingrese el primer lado: ");
                    lado1 = entry.nextDouble();
                    System.out.println("Ingrese el segundo lado: ");
                    lado2 = entry.nextDouble();
                    System.out.println("Ingrese el tercer lado: ");
                    lado3 = entry.nextDouble();
                    System.out.println(" ");
                    System.out.println("Ingrese el primer angulo: ");
                    ang1 = entry.nextDouble();
                    System.out.println("Ingrese el segundo angulo: ");
                    ang2 = entry.nextDouble();
                    System.out.println("Ingrese el tecer angulo: ");
                    ang3 = entry.nextDouble();

                    //sumatoria de lados
                    sumaa1 = ang1 + ang2;
                    sumaa2 = ang2 + ang3;
                    sumaa3 = ang3 + ang1;

                    //suma total de angulos
                    sumta = sumaa1 + sumaa2 + sumaa3;                

                    //suma de lados
                    sumal1 = lado1 + lado2;
                    sumal2 = lado2 + lado3;
                    sumal3 = lado3 + lado1;

                    //validacion para triangulo
                    if (sumta <= 1 || sumta >= 180) {
                        System.out.println("Triangulo Valido");
                        if (sumal1 == sumal2 && sumal2 == sumal3 && sumal3 == sumal1) {
                            System.out.println("Triangulo Isoceles");
                        } else if (sumal1 == sumal2 && sumal2 == sumal3 && sumal3 == sumal1) {
                            System.out.println("Triangulo Equilatero");
                        } else if (sumal1 != sumal2 && sumal2 != sumal3 && sumal3 != sumal1) {
                            System.out.println("Triangulo escaleno");
                        } 

                        if (sumta<90) {
                            System.out.println("El triangulo es un acutangulo");
                        }else if (sumal1 == sumal2 && sumal2 == sumal3 || sumal3 == sumal1) {
                            System.out.println("Triangulo rectangulo");
                        }else if (sumaa1>=90 && sumaa2>=90 && sumaa3>=90) {
                            System.out.println("El triangulo es obtusangulo");
                        }
                        
                    } else {
                        System.out.println("Triangulo no valido");
                        System.out.println("");
                        System.out.println("Presione 0 para salir");
                    }
                }else if (opc==2) {
                    System.out.println("Sumatoria");
                    System.out.println("Ingrese la base K: ");
                    x = entry.nextDouble();
                    System.out.println("Ingrese la potencia: ");
                    y=entry.nextDouble();
                    if (x>=1) {
                        sumatoria=Math.pow(x, y);
                    }else{
                        System.out.println("Error... Ingrese un valor valido que sea positivo");
                    }
                    
                    System.out.println("Output: "+sumatoria);
                    
                }else if(opc ==3 ) {
                        System.out.println("------------------------CINECITO--------------------------------------");
                        System.out.println("CODIGO--CATEGORIA-------PELICULAS INCLUIDAS-----------PRECIO X PERSONA");
                        System.out.println("1-------Infantil--Cenicienta, Enredados, Bella y la Bestia-L. 500.00\n");
                        System.out.println("2-------Comedia-------Son como ninos 1 y 2-----------------L. 360.00\n" );
                        System.out.println("3-------Terror--------El Conjuro, La Monja, Guerra Z-------L. 600.00" );
                        System.out.println("4-------Anime -----------------AOT,KNY --------------------L. 560.00");
                        System.out.println("Ingrese un codigo entre [1-4]");
                        cod = entry.nextInt();
                        System.out.println("Ingrese la cantidad de personas que desean comprar un boleto: ");
                        cantb = entry.nextInt();

                        System.out.println("Cantidad de personas a agrandar palomitas: ");
                        cantp = entry.nextInt();

                        //validacion para maximo de palomitas como numero maximo la cantidad de boletos que se vendieron
                        if (cantp>=1 && cantp<=cantb) {
                            recargo=100*cantb;
                        }

                        System.out.println("Se desea ver la funcion en 3D [1/0]?");
                        func3= entry.nextInt();

                        if (func3>=1 && func3<=cantb) {
                            recargo3d=200*cantb;
                        }


                        if (cod==1) {
                            subtotalb=cantb*500;
                            desc=subtotalb*0.25;
                        }else if (cod==2) {
                            subtotalb=cantb*360;
                            desc=subtotalb*0.15;
                        }else if (cod==3) {
                            subtotalb=cantb*600;
                            desc=subtotalb*0.25;
                        }else if (cod==4) {
                            subtotalb=cantb*560;
                            desc=subtotalb*0.15;
                        }

                        //subtotal base menos el descuento aplicado por medio del codigo seleccionado
                        subtotal=subtotalb-desc;
                        totalp=subtotal+recargo+recargo3d;

                        System.out.println("El subtotal base es de: " +subtotalb );
                        System.out.println("El recargo por palomitas extra-grandes es de: " +recargo);
                        System.out.println("El recargo por sala 3D es de: " +recargo3d);
                        System.out.println("El descuento aplicado es de: " +desc);
                        System.out.println("El total a pagar es de: "  +totalp);
                    } 

            }while (opc != 0);
            //si el usuario ingresa cero termina el programa   
            }
}
            
            
           
           
      
    

