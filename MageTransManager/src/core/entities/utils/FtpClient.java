/*
 * 
 * Copyright (C) 2006 Enterprise Distributed Technologies Ltd
 * 
 * www.enterprisedt.com
 */
package core.entities.utils;

import com.enterprisedt.net.ftp.FTPException;
import com.enterprisedt.net.ftp.FileTransferClient;
import com.enterprisedt.util.debug.Level;
import com.enterprisedt.util.debug.Logger;
import java.io.IOException;

public class FtpClient {

    private String host;
    private String username;
    private String password;

    private FileTransferClient ftp;
    
    /**
     * Logger for Debugging/Output for Log-File
     * set up logger so that we get some output
    **/
    //private Logger log = Logger.getLogger(FtpClient.class);
    
/*******************************************************************************
 * Constructor - Creates FTP for given host data
     * @param ftpHost
     * @param ftpUser
     * @param ftpPwd
 ******************************************************************************/
    public FtpClient(String ftpHost, String ftpUser, String ftpPwd) {
        
    	 /**
         * Logger for Debugging/Output for Log-File
         * set up logger so that we get some output
        **/
        //Logger.setLevel(Level.INFO);
        
        // extract arguments
        host = ftpHost;
        username = ftpUser;
        password = ftpPwd;
        

        // create client
        //log.info("Creating FTP client");
        
        ftp = new FileTransferClient();
        // set remote host
        //log.info("Setting remote host");
        try {
            ftp.setRemoteHost(host);
            ftp.setUserName(username);
            ftp.setPassword(password);
        } catch (FTPException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //this.connect();
    }
    
/*******************************************************************************
 * public method connect
 ******************************************************************************/
    public void connect() {
        // connect to the server
        //log.info("Connecting to server " + host);
        try {
            ftp.connect();
        } catch (FTPException | IOException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //log.info("Connected and logged in to server " + host);
    }

/*******************************************************************************
 * public method changeDir
 ******************************************************************************/
    public void changeDir(String dir) {
        try {
            //log.info("Current dir: " + ftp.getRemoteDirectory());
            //log.info("Changing directory");
            ftp.changeDirectory(dir);
            //log.info("Current dir: " + ftp.getRemoteDirectory());
        } catch (FTPException | IOException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

/*******************************************************************************
 * public method upload
 ******************************************************************************/    
    public void upload(String localFile, String remoteFile) {
        try {
            //log.info("Uploading file");
            ftp.uploadFile(localFile, remoteFile);
            //log.info("File uploaded");
        } catch (FTPException | IOException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

/*******************************************************************************
 * public method download
 ******************************************************************************/    
    public void download(String localFileName, String remoteFileName) {
        try {
            //log.info("downloading file");
            ftp.downloadFile(localFileName, remoteFileName);
            //log.info("File downloaded");
        } catch (FTPException | IOException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

/*******************************************************************************
 * public method disconnect
 ******************************************************************************/
    public void disconnect() {
        try {
            // Shut down client
        	//log.info("Quitting client");
            ftp.disconnect();
        } catch (FTPException | IOException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
