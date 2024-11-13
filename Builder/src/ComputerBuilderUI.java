import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerBuilderUI {
    private JFrame frame;
    private JComboBox<String> processorComboBox;
    private JComboBox<String> ramComboBox;
    private JComboBox<String> hardDriveComboBox;
    private JComboBox<String> graphicsCardComboBox;
    private JComboBox<String> osComboBox;
    private JTextArea resultTextArea;

    public ComputerBuilderUI() {
        frame = new JFrame("Computer Builder");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel processorLabel = new JLabel("Processor:");
        processorLabel.setBounds(20, 20, 100, 25);
        frame.add(processorLabel);

        processorComboBox = new JComboBox<>(new String[]{"Intel Core i5", "Intel Core i7", "Intel Core i9"});
        processorComboBox.setBounds(150, 20, 200, 25);
        frame.add(processorComboBox);

        JLabel ramLabel = new JLabel("RAM:");
        ramLabel.setBounds(20, 60, 100, 25);
        frame.add(ramLabel);

        ramComboBox = new JComboBox<>(new String[]{"8 GB", "16 GB", "32 GB"});
        ramComboBox.setBounds(150, 60, 200, 25);
        frame.add(ramComboBox);

        JLabel hardDriveLabel = new JLabel("Hard Drive:");
        hardDriveLabel.setBounds(20, 100, 100, 25);
        frame.add(hardDriveLabel);

        hardDriveComboBox = new JComboBox<>(new String[]{"512 GB SSD", "1 TB SSD", "2 TB HDD"});
        hardDriveComboBox.setBounds(150, 100, 200, 25);
        frame.add(hardDriveComboBox);

        JLabel graphicsCardLabel = new JLabel("Graphics Card:");
        graphicsCardLabel.setBounds(20, 140, 100, 25);
        frame.add(graphicsCardLabel);

        graphicsCardComboBox = new JComboBox<>(new String[]{"Integrated Graphics", "NVIDIA GeForce RTX 3060", "NVIDIA GeForce RTX 3080"});
        graphicsCardComboBox.setBounds(150, 140, 200, 25);
        frame.add(graphicsCardComboBox);

        JLabel osLabel = new JLabel("Operating System:");
        osLabel.setBounds(20, 180, 120, 25);
        frame.add(osLabel);

        osComboBox = new JComboBox<>(new String[]{"Windows 10", "Windows 11", "Linux"});
        osComboBox.setBounds(150, 180, 200, 25);
        frame.add(osComboBox);

        JButton buildButton = new JButton("Build Computer");
        buildButton.setBounds(20, 220, 150, 25);
        frame.add(buildButton);

        resultTextArea = new JTextArea();
        resultTextArea.setBounds(20, 260, 330, 100);
        resultTextArea.setEditable(false);
        frame.add(resultTextArea);

        buildButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buildComputer();
            }
        });

        frame.setVisible(true);
    }

    private void buildComputer() {
        Computer computer = new Computer();
        computer.setProcessor((String) processorComboBox.getSelectedItem());
        computer.setRamSize(Integer.parseInt(((String) ramComboBox.getSelectedItem()).split(" ")[0]));
        computer.setHardDrive((String) hardDriveComboBox.getSelectedItem());
        computer.setGraphicsCard((String) graphicsCardComboBox.getSelectedItem());
        computer.setOperatingSystem((String) osComboBox.getSelectedItem());

        resultTextArea.setText(computer.toString());
    }

    public static void main(String[] args) {
        new ComputerBuilderUI();
    }
}