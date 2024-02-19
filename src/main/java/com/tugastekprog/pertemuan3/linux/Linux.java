package com.tugastekprog.pertemuan3.linux;

import com.tugastekprog.pertemuan3.OperatingSystem;

/**
 * Linux class that extends OperatingSystem
 * @author Yobel El'Roy Doloksaribu
 * @since 19 February 2024
 * @version 1.0
 */
public class Linux extends OperatingSystem {
    private String packageManager;
    private String packageFomat;
    private String desktopEnvironment;
    private String releaseArch;

    /**
     * @return the packageManager
     */
    protected String getPackageManager() {
        return packageManager;
    }

    /**
     * @param packageManager the packageManager to set
     */
    protected void setPackageManager(String packageManager) {
        this.packageManager = packageManager;
    }

    /**
     * @return the packageFomat
     */
    protected String getPackageFomat() {
        return packageFomat;
    }

    /**
     * @param packageFomat the packageFomat to set
     */
    protected void setPackageFomat(String packageFomat) {
        this.packageFomat = packageFomat;
    }

    /**
     * @return the desktopEnvironment
     */
    protected String getDesktopEnvironment() {
        return desktopEnvironment;
    }

    /**
     * @param desktopEnvironment the desktopEnvironment to set
     */
    protected void setDesktopEnvironment(String desktopEnvironment) {
        this.desktopEnvironment = desktopEnvironment;
    }

    /**
     * @return the releaseArch
     */
    protected String getReleaseArch() {
        return releaseArch;
    }

    /**
     * @param releaseArch the releaseArch to set
     */
    protected void setReleaseArch(String releaseArch) {
        this.releaseArch = releaseArch;
    }

    /**
     * Constructor for Linux OS
     *
     * @param productName
     * @param version
     * @param kernelVer
     * @param architecture
     */
    public Linux(String productName, String version, String kernelVer, String architecture) {
        super(productName, kernelVer, version, "UNIX-like", architecture);
    }

    /**
     * Setups the OS
     */
    @Override
    public void setupOS() {
        System.out.println("System successfully configured with Linux");
    }

}
