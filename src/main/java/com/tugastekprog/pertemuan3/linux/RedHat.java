package com.tugastekprog.pertemuan3.linux;

/**
 * Red Hat Enterprise Linux
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
public class RedHat extends Linux{

    /**
     * Constructor for Red Hat Enterprise Linux
     * @param version
     * @param kernelVer
     * @param architecture
     */
    public RedHat(String version, String kernelVer, String architecture) {
        super("Red Hat Enterprise Linux", version, kernelVer, architecture);
        setDesktopEnvironment("GNOME");
        setPackageFomat("rpm");
        setPackageManager("dnf");
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
