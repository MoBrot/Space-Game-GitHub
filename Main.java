import java.awt.*;
import javax.swing.*;




public class Main {
	private static final int BUTTON_HEIGHT = 50;
	public static final int PANEL_SIZE_X = 1600;
	public static final int PANEL_SIZE_Y = 900;
	public static final int MAX_PLANET_RADIUS = 100;
	public static final int MIN_PLANET_RADIUS = 20;
	public static String KillCounter1String = "0";
	public static String KillCounter2String = "0";
	public static boolean StarWarsMode = false;
	public static boolean NormalMode = false;
	public static int KillCount1;
	public static int KillCount2;
	public static int activeplayer = 0;
	public static String InputCountPlanets;
	public static boolean Shoot = false;
	public static boolean Start = false;
    public static String InputAnglePlayer1;
	public static String InputAnglePlayer2;
    public static String InputSpeedPlayer1;
	public static String InputSpeedPlayer2;
	public static String TextForLabelAnglePlayer1;
	public static String TextForLabelSpeedPlayer1;
	public static JButton CreateGameButton;
	public static JButton ResetGameButton;
	public static JButton ShootButtonPlayer1;
	public static JButton ShootButtonPlayer2;
	public static JButton AngleButtonPlayer1;
	public static JButton AngleButtonPlayer2;
    public static JButton SpeedButtonPlayer1;
	public static JButton SpeedButtonPlayer2;
	public static JButton StartButton;
	public static JButton StarWarsModeButton;
	public static JButton NormalModeButton;
	public static JPanel pan1;
	public static JPanel StartGamePanel;
	public static JFrame frame;
    public static JTextField textFieldAnglePlayer1;
	public static JTextField textFieldAnglePlayer2;
    public static JTextField textFieldSpeedPlayer1;
	public static JTextField textFieldSpeedPlayer2;
	public static JTextField textFieldCountPlanets;
	public static JTextField textFieldPossibilityBH;
	public static JLabel LabelAnglePlayer1;
	public static JLabel LabelAnglePlayer2;
	public static JLabel LabelSpeedPlayer1;
	public static JLabel LabelSpeedPlayer2;
	public static JLabel LabelCountPlanets;
	public static JLabel KillCounterPlayer1;
	public static JLabel KillCounterPlayer2;
	public static JLabel CustomizeGameLabel;
	public static JLabel LabelPossibilityBH;
	public static JLabel LabelModes;
	public static JLabel StarWarsModeLabel;
	public static JLabel NormalModeLabel;
	public static ActionHandler handler;

	private final int CustomizeGameLabelLength = PANEL_SIZE_X / 2;
	private final int CustomizeGameLabelHeigth = PANEL_SIZE_Y / 10;
	private final int TaskBarY = 65;

	
	
	
	public Main(){
		gui();
		
	}
	
	
	
	
	
	public void gui() {
		
		
		
		
		
		frame = new JFrame ("Space Game");
		ImageIcon image = new ImageIcon("Rakete Icon.png");
		frame.setIconImage(image.getImage());
		frame.setSize(PANEL_SIZE_X, PANEL_SIZE_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		//frame.setLocationRelativeTo(null);
		frame.requestFocus();
		frame.setBackground(Color.BLACK);
		frame.setIconImage(image.getImage());
		frame.setExtendedState(frame.MAXIMIZED_BOTH);


		
		
		// Action handler
		handler = new ActionHandler();
		
		// Create CreateGameButton
		CreateGameButton = new JButton("Start");
		CreateGameButton.setBounds(PANEL_SIZE_X / 2 - 100, PANEL_SIZE_Y / 6, 200, 100);
		CreateGameButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		CreateGameButton.addActionListener(handler);
		CreateGameButton.setVisible(true);
		CreateGameButton.setIcon(new ImageIcon("Frage1V3.png"));
		CreateGameButton.setPressedIcon(new ImageIcon("Frage1V3Pressed.png"));
		CreateGameButton.setRolloverIcon(new ImageIcon("Frage1V3Rollover.png"));
		

		ResetGameButton = new JButton("Reset Game");
		ResetGameButton.setBounds(PANEL_SIZE_X / 2 - 50, 0, 100, BUTTON_HEIGHT);
		ResetGameButton.addActionListener(handler);

		KillCounterPlayer1 = new JLabel(KillCounter1String);
		KillCounterPlayer1.setBounds(PANEL_SIZE_X / 2 - 60, 0, 10, 50);
		KillCounterPlayer1.setForeground(Color.red);
		KillCounterPlayer1.setVisible(true);

		KillCounterPlayer2 = new JLabel(KillCounter2String);
		KillCounterPlayer2.setBounds(PANEL_SIZE_X / 2 + 52, 0, 10, 50);
		KillCounterPlayer2.setForeground(Color.red);
		KillCounterPlayer2.setVisible(true);

/*
		AngleButtonPlayer1 = new JButton("Angle");
		AngleButtonPlayer1.setBounds(70, 0, 70, 30);
		AngleButtonPlayer1.addActionListener(handler);
		AngleButtonPlayer1.setVisible(true);
*/		 

		/*
		// Create Button for Angle
		Main.AngleButtonPlayer1 = new JButton("Angle");
		Main.AngleButtonPlayer1.setBounds(70, 0, 70, 30);
		Main.AngleButtonPlayer1.addActionListener(handler);

        // Create Button for Speed
		Main.SpeedButtonPlayer1 = new JButton("Speed");
		Main.SpeedButtonPlayer1.setBounds(70, 30, 70, 30);
		Main.SpeedButtonPlayer1.addActionListener(handler);
*/

		//menu player 1
		ShootButtonPlayer1 = new JButton("Shoot");
		ShootButtonPlayer1.setBounds(0, 60, 100, BUTTON_HEIGHT);
		ShootButtonPlayer1.addActionListener(handler);

		textFieldAnglePlayer1 = new JTextField();
		textFieldAnglePlayer1.setBounds(0, 0, 70, 30);
		

		textFieldSpeedPlayer1 = new JTextField();
		textFieldSpeedPlayer1.setBounds(0, 30, 70, 30);
		

		LabelAnglePlayer1 = new JLabel(TextForLabelAnglePlayer1);
		LabelAnglePlayer1.setBounds(140, 0, 70, 30);
		LabelAnglePlayer1.setOpaque(true);
		LabelAnglePlayer1.setBackground(Color.black);
		LabelAnglePlayer1.setForeground(Color.red);
		LabelAnglePlayer1.setVisible(false);

		LabelSpeedPlayer1 = new JLabel(TextForLabelSpeedPlayer1);
		LabelSpeedPlayer1.setBounds(140, 30, 70, 30);
		LabelSpeedPlayer1.setOpaque(true);
		LabelSpeedPlayer1.setBackground(Color.black);
		LabelSpeedPlayer1.setForeground(Color.red);
		LabelSpeedPlayer1.setVisible(false);

		SpeedButtonPlayer1 = new JButton("Speed");
		SpeedButtonPlayer1.setBounds(70, 30, 70, 30);
		SpeedButtonPlayer1.addActionListener(handler);

		AngleButtonPlayer1 = new JButton("Angle");
		AngleButtonPlayer1.setBounds(70, 0, 70, 30);
		AngleButtonPlayer1.addActionListener(handler);
		 


		//menu player 2
		ShootButtonPlayer2 = new JButton("Shoot");
		ShootButtonPlayer2.setBounds(PANEL_SIZE_X - 100, 60, 100, BUTTON_HEIGHT);
		ShootButtonPlayer2.addActionListener(handler);

		textFieldAnglePlayer2 = new JTextField();
		textFieldAnglePlayer2.setBounds(PANEL_SIZE_X - 210, 0, 70, 30);
		

		textFieldSpeedPlayer2 = new JTextField();
		textFieldSpeedPlayer2.setBounds(PANEL_SIZE_X - 210, 30, 70, 30);
		

		LabelAnglePlayer2 = new JLabel(TextForLabelAnglePlayer1);
		LabelAnglePlayer2.setBounds(PANEL_SIZE_X - 70, 0, 70, 30);
		LabelAnglePlayer2.setOpaque(true);
		LabelAnglePlayer2.setBackground(Color.black);
		LabelAnglePlayer2.setForeground(Color.red);
		LabelAnglePlayer2.setVisible(false);

		LabelSpeedPlayer2 = new JLabel(TextForLabelSpeedPlayer1);
		LabelSpeedPlayer2.setBounds(PANEL_SIZE_X - 70, 30, 70, 30);
		LabelSpeedPlayer2.setOpaque(true);
		LabelSpeedPlayer2.setBackground(Color.black);
		LabelSpeedPlayer2.setForeground(Color.red);
		LabelSpeedPlayer2.setVisible(false);

		AngleButtonPlayer2 = new JButton("Angle");
		AngleButtonPlayer2.setBounds(PANEL_SIZE_X - 140, 0, 70, 30);
		AngleButtonPlayer2.addActionListener(handler);

		SpeedButtonPlayer2 = new JButton("Speed");
		SpeedButtonPlayer2.setBounds(PANEL_SIZE_X - 140, 30, 70, 30);
		SpeedButtonPlayer2.addActionListener(handler);



		//Create/Start Game Panel

		Font fontHeading = new Font("Verdana", Font.PLAIN, PANEL_SIZE_Y / 12);
		Font fontSubheadings = new Font("Verdana", Font.PLAIN, PANEL_SIZE_Y / 30);

		StartGamePanel = new JPanel();
		StartGamePanel.setBackground(Color.black);
		StartGamePanel.setLayout(null);

		StartButton = new JButton("Start Game");
		StartButton.setBounds(PANEL_SIZE_X / 2 - 220 / 2, PANEL_SIZE_Y - 75 - TaskBarY, 220, 75);
		StartButton.setFont(fontSubheadings);
		StartButton.setForeground(Color.red);
		StartButton.addActionListener(handler);

		textFieldCountPlanets = new JTextField();
		textFieldCountPlanets.setBounds(PANEL_SIZE_X / 10, PANEL_SIZE_Y / 5, 100, 40);
		textFieldCountPlanets.setBackground(Color.white);
		textFieldCountPlanets.setForeground(Color.red);
		textFieldCountPlanets.setFont(fontSubheadings);

		LabelCountPlanets = new JLabel("Planets");
		LabelCountPlanets.setBounds(PANEL_SIZE_X / 10 + 100, PANEL_SIZE_Y / 5, 120, 40);
		LabelCountPlanets.setFont(fontSubheadings);
		LabelCountPlanets.setForeground(Color.red);

		

		CustomizeGameLabel = new JLabel();
		CustomizeGameLabel.setText("Create your Game!");
		CustomizeGameLabel.setBounds(PANEL_SIZE_X / 2 - CustomizeGameLabelLength / 2, 0, CustomizeGameLabelLength, CustomizeGameLabelHeigth);
		CustomizeGameLabel.setForeground(Color.red);
		CustomizeGameLabel.setBackground(Color.black);
		CustomizeGameLabel.setFont(fontHeading);


		textFieldPossibilityBH = new JTextField();
		textFieldPossibilityBH.setBounds(PANEL_SIZE_X / 10, PANEL_SIZE_Y / 5 + PANEL_SIZE_Y / 10, 100, 40);
		textFieldPossibilityBH.setForeground(Color.red);
		textFieldPossibilityBH.setFont(fontSubheadings);

		LabelPossibilityBH = new JLabel();
		LabelPossibilityBH.setText("Possibility of black hole (percent)");
		LabelPossibilityBH.setBounds(PANEL_SIZE_X / 10 + 100, PANEL_SIZE_Y / 5 + PANEL_SIZE_Y / 10, 550, 40);
		LabelPossibilityBH.setFont(fontSubheadings);
		LabelPossibilityBH.setForeground(Color.red);

		StarWarsModeButton = new JButton("Star Wars");
		StarWarsModeButton.setBounds((PANEL_SIZE_X / 5) * 3, PANEL_SIZE_Y / 5 + PANEL_SIZE_Y / 10, 200, 50);
		StarWarsModeButton.setBackground(Color.black);
		StarWarsModeButton.setFont(fontSubheadings);
		StarWarsModeButton.setForeground(Color.red);
		StarWarsModeButton.addActionListener(handler);

		StarWarsModeLabel = new JLabel("");
		StarWarsModeLabel.setBounds((PANEL_SIZE_X / 5) * 3,  PANEL_SIZE_Y / 3 + 30, 200, 30);
		StarWarsModeLabel.setBackground(Color.black);
		StarWarsModeLabel.setForeground(Color.red);
		StarWarsModeLabel.setFont(fontSubheadings);

		NormalModeButton = new JButton("Normal");
		NormalModeButton.setBounds((PANEL_SIZE_X / 5) * 3 + 250, PANEL_SIZE_Y / 5 + PANEL_SIZE_Y / 10, 200, 50);
		NormalModeButton.setBackground(Color.black);
		NormalModeButton.setFont(fontSubheadings);
		NormalModeButton.setForeground(Color.red);
		NormalModeButton.addActionListener(handler);

		NormalModeLabel = new JLabel("");
		NormalModeLabel.setBounds((PANEL_SIZE_X / 5) * 3 + 250,  PANEL_SIZE_Y / 3 + 30, 200, 30);
		NormalModeLabel.setBackground(Color.black);
		NormalModeLabel.setForeground(Color.red);
		NormalModeLabel.setFont(fontSubheadings);

		LabelModes = new JLabel("Modes");
		LabelModes.setBounds((PANEL_SIZE_X / 5) * 3 + 100, PANEL_SIZE_Y / 5, 250, 70);
		LabelModes.setBackground(Color.black);
		LabelModes.setForeground(Color.red);
		LabelModes.setFont(fontHeading);
		
		
			

		StartGamePanel.add(CustomizeGameLabel);
		StartGamePanel.add(textFieldCountPlanets);
		StartGamePanel.add(LabelCountPlanets);
		StartGamePanel.add(StartButton);
		StartGamePanel.add(LabelPossibilityBH);
		StartGamePanel.add(textFieldPossibilityBH);
		StartGamePanel.add(StarWarsModeButton);
		StartGamePanel.add(NormalModeButton);
		StartGamePanel.add(LabelModes);
		StartGamePanel.add(StarWarsModeLabel);
		StartGamePanel.add(NormalModeLabel);

		// Create main panel
		pan1 = new JPanel();
		pan1.setBackground(Color.black);
		pan1.setLayout(null); // set to x,y coordinates (0,0) is upper left
		
		
		pan1.add(CreateGameButton);
		
		// Add main panel to frame and make visible
		frame.add(pan1);
		frame.setVisible(true);
	}

	
	
	
	
	public static void main(String[] args) {
		
		new Main();
		
	}

}