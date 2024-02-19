package com.tugastekprog.pertemuan3;

/**
 * Windows class that extends OperatingSystem
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
public class Windows extends OperatingSystem {    
    /**
     * Constructor for Windows
     * @param productName
     * @param version
     * @param kernelVer
     * @param architecture
     */
    public Windows(String productName, String version, String kernelVer, String architecture){
        super(productName, version, kernelVer, "UNIX", architecture);
    }

    /**
     * Setup the OS
     */
    @Override
    public void setupOS() {
        System.out.println("System successfully configured with Windows");    
    }
}
