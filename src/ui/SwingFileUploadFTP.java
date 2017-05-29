package ui;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import model.*;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SwingFileUploadFTP extends javax.swing.JFrame implements PropertyChangeListener {

    public SwingFileUploadFTP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jprogressBar = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();

        jDialog1.setBounds(getBounds());
        jDialog1.setModal(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter the Zip File Name");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter Publisher Full Path");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Townnews Upload");
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));

        jLabel1.setText("Host");

        jLabel2.setText("Publisher");

        jLabel3.setText("Local Path");

        jTextField5.setText("townnews.ftptoday.com");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Progess");

        jprogressBar.setStringPainted(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ashland Daily Press", "Rome News-Tribune_Sunday", "Rome News-Tribune", "The Journal-News", "The Leader", "Poultry Times", "Spooner Advocate", "The Times", "Sawyer Country Record", "Bayfield County Journal", "The-Chronotype", "Price County Review", "Special Sections-The facts", "Special Sections-Daily Times", "Kingsville Record", "Indianapolis Recorder", "Paris Life", "Houston Herald", "The Herald Dispatch", "Catoosa Co. News", "Polk Standard Journal", "Walker Co. Messenger", "Calhoun Times", "Other" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jprogressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jprogressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final JFileChooser fileDialog = new JFileChooser();
        int returnVal = fileDialog.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileDialog.getSelectedFile();
            jTextField7.setText(file.getAbsolutePath());
        } else {
            jTextField7.setText("Can't find file path, cancelled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String host = jTextField5.getText();
        String uploadPath = "";
        int selIndex = jComboBox1.getSelectedIndex();
        if (selIndex == 0) {
            uploadPath = "/contentra/a/apg-wi.com/eedition/ashlanddailypress";
        }
        if (selIndex == 1) {
            uploadPath = "/contentra/n/northwestgeorgianews.com/eedition/romenewstribunesunday";
        }
        if (selIndex == 2) {
            uploadPath = "/contentra/n/northwestgeorgianews.com/eedition/romenewstribune";
        }
        if (selIndex == 3) {
            uploadPath = "/contentra/t/thejournal-news.net/eedition/thejournalnews";
        }
        if (selIndex == 4) {
            uploadPath = "/contentra/p/ptleader.com/eedition/porttownsendleader";
        }
        if (selIndex == 5) {
            uploadPath = "/contentra/p/poultrytimes.com/eedition/poultrytimes";
        }
        if (selIndex == 6) {
            uploadPath = "/contentra/a/apg-wi.com/eedition/spooneradvocate";
        }
        if (selIndex == 7) {
            uploadPath = "/contentra/h/houmatimes.com/eedition/thetimes";
        }
        if (selIndex == 8) {
            uploadPath = "/contentra/a/apg-wi.com/eedition/sawyercountyrecord";
        }
        if (selIndex == 9) {
            uploadPath = "/contentra/a/apg-wi.com/eedition/bayfieldcountyjournal";
        }
        if (selIndex == 10) {
            uploadPath = "/contentra/a/apg-wi.com/eedition/ricelakechronotype";
        }
        if (selIndex == 11) {
            uploadPath = "/contentra/a/apg-wi.com/eedition/pricecountyreview";
        }
        if (selIndex == 12) {
            uploadPath = "/contentra/t/thefacts.com/eedition/specialsections";
        }
        if (selIndex == 13) {
            uploadPath = "/contentra/d/dailytimes.com/eedition/specialsections";
        }
        if (selIndex == 14) {
            uploadPath = "/contentra/k/kingsvillerecord.com/eedition/kingsvillerecordandbishopnews";
        }
        if (selIndex == 15) {
            uploadPath = "/contentra/i/indianapolisrecorder.com/eedition/indianapolisrecorder";
        }
        if (selIndex == 16) {
            uploadPath = "/contentra/t/theparisnews.com/eedition/parislife";
        }
        if (selIndex == 17) {
            uploadPath = "/contentra/h/houstonherald.com/eedition/houstonherald";
        }
        if (selIndex == 18) {
            uploadPath = "/contentra/h/herald-dispatch.com/eedition/theheralddispatch";
        }
        if (selIndex == 19) {
            uploadPath = "/contentra/n/northwestgeorgianews.com/eedition/catoosaconews";
        }
        if (selIndex == 20) {
            uploadPath = "/contentra/n/northwestgeorgianews.com/eedition/polkstandardjournal";
        }
        if (selIndex == 21) {
            uploadPath = "/contentra/n/northwestgeorgianews.com/eedition/walkercomessenger";
        }
        if (selIndex == 22) {
            uploadPath = "/contentra/n/northwestgeorgianews.com/eedition/calhountimes";
        }
        if (selIndex == 23) {
            uploadPath = jTextField2.getText();
        }
        
        String filePath = jTextField7.getText();
        
        try {
            validateFiles();
            validateXML();
        } catch (Exception e) {
            if (valid == 1) {
                JOptionPane.showMessageDialog(this, "input XML NOT VALID as per schema\n" + e);
                return;
            }
            if (valid == 2) {
                JOptionPane.showMessageDialog(this, "input XML NOT WellFormed when replaceing < & >\n" + e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Error : \n" + e);
            return;
        }

        valid = 0;
        jDialog1.setBounds(this.getBounds());
        jDialog1.setVisible(true);
        try {
            createZip();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Creating Zip" + e);
            return;
        }

        File uploadFile = new File(zipName);
        jprogressBar.setValue(0);
        UploadTask task = new UploadTask(host, 21, "contentra", "google54321",
                uploadPath, uploadFile);
        task.addPropertyChangeListener(this);
        task.execute();
        jTextField2.setText("");
        jTextField7.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        zipName = jTextField1.getText();
        jDialog1.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialog2.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (evt.getItem().toString().equals("Other")) {
                jTextField2.setText("");
                jDialog2.setBounds(this.getBounds());
                jDialog2.setVisible(true);

            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            jprogressBar.setValue(progress);
        }
    }

    private void validateXML() throws Exception {
        java.io.File f = new java.io.File(jTextField7.getText());
        //Creating DTD in temp folder
        java.io.InputStream fp = SwingFileUploadFTP.class.getResourceAsStream("schema.dtd");
        java.io.OutputStream op = new java.io.FileOutputStream("c:/windows/temp/schema.dtd");
        int ch = 0;
        while ((ch = fp.read()) != -1) {
            op.write(ch);
        }
        op.flush();
        fp.close();
        op.close();
        //Check validation against schema.DTD
        String fileCont = "";
        for (String line : Files.readAllLines(Paths.get(f.toURI()), StandardCharsets.UTF_8)) {
            fileCont += line + "\n";
        }
        fileCont = fileCont.replaceAll("<!DOCTYPE segments PUBLIC \"-//TOWNNEWS//DTD Segments//EN\" \"http://www.townnews.com/dtd/segment/1.0/schema.dtd\">", "<!DOCTYPE segments SYSTEM \"C:/Windows/Temp/schema.dtd\">");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        db.setErrorHandler(
                new ErrorHandler() {
            public void warning(SAXParseException e) throws SAXException {

            }

            public void error(SAXParseException e) throws SAXException {
                valid = 1;
                throw e;
            }

            public void fatalError(SAXParseException e) throws SAXException {
                valid = 1;
                throw e;
            }
        }
        );
        valid = 1;
        Document doc = db.parse(new InputSource(new StringReader((fileCont))));

        //Check Welformeness
        fileCont = fileCont.replace("&lt;", "<");
        fileCont = fileCont.replace("&gt;", ">");
        dbf.setValidating(false);
        db = dbf.newDocumentBuilder();
        valid = 2;
        doc = db.parse(new InputSource(new StringReader(fileCont)));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SwingFileUploadFTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingFileUploadFTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingFileUploadFTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingFileUploadFTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingFileUploadFTP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JProgressBar jprogressBar;
    // End of variables declaration//GEN-END:variables
    String zipName = "";
    int valid = 0;//1=forvalid 2=welformed

    private void createZip() throws Exception {
        File file = new File(jTextField7.getText());
//        System.out.println(file.getParentFile().getParent());
        FileOutputStream fos = new FileOutputStream(file.getParentFile().getParent() + "\\package-" + jTextField1.getText() + ".zip");
        zipName = file.getParentFile().getParent() + "\\package-" + jTextField1.getText() + ".zip";
        ZipOutputStream zos = new ZipOutputStream(fos);
        File[] files = file.getParentFile().listFiles();
        for (File f : files) {
            addToZipFile(f.getAbsolutePath(), zos);
        }
        zos.close();
        fos.close();
    }

    private void addToZipFile(String fileName, ZipOutputStream zos) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(file.getName());
        zos.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }
        zos.closeEntry();
        fis.close();
    }

    private void validateFiles() throws Exception {
        File file = new File(jTextField7.getText()).getParentFile();
        File[] files = file.listFiles();
        boolean dpiError=false,otherFileError=false;
        java.io.FileWriter writer=new java.io.FileWriter(file.getParentFile().getAbsolutePath()+"/ErrorLog.txt");
        for (File f : files) {
            if (f.getName().endsWith(".jpg")) {
                com.lowagie.text.Image img = com.lowagie.text.Image.getInstance(f.getAbsolutePath());
                if (img.getDpiX() != 300 & img.getDpiX() != 0) {
                    //write to file
                    writer.write("\r\nIncorect DPI ["+img.getDpiX()+"] on Image : "+f.getName());
                    dpiError=true;
                }
            }
            if (f.getName().endsWith(".jpg") | f.getName().endsWith(".xml")) {
            } else {
                //write file
                writer.write("\r\nUnwanted  File : "+f.getName());
                otherFileError=true;
            }
        }
        writer.flush();
        writer.close();
        if(dpiError)
            throw new Exception("Image DPI is not correct\nMore Details See ErrorLog File");
        if(otherFileError)
            throw new Exception("\nOther than xml and jpg file found in Directory\nMore Details See ErrorLog File");
    }
    public void info(){
        System.out.println("This is info");
        System.out.println("info again");
    }
}
