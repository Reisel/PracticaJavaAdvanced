package ar.com.eduit.curso.java.adv.clase01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Panel extends javax.swing.JFrame {
    private CronometroR cronoR;
    private Thread hiloT;
    public Panel() {
        initComponents();
        
        //Date date=new Date();
        //txtHora.setText(date.toString());
        
        //Calendar cal=Calendar.getInstance();
        //txtHora.setText(cal.getTime()+"");
        
        //JDK 8
        //LocalDateTime ldt=LocalDateTime.now();
        //LocalDate ld=LocalDate.now();
        //LocalTime lt=LocalTime.now();
        //txtHora.setText(lt.toString());
        
        
        new Thread(new HoraR(txtHora)).start();
        
        cronoR=new CronometroR(txtCrono);
        new Thread(cronoR).start();
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCrono = new javax.swing.JTextField();
        btnCronoStart = new javax.swing.JButton();
        btnCronoPause = new javax.swing.JButton();
        btnCronoReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnMusicPlay = new javax.swing.JButton();
        btnMusicPause = new javax.swing.JButton();
        btnMusicStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel");

        jLabel1.setText("Hora: ");

        txtHora.setEditable(false);
        txtHora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Cronometro:");

        txtCrono.setEditable(false);
        txtCrono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCrono.setText("000000");

        btnCronoStart.setText("Start");
        btnCronoStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronoStartActionPerformed(evt);
            }
        });

        btnCronoPause.setText("Pause");
        btnCronoPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronoPauseActionPerformed(evt);
            }
        });

        btnCronoReset.setText("Reset");
        btnCronoReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronoResetActionPerformed(evt);
            }
        });

        jLabel3.setText("Musica:");

        btnMusicPlay.setText("Play");
        btnMusicPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicPlayActionPerformed(evt);
            }
        });

        btnMusicPause.setText("Pause");
        btnMusicPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicPauseActionPerformed(evt);
            }
        });

        btnMusicStop.setText("Stop");
        btnMusicStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCronoPause, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCronoReset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCronoStart, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMusicPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnMusicPause, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMusicStop, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCronoStart)
                    .addComponent(btnCronoPause)
                    .addComponent(btnCronoReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMusicPlay)
                    .addComponent(btnMusicPause)
                    .addComponent(btnMusicStop))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCronoStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronoStartActionPerformed
        // evento btnCronoStart
        cronoR.start();
    }//GEN-LAST:event_btnCronoStartActionPerformed

    private void btnCronoPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronoPauseActionPerformed
        // evento btnCronoPause
        cronoR.pause();
    }//GEN-LAST:event_btnCronoPauseActionPerformed

    private void btnCronoResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronoResetActionPerformed
        // evento btnCronoReset
        cronoR.reset();
    }//GEN-LAST:event_btnCronoResetActionPerformed

    private void btnMusicPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicPlayActionPerformed
        // Evento btnPlayMusic
        if(hiloT==null || !hiloT.isAlive()){
            hiloT=new Thread(new ReproductorRunnable());
            hiloT.start();
        }else{
            //método deprecado
            hiloT.resume();
        }
    }//GEN-LAST:event_btnMusicPlayActionPerformed

    private void btnMusicPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicPauseActionPerformed
        // Evento btnMusicPause
        if(hiloT!=null){
            //método deprecado
            hiloT.suspend();
        }
    }//GEN-LAST:event_btnMusicPauseActionPerformed

    private void btnMusicStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicStopActionPerformed
        // Evento btnMusicStop
        if(hiloT!=null){
            //método deprecado
            hiloT.stop();
        }
    }//GEN-LAST:event_btnMusicStopActionPerformed

    public static void main(String args[]) {
        new Panel().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCronoPause;
    private javax.swing.JButton btnCronoReset;
    private javax.swing.JButton btnCronoStart;
    private javax.swing.JButton btnMusicPause;
    private javax.swing.JButton btnMusicPlay;
    private javax.swing.JButton btnMusicStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCrono;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
