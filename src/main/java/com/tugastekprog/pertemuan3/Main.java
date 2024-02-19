package com.tugastekprog.pertemuan3;

import com.tugastekprog.pertemuan3.linux.*;

/**
 * Implementation of the program
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
public class Main {

    /**
     * Main function of the program
     * @param args
     */
    public static void main(String[] args) {
        // Membuat object dari operating system secara langsung
        Windows windows10 = new Windows("Windows 10", "NT 10", "10.0.22631", "x64");
        MacOS monterey = new MacOS("MacOS Monterey", "14.0", "5.2", "arm86");
        Linux linuxMint = new Linux("Linux Mint Edge", "23.0", "5.7", "x64");
        
        // Membuat operating system dari yang sudah ada
        Debian debian12 = new Debian("12", "5.2", "x64");
        RedHat rhel9 = new RedHat("9", "5.6", "x64");
        
        // Setup OS hanya mensimulasikan dan mencontohkan bagaimana method dapat dioverride
        windows10.setupOS();
        linuxMint.setupOS();
        debian12.setupOS();
        rhel9.setupOS();
        monterey.setupOS();
        System.out.println();

        // Informasi semua operating system
        System.out.println(windows10.getProductName() + " SPECIFICATION: ");
        windows10.showSpecification();
        System.out.println();

        System.out.println(linuxMint.getProductName() + " SPECIFICATION: ");
        linuxMint.showSpecification();
        System.out.println();
        
        System.out.println(debian12.getProductName() + " SPECIFICATION: ");
        debian12.showSpecification();
        System.out.println();
        
        System.out.println(rhel9.getProductName() + " SPECIFICATION: ");
        rhel9.showSpecification();
        System.out.println();
        
        System.out.println(monterey.getProductName() + " SPECIFICATION: ");
        monterey.showSpecification();
        System.out.println();
    }
}