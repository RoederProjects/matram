
package core.entities.utils;

import com.enterprisedt.net.ftp.FTPException;
import com.enterprisedt.net.ftp.FileTransferClient;
import java.io.IOException;

/**
 * Class FtpClient handles ftp-based actions like connect to webserver, upload to webserver, download from webserver, change remote directory
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 22.11.2016
 */

public class FtpClient {

    private String host;
    private int port;
    private String username;
    private String password;

    private FileTransferClient ftp;
  
/**
 * Constructor - Creates FTP for given host data
     * @param ftpHost
     * @param ftpUser
     * @param ftpPwd
 */
    public FtpClient(String ftpHost, int ftpPort, String ftpUser, String ftpPwd) {
        
        /**
         * Init fields from constructor arguments
         */
        host = ftpHost;
        port = ftpPort;
        username = ftpUser;
        password = ftpPwd;
       
        /**
         * Init FileTransferClient with class fields
         */
        ftp = new FileTransferClient();
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
       
        try {
            ftp.connect();
        } catch (FTPException | IOException ex) {
            java.util.logging.Logger.getLogger(FtpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

/*******************************************************************************
 * public method changeDir (changes directory on remote-server)
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
