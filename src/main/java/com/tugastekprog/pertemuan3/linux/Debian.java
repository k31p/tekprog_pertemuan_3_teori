package com.tugastekprog.pertemuan3.linux;

/**
 * Debian is one of the oldest Linux distribution
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
public class Debian extends Linux {
    /**
     * Constructor for Debian
     * @param version
     * @param kernelVer
     * @param architecture
     */
    public Debian(String version, String kernelVer, String architecture) {
        super("Debian", version, kernelVer, architecture);
        setDesktopEnvironment("GNOME");
        setPackageFomat("deb");
        setPackageManager("apt");
        setReleaseArch("stable");
    }
    
    /**
     * Show the specification of the operating system
     */
    @Override
    public void showSpecification(){
        super.showSpecification();
        System.out.println("DESKTOP ENVIRONMENT : " + getDesktopEnvironment());
        System.out.println("PACKAGE MANAGER     : " + getPackageManager());
        System.out.println("PACKAGE FORMAT      : " + getPackageFomat());
        System.out.println("RELEASE TYPE        : " + getReleaseArch());
    }
}
