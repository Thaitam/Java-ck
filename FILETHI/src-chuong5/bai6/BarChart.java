package bai6;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarChart extends JPanel {

    private List<Integer> values;
    private List<String> labels;

    public BarChart() {
        this.values = new ArrayList<>();
        this.labels = new ArrayList<>();
    }

    public void addBar(int value, String label) {
        this.values.add(value);
        this.labels.add(label);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int barWidth = width / values.size();

        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            maxValue = Math.max(maxValue, value);
        }

        g.setColor(Color.BLACK);
        g.drawLine(0, height - 1, width, height - 1);

        for (int i = 0; i < values.size(); i++) {
            int x1 = i * barWidth + 1;
            int y1 = height - 1;
            int barHeight = (int) ((double) values.get(i) / maxValue * (height - 10));
            g.setColor(Color.BLUE);
            g.fillRect(x1, y1 - barHeight, barWidth - 2, barHeight);
            g.setColor(Color.BLACK);
            g.drawRect(x1, y1 - barHeight, barWidth - 2, barHeight);
            g.drawString(labels.get(i), x1 + 5, height - 3);
        }
    }

    public static void main(String[] args) {
        BarChart chart = new BarChart();
        chart.setPreferredSize(new Dimension(400, 300));
        chart.addBar(100, "A");
        chart.addBar(200, "B");
        chart.addBar(300, "C");

        JFrame frame = new JFrame("Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(chart, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}


