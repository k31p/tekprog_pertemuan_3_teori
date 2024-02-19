package com.tugastekprog.pertemuan3;

/**
 * Base class for every Operating System
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
abstract public class OperatingSystem {
    private final String kernelVer;
    private final String osType;
    private final String architecture;
    private final String productName;
    private final String version;
    
    /**
     * Get the product name
     * @return name of the OS
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Get the OS version
     * @return version of the OS
     */
    public String getVersion() {
        return version;
    }

    /**
     * Constructor for operating system
     * @param productName
     * @param version
     * @param kernelVer
     * @param osType
     * @param architecture
     */
    public OperatingSystem(String productName, String version, String kernelVer, String osType, String architecture){
        this.productName = productName;
        this.version = version;
        this.kernelVer = kernelVer;
        this.osType = osType;
        this.architecture = architecture;
    }

    /**
     * Get the kernel version
     * @return kernel version
     */
    public String getKernelVer() {
        return kernelVer;
    }

    /**
     * Get the os type, can be UNIX or UNIX-like
     * @return os type (UNIX or UNIX-like)
     */
    public String getOsType() {
        return osType;
    }

    /**
     * Get the CPU architecture
     * @return cpu architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Abstract method for OS setup
     */
    public abstract void setupOS();

    /**
     * Show the specification of the operating system
     */
    public void showSpecification(){
        System.out.println("PRODUCT NAME        : " + getProductName());
        System.out.println("VERSION             : " + getVersion());
        System.out.println("KERNEL VER          : " + getKernelVer());
        System.out.println("ARCHITECTURE        : " + getArchitecture());
        System.out.println("OS TYPE             : " + getOsType());
    }
}
