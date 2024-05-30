/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p5herencia;

/**
 *
 * @author jossu
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class IUDispositivoElectronico extends JPanel {
    private BufferedImage image;
    private String imagePath;
    private DispositivoElectronico dispositivo;
    private JLabel imageLabel;

    public IUDispositivoElectronico(String imagePath, DispositivoElectronico dispositivo, int width, int height) {
        this.imagePath = imagePath;
        this.dispositivo = dispositivo;

        try (InputStream is = getClass().getResourceAsStream("/" + imagePath)) {
            if (is == null) {
                throw new IOException("Image not found: " + imagePath);
            }
            image = ImageIO.read(is);
            image = resizeImage(image, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel(new ImageIcon(image));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Añadir MouseListener al JLabel
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked on " + dispositivo.getNombre());
            }
        });

        add(imageLabel, BorderLayout.CENTER);
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(resultingImage, 0, 0, null);
        g2d.dispose();
        return outputImage;
    }
}