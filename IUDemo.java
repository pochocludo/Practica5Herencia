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
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class IUDemo extends JPanel {
    private BufferedImage image;
    private int x, y, width, height;
    private String imagePath;
    private DispositivoElectronico dispositivo;

    public IUDemo(String imagePath, DispositivoElectronico dispositivo) {
        this.imagePath = imagePath;
        this.dispositivo = dispositivo;
        try {
            image = ImageIO.read(new File(imagePath));
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.x = 0;
            this.y = 0;
        } catch (IOException e) {
            e.printStackTrace();
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isInside(e.getX(), e.getY())) {
                    System.out.println("Clicked on " + dispositivo.getNombre());
                }
            }
        });
    }

    private boolean isInside(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, x, y, this);
        }
    }
}
