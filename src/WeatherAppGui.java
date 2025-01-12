/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.ImageIcon;

/**
 *
 * @author win
 */
public class WeatherAppGui extends javax.swing.JFrame {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public WeatherAppGui() {
        initComponents();
        try {
            clientSocket = new Socket("localhost", 1234);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.getRootPane().setDefaultButton(jButton1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        weatherConditionImage = new javax.swing.JLabel();
        temperatureText = new javax.swing.JLabel();
        weatherConditionDesc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        humidityText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        windspeedText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Search.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        weatherConditionImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cloudy.png"))); // NOI18N

        temperatureText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        temperatureText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperatureText.setText("10 C");

        weatherConditionDesc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        weatherConditionDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherConditionDesc.setText("Cloudy");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/humidity.png"))); // NOI18N

        humidityText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        humidityText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        humidityText.setText("humidity");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/windspeed.png"))); // NOI18N
        jLabel5.setRequestFocusEnabled(false);

        windspeedText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        windspeedText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windspeedText.setText("windspeed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(weatherConditionDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weatherConditionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(humidityText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(windspeedText)
                        .addGap(19, 19, 19)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(temperatureText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(weatherConditionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temperatureText)
                .addGap(7, 7, 7)
                .addComponent(weatherConditionDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(humidityText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(windspeedText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String locationName = Search.getText().replace(" ", "");
        String img_WeatherCondition = "";
        try {
                out.println(locationName);
                String weatherData = in.readLine();
                String[] data = weatherData.split(",");
                temperatureText.setText(data[0] + "°C");
                weatherConditionDesc.setText(data[1]);
                humidityText.setText(data[2] + "%");
                windspeedText.setText(data[3] + "m/s");
                img_WeatherCondition = data[4];
                if(img_WeatherCondition != null && img_WeatherCondition.equals("Clear")){
                    weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png")));
                }else if(img_WeatherCondition != null && img_WeatherCondition.equals("Rain")){
                    weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rain.png")));
                }else if(img_WeatherCondition != null && img_WeatherCondition.equals("Snow")){
                    weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/snow.png")));
                }else if(img_WeatherCondition != null && img_WeatherCondition.equals("Thunderstorm")){
                    weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thunderstorm.png")));
                }else if(img_WeatherCondition != null && img_WeatherCondition.equals("Atmosphere")){
                    weatherConditionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atmosphere.png")));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(WeatherAppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherAppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherAppGui().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField Search;
    private javax.swing.JLabel humidityText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel temperatureText;
    private javax.swing.JLabel weatherConditionDesc;
    private javax.swing.JLabel weatherConditionImage;
    private javax.swing.JLabel windspeedText;
    // End of variables declaration                   
}
