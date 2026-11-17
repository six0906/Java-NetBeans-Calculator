/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;
import java.util.Random;
public class Calculator extends javax.swing.JFrame {
    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String operationCase;
    String History = "";
    boolean newNumber = false;
    int wins = 0;
    int losses = 0;
    int draws = 0;
    Random rand = new Random();
    
    public Calculator() {
    initComponents();
    jtxtResult.setEditable(false);
    jtxtHistory.setEditable(false);
    jScrollPane1.setVisible(false);
    setSize(690, 695);
    setLocationRelativeTo(null);
    }
 
    private void EnterNumbers(String q){
    if (newNumber)
    {
        jtxtResult.setText("");
        newNumber = false;
    }
    String current = jtxtResult.getText();
    if (current.equals("0")){
        current = "";
    }
    jtxtResult.setText(current + q);
    }
    
    private String formatNumber(double value){
    if (value == (long) value){
        return String.valueOf((long) value);
    }
    return String.valueOf(value);
    }
    
    private boolean calculate(){
    if (operationCase==null||jtxtResult.getText().isEmpty()||newNumber){
        return false;
    }
    try{
     NumEnter2 = Double.parseDouble(jtxtResult.getText());   
    }
    catch (NumberFormatException e){
    return false; 
    }
    
    switch (operationCase){
    case "+":
    Result = NumEnter1 + NumEnter2;
    break;
    case "-":
    Result = NumEnter1 - NumEnter2;
    break;
    case"*":
    Result = NumEnter1 * NumEnter2;
    break;
    case "/":
    if (NumEnter2 == 0){
    jtxtResult.setText("Error");
    NumEnter1 = 0;
    operationCase = null;
    newNumber = true;
    return false;
    }
    Result = NumEnter1/NumEnter2;
    break;
    }
    
    String symbol = operationCase;
    if (operationCase.equals("*")){
    symbol = "x";
    }
    if (operationCase.equals("/")){
    symbol = "÷";
    }
    addHistory(formatNumber(NumEnter1) + " " + symbol + " " + formatNumber(NumEnter2) + " = " + formatNumber(Result));
    jtxtResult.setText(formatNumber(Result));
    operationCase = null;
    newNumber = true;
    return true;
    }
    
    private void setOperator(String operator){
    if (jtxtResult.getText().isEmpty()){
    return;   
    }
    if (operationCase!= null && newNumber){
    operationCase = operator;
    return;    
    }
    if (operationCase != null){
    if (!calculate()){
    return;
    }}
    try{
    NumEnter1 = Double.parseDouble(jtxtResult.getText());  
    }
    catch (NumberFormatException e){
    return;   
    }
    operationCase = operator;
    newNumber = true;
    }
    
    private void addHistory(String entry){
    History = entry + "\n" + History;
    jtxtHistory.setText(History);
    }
    
    private void playGame(int player){
    int computer = rand.nextInt(3) + 1;
    if (player == 1){
        jlblYou.setText("You: Rock");
    }
    if (player == 2){
        jlblYou.setText("You: Paper");
    }
    if (player == 3){
        jlblYou.setText("You: Scissors");
    }
    if (computer == 1){
        jlblComputer.setText("Computer: Rock");
    }
    if (computer == 2){
        jlblComputer.setText("Computer: Paper");
    }
    if (computer == 3){
        jlblComputer.setText("Computer: Scissors");
    }

    if (player == computer){
        jlblResult.setText("Draw!");
        draws = draws + 1;
    }
    else if (player == 1 && computer == 3){
        jlblResult.setText("You Win!");
        wins = wins + 1;
    }
    else if (player == 2 && computer == 1){
        jlblResult.setText("You Win!");
        wins = wins + 1;
    }
    else if (player == 3 && computer == 2){
        jlblResult.setText("You Win!");
        wins = wins + 1;
    }
    else{
        jlblResult.setText("You Lose!");
        losses = losses + 1;
    }
    jlblScore.setText("Wins: " + wins + "  Losses: " + losses + "  Draws: " + draws);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnPlusMinus = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnPoint = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnPercentAction = new javax.swing.JButton();
        jbtnHistory = new javax.swing.JButton();
        jbtnSquare = new javax.swing.JButton();
        jbtnSquareRoot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtHistory = new javax.swing.JTextArea();
        jbtnClearHistory = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtnPaper = new javax.swing.JButton();
        jbtnRock = new javax.swing.JButton();
        jbtnResetScore = new javax.swing.JButton();
        jbtnScissors = new javax.swing.JButton();
        jlbltitle = new javax.swing.JLabel();
        jlblYou = new javax.swing.JLabel();
        jlblComputer = new javax.swing.JLabel();
        jlblResult = new javax.swing.JLabel();
        jlblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setBackground(new java.awt.Color(140, 168, 120));
        jtxtResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(this::jtxtResultActionPerformed);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 160));

        jbtnCE.setBackground(new java.awt.Color(192, 57, 43));
        jbtnCE.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(236, 240, 241));
        jbtnCE.setText("CE");
        jbtnCE.setFocusable(false);
        jbtnCE.addActionListener(this::jbtnCEActionPerformed);
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 80, 50));

        jbtnBackspace.setBackground(new java.awt.Color(52, 73, 94));
        jbtnBackspace.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(236, 240, 241));
        jbtnBackspace.setText("←");
        jbtnBackspace.setFocusable(false);
        jbtnBackspace.addActionListener(this::jbtnBackspaceActionPerformed);
        getContentPane().add(jbtnBackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 80, 50));

        jbtnPlusMinus.setBackground(new java.awt.Color(52, 73, 94));
        jbtnPlusMinus.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnPlusMinus.setForeground(new java.awt.Color(236, 240, 241));
        jbtnPlusMinus.setText("±");
        jbtnPlusMinus.setFocusable(false);
        jbtnPlusMinus.addActionListener(this::jbtnPlusMinusActionPerformed);
        getContentPane().add(jbtnPlusMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 80, 70));

        jbtnClear.setBackground(new java.awt.Color(192, 57, 43));
        jbtnClear.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(236, 240, 241));
        jbtnClear.setText("C");
        jbtnClear.setFocusable(false);
        jbtnClear.addActionListener(this::jbtnClearActionPerformed);
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 80, 50));

        jbtnDigit8.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit8.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit8.setText("8");
        jbtnDigit8.setFocusable(false);
        jbtnDigit8.addActionListener(this::jbtnDigit8ActionPerformed);
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 80, 70));

        jbtnDigit7.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit7.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit7.setText("7");
        jbtnDigit7.setFocusable(false);
        jbtnDigit7.addActionListener(this::jbtnDigit7ActionPerformed);
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, 70));

        jbtnPlus.setBackground(new java.awt.Color(230, 126, 34));
        jbtnPlus.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(236, 240, 241));
        jbtnPlus.setText("+");
        jbtnPlus.setFocusable(false);
        jbtnPlus.addActionListener(this::jbtnPlusActionPerformed);
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 80, 70));

        jbtnDigit9.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit9.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit9.setText("9");
        jbtnDigit9.setFocusable(false);
        jbtnDigit9.addActionListener(this::jbtnDigit9ActionPerformed);
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 80, 70));

        jbtnDigit5.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit5.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit5.setText("5");
        jbtnDigit5.setFocusable(false);
        jbtnDigit5.addActionListener(this::jbtnDigit5ActionPerformed);
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 80, 70));

        jbtnDigit4.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit4.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit4.setText("4");
        jbtnDigit4.setFocusable(false);
        jbtnDigit4.addActionListener(this::jbtnDigit4ActionPerformed);
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 80, 70));

        jbtnMinus.setBackground(new java.awt.Color(230, 126, 34));
        jbtnMinus.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(236, 240, 241));
        jbtnMinus.setText("-");
        jbtnMinus.setFocusable(false);
        jbtnMinus.addActionListener(this::jbtnMinusActionPerformed);
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 80, 70));

        jbtnDigit6.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit6.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit6.setText("6");
        jbtnDigit6.setFocusable(false);
        jbtnDigit6.addActionListener(this::jbtnDigit6ActionPerformed);
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 80, 70));

        jbtnDigit2.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit2.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit2.setText("2");
        jbtnDigit2.setFocusable(false);
        jbtnDigit2.addActionListener(this::jbtnDigit2ActionPerformed);
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 80, 70));

        jbtnDigit1.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit1.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit1.setText("1");
        jbtnDigit1.setFocusable(false);
        jbtnDigit1.addActionListener(this::jbtnDigit1ActionPerformed);
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 80, 70));

        jbtnMultiply.setBackground(new java.awt.Color(230, 126, 34));
        jbtnMultiply.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnMultiply.setForeground(new java.awt.Color(236, 240, 241));
        jbtnMultiply.setText("X");
        jbtnMultiply.setFocusable(false);
        jbtnMultiply.addActionListener(this::jbtnMultiplyActionPerformed);
        getContentPane().add(jbtnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 80, 70));

        jbtnDigit3.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit3.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit3.setText("3");
        jbtnDigit3.setFocusable(false);
        jbtnDigit3.addActionListener(this::jbtnDigit3ActionPerformed);
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 80, 70));

        jbtnPoint.setBackground(new java.awt.Color(74, 78, 84));
        jbtnPoint.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnPoint.setForeground(new java.awt.Color(236, 240, 241));
        jbtnPoint.setText(".");
        jbtnPoint.setFocusable(false);
        jbtnPoint.addActionListener(this::jbtnPointActionPerformed);
        getContentPane().add(jbtnPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 80, 70));

        jbtnDigit0.setBackground(new java.awt.Color(74, 78, 84));
        jbtnDigit0.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnDigit0.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDigit0.setText("0");
        jbtnDigit0.setFocusable(false);
        jbtnDigit0.addActionListener(this::jbtnDigit0ActionPerformed);
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 80, 70));

        jbtnDivide.setBackground(new java.awt.Color(230, 126, 34));
        jbtnDivide.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnDivide.setForeground(new java.awt.Color(236, 240, 241));
        jbtnDivide.setText("÷");
        jbtnDivide.setFocusable(false);
        jbtnDivide.addActionListener(this::jbtnDivideActionPerformed);
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 80, 70));

        jbtnEqual.setBackground(new java.awt.Color(230, 126, 34));
        jbtnEqual.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(236, 240, 241));
        jbtnEqual.setText("=");
        jbtnEqual.setFocusable(false);
        jbtnEqual.addActionListener(this::jbtnEqualActionPerformed);
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 80, 70));

        jbtnPercentAction.setBackground(new java.awt.Color(52, 73, 94));
        jbtnPercentAction.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnPercentAction.setForeground(new java.awt.Color(236, 240, 241));
        jbtnPercentAction.setText("%");
        jbtnPercentAction.setFocusable(false);
        jbtnPercentAction.addActionListener(this::jbtnPercentActionActionPerformed);
        getContentPane().add(jbtnPercentAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, 70));

        jbtnHistory.setBackground(new java.awt.Color(192, 57, 43));
        jbtnHistory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnHistory.setForeground(new java.awt.Color(236, 240, 241));
        jbtnHistory.setText("History");
        jbtnHistory.setFocusable(false);
        jbtnHistory.addActionListener(this::jbtnHistoryActionPerformed);
        getContentPane().add(jbtnHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 80, 50));

        jbtnSquare.setBackground(new java.awt.Color(52, 73, 94));
        jbtnSquare.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnSquare.setForeground(new java.awt.Color(236, 240, 241));
        jbtnSquare.setText("x²");
        jbtnSquare.setFocusable(false);
        jbtnSquare.addActionListener(this::jbtnSquareActionPerformed);
        getContentPane().add(jbtnSquare, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 80, 70));

        jbtnSquareRoot.setBackground(new java.awt.Color(52, 73, 94));
        jbtnSquareRoot.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnSquareRoot.setForeground(new java.awt.Color(236, 240, 241));
        jbtnSquareRoot.setText("√x");
        jbtnSquareRoot.setFocusable(false);
        jbtnSquareRoot.addActionListener(this::jbtnSquareRootActionPerformed);
        getContentPane().add(jbtnSquareRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 80, 70));

        jtxtHistory.setBackground(new java.awt.Color(140, 168, 120));
        jtxtHistory.setColumns(20);
        jtxtHistory.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtHistory.setRows(5);
        jScrollPane1.setViewportView(jtxtHistory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 220, 550));

        jbtnClearHistory.setBackground(new java.awt.Color(139, 35, 45));
        jbtnClearHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnClearHistory.setForeground(new java.awt.Color(236, 240, 241));
        jbtnClearHistory.setText("Clear History");
        jbtnClearHistory.setFocusable(false);
        jbtnClearHistory.addActionListener(this::jbtnClearHistoryActionPerformed);
        getContentPane().add(jbtnClearHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 190, 40));

        jPanel1.setBackground(new java.awt.Color(43, 45, 49));
        jPanel1.setForeground(new java.awt.Color(43, 45, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnPaper.setBackground(new java.awt.Color(74, 78, 84));
        jbtnPaper.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnPaper.setForeground(new java.awt.Color(236, 240, 241));
        jbtnPaper.setText("Paper");
        jbtnPaper.setFocusable(false);
        jbtnPaper.addActionListener(this::jbtnPaperActionPerformed);
        jPanel1.add(jbtnPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, 100));

        jbtnRock.setBackground(new java.awt.Color(74, 78, 84));
        jbtnRock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRock.setForeground(new java.awt.Color(236, 240, 241));
        jbtnRock.setText("Rock");
        jbtnRock.setFocusable(false);
        jbtnRock.addActionListener(this::jbtnRockActionPerformed);
        jPanel1.add(jbtnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 100));

        jbtnResetScore.setBackground(new java.awt.Color(139, 35, 45));
        jbtnResetScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnResetScore.setForeground(new java.awt.Color(236, 240, 241));
        jbtnResetScore.setText("Reset Score");
        jbtnResetScore.setFocusable(false);
        jbtnResetScore.addActionListener(this::jbtnResetScoreActionPerformed);
        jPanel1.add(jbtnResetScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 270, 60));

        jbtnScissors.setBackground(new java.awt.Color(74, 78, 84));
        jbtnScissors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnScissors.setForeground(new java.awt.Color(236, 240, 241));
        jbtnScissors.setText("Scissors");
        jbtnScissors.setFocusable(false);
        jbtnScissors.addActionListener(this::jbtnScissorsActionPerformed);
        jPanel1.add(jbtnScissors, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, 100));

        jlbltitle.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jlbltitle.setForeground(new java.awt.Color(236, 240, 241));
        jlbltitle.setText("Rock, Paper, Scissors");
        jlbltitle.setFocusable(false);
        jPanel1.add(jlbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jlblYou.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblYou.setForeground(new java.awt.Color(200, 208, 216));
        jlblYou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblYou.setText("You:");
        jlblYou.setFocusable(false);
        jPanel1.add(jlblYou, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jlblComputer.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jlblComputer.setForeground(new java.awt.Color(200, 208, 216));
        jlblComputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblComputer.setText("Computer:");
        jlblComputer.setFocusable(false);
        jPanel1.add(jlblComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jlblResult.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblResult.setForeground(new java.awt.Color(255, 176, 0));
        jlblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblResult.setText("Pick One!");
        jlblResult.setFocusable(false);
        jPanel1.add(jlblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jlblScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblScore.setForeground(new java.awt.Color(200, 208, 216));
        jlblScore.setText("Wins: 0  Losses: 0  Draws: 0");
        jlblScore.setFocusable(false);
        jPanel1.add(jlblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaperActionPerformed
playGame(2);
    }//GEN-LAST:event_jbtnPaperActionPerformed

    private void jbtnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRockActionPerformed
playGame(1);
    }//GEN-LAST:event_jbtnRockActionPerformed

    private void jbtnResetScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetScoreActionPerformed
    wins = 0;
    losses = 0;
    draws = 0;
    jlblYou.setText("You:");
    jlblComputer.setText("Computer:");
    jlblResult.setText("Pick One!");
    jlblScore.setText("Wins: 0  Losses: 0  Draws: 0");
    }//GEN-LAST:event_jbtnResetScoreActionPerformed

    private void jbtnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnScissorsActionPerformed
playGame(3);
    }//GEN-LAST:event_jbtnScissorsActionPerformed

    private void jbtnClearHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearHistoryActionPerformed
        History = "";
        jtxtHistory.setText("");
    }//GEN-LAST:event_jbtnClearHistoryActionPerformed

    private void jbtnSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSquareRootActionPerformed
        if (jtxtResult.getText().isEmpty()){
            return;
        }
        try{
            double n = Double.parseDouble(jtxtResult.getText());
            if (n < 0){
                jtxtResult.setText("Invalid input");
                newNumber = true;
                return;
            }
            double r = 0;
            if (n != 0){
                double guess = n / 2;
                for (int i = 0; i < 50; i++){
                    guess = (guess + n / guess) / 2;
                }
                r = guess;
            }
            addHistory("√" + formatNumber(n) + " = " + formatNumber(r));
            jtxtResult.setText(formatNumber(r));
            if (operationCase == null){
                newNumber = true;
            }
        }
        catch (NumberFormatException e){
        }
    }//GEN-LAST:event_jbtnSquareRootActionPerformed

    private void jbtnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSquareActionPerformed
        if (jtxtResult.getText().isEmpty()){
            return;
        }
        try{
            double n = Double.parseDouble(jtxtResult.getText());
            double r = n * n;

            addHistory(formatNumber(n) + "² = " + formatNumber(r));
            jtxtResult.setText(formatNumber(r));
            if (operationCase == null){
                newNumber = true;
            }
        }
        catch (NumberFormatException e){
        }
    }//GEN-LAST:event_jbtnSquareActionPerformed

    private void jbtnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHistoryActionPerformed
        if (jScrollPane1.isVisible()){
            jScrollPane1.setVisible(false);
            setSize(690,695);
        }
        else{
            jScrollPane1.setVisible(true);
            setSize(915, 695);
        }
    }//GEN-LAST:event_jbtnHistoryActionPerformed

    private void jbtnPercentActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPercentActionActionPerformed
        if (jtxtResult.getText().isEmpty()){
            return;
        }

        try{
            double n = Double.parseDouble(jtxtResult.getText());
            double r = n / 100;
            addHistory(formatNumber(n) + "% = " + formatNumber(r));
            jtxtResult.setText(formatNumber(r));
            if (operationCase == null){
                newNumber = true;
            }
        }
        catch (NumberFormatException e){
        }
    }//GEN-LAST:event_jbtnPercentActionActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        calculate();
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        setOperator("/");
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        EnterNumbers ("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPointActionPerformed
        if (newNumber || jtxtResult.getText().isEmpty()){
            jtxtResult.setText("0.");
            newNumber = false;
        }
        else if (!jtxtResult.getText().contains(".")){
            jtxtResult.setText(jtxtResult.getText() + ".");
        }
    }//GEN-LAST:event_jbtnPointActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        EnterNumbers ("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
        setOperator("*");
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        EnterNumbers ("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers ("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers ("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        setOperator("-");
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        EnterNumbers ("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers ("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumbers ("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        setOperator("+");
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumbers ("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers ("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtResult.setText("");
        NumEnter1 = 0;
        NumEnter2 = 0;
        Result = 0;
        operationCase = null;
        newNumber = false;
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusMinusActionPerformed
        String text = jtxtResult.getText();
        if (text.isEmpty()){
            return;
        }
        try{
            Double.parseDouble(text);
        }
        catch (NumberFormatException e){
            return;
        }
        if (operationCase != null && newNumber){
            return;
        }
        if (text.startsWith("-")){
            jtxtResult.setText(text.substring(1));
        }
        else if (!text.equals("0")){
            jtxtResult.setText("-" + text);
        }
    }//GEN-LAST:event_jbtnPlusMinusActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        if (newNumber){
            return;
        }
        String text = jtxtResult.getText();
        if (text.length() > 0){
            text = text.substring(0, text.length() - 1);
            if (text.equals("-")){
                text = "";
            }
            jtxtResult.setText(text);
        }
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        jtxtResult.setText("");
        newNumber = false;
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed

    }//GEN-LAST:event_jtxtResultActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new Calculator().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnClearHistory;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnHistory;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPaper;
    private javax.swing.JButton jbtnPercentAction;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPlusMinus;
    private javax.swing.JButton jbtnPoint;
    private javax.swing.JButton jbtnResetScore;
    private javax.swing.JButton jbtnRock;
    private javax.swing.JButton jbtnScissors;
    private javax.swing.JButton jbtnSquare;
    private javax.swing.JButton jbtnSquareRoot;
    private javax.swing.JLabel jlblComputer;
    private javax.swing.JLabel jlblResult;
    private javax.swing.JLabel jlblScore;
    private javax.swing.JLabel jlblYou;
    private javax.swing.JLabel jlbltitle;
    private javax.swing.JTextArea jtxtHistory;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
