package com.tugastekprog.pertemuan3;

/**
 * Implementation of MacOS operating system
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
public class MacOS extends OperatingSystem {

    /**
     * Constructor of the MacOS operating system
     * @param productName
     * @param version
     * @param kernelVer
     * @param architecture
     */
    public MacOS(String productName, String version, String kernelVer, String architecture) {
        super(productName, version, kernelVer, "UNIX-LIKE", architecture);
    }

    /**
     * Simulate the setup of the OS
     */
    @Override
    public void setupOS() {
        System.out.println("System successfully configured with MacOS");
    }
}
