package Converter_Suhu.Converter_Suhu_20200140083;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
;


/**
 *
 * @author Reza Ramadhani
 */
import java.util.Scanner;
public class Suhu{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String k ="konversi[y/n]:";
        Scanner sc=new Scanner(System.in);
        System.out.println("Aplikasi conversi suhu");
        System.out.println("-----------------------------");
        System.out.println(k);
        String ans = sc.next();
        while(ans.equals("y")){
            System.out.println("Pilih jenis suhu yang akan di konversi");
            System.out.println("[1]celcius\n[2]fahrenheit\n[3]kelvin");
            int suhu=sc.nextInt();
            double ceksuhu;
            int pk;
            switch(suhu){
                case 1:
                    System.out.println("Tentukan suhu saat ini(celcius):");
                    ceksuhu = sc.nextFloat();
                    System.out.println("Pilih konversi");
                    System.out.println("[1]fahrenheit\n[2]kelvin");
                    pk = sc.nextInt();
                    if(pk == 1){
                        ceksuhu = ceksuhu *9/5+32;
                        System.out.println("Hasil:"+ceksuhu);
                    }else if(pk == 2){
                        ceksuhu = ceksuhu +273.15;
                        System.out.println("Hasil:"+ceksuhu);
                    }
                    break;
                case 2:
                    System.out.println("Tentukan suhu saat ini(fahrenheit");
                    ceksuhu = sc.nextInt();
                    System.out.println("Pilihan konversi");
                    System.out.println("[1]celcius\n[2]kelvin)");
                    pk = sc.nextInt();
                    if(pk == 1){
                        ceksuhu =(ceksuhu+459.67)*5/9;
                        System.out.println("Hasil:"+ceksuhu);
                    }else if(pk == 2){
                        ceksuhu = 5/9*(ceksuhu + 32) + 273;
                        System.out.println("Hasil :"+ceksuhu);
                    }
                    break;
                case 3:
                    System.out.println("Tentukan nilai suhu saat ini");
                    ceksuhu = sc.nextInt();
                    System.out.println("Pilihan konversi");
                    System.out.println("[1]celcius\n[2]fahrenheit");
                    pk = sc.nextInt();
                    if(pk == 1){
                        ceksuhu = (ceksuhu -273)+32;
                        System.out.println("Hasil:"+ceksuhu);
                    }else if(pk == 2){
                        ceksuhu = 9/5*(ceksuhu -273)+32;
                        System.out.println("Hasil:"+ceksuhu);
                    }
                    break;
                default:
                    System.out.println("Perintah tidak diketahui");
                    break;
            }
            System.out.println(k);
            ans = sc.next();
        }
        if(ans.equals("n")){
            System.out.println("Program selesai.. ");
            System.out.println("Created by Ali Alfaris");
           
                    }
                       
                    }
                    }                    
