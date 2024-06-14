import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        //caixas de diálogo
        JOptionPane.showMessageDialog(null,
                "Não há uma entrada aqui, apenas uma mensagem",
                "Título",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Está é uma pergunta?",
                "Título da caixa de diálogo",
                2,
                null,
                null,
                "Digite algo aqui.");
        
        
        String[] acceptableValues = {"Opção 1", "Opção 2", "Opção 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Está é uma pergunta?",
                "Título da caixa de diálogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
